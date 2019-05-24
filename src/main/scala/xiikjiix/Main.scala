package src.main.scala.xiikjiix

import org.apache.hadoop.hbase.HBaseConfiguration
import org.apache.hadoop.hbase.io.ImmutableBytesWritable
import org.apache.hadoop.hbase.mapreduce.TableOutputFormat
import org.apache.hadoop.mapreduce.Job
import org.apache.spark.sql.SparkSession

import scala.util.{Success, Try}


object Main {
  def main(args: Array[String]): Unit = {
    val inputFiles = args(0)

    val spliters = List(":", ";")
    val spark = SparkSession
      .builder()
      .appName("Pazz")
      .getOrCreate()

    val pazz = spark.sparkContext
      .wholeTextFiles(inputFiles, 4)
      .flatMap(_._2.split("\\r?\\n"))

    val kv = pazz.map { s =>
      spliters.map(sp => Try(kvBy(s, sp)))
        .collectFirst {
          case Success(value) => value
        }
    }.flatMap(x => x)

    val hbaseConf = HBaseConfiguration.create()
    val job = Job.getInstance(hbaseConf)
    job.setOutputFormatClass(classOf[TableOutputFormat[ImmutableBytesWritable]])
    job.getConfiguration.set(TableOutputFormat.OUTPUT_TABLE, "pazz")
  }

  private def kvBy(input: String, regex: String) = {
    val entry = input.split(regex)
    (entry(0), entry(1))
  }
}
