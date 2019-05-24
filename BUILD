scala_binary(
    name = "hellobz",
    srcs = glob(["src/main/scala/**/*.scala"]),
    main_class = "Main",
    deps = [
        "//3rdparty/jvm/org/apache/spark:spark_sql",
        "//3rdparty/jvm/org/apache/hbase:hbase_client",
        "//3rdparty/jvm/org/apache/hbase:hbase_common",
        "//3rdparty/jvm/org/apache/hbase:hbase_mapreduce",
        ],
    visibility = ["//visibility:public"],
)
