scala_import(
    name = "spark_catalyst",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/org/antlr:antlr4_runtime",
        "//3rdparty/jvm/org/codehaus/janino:commons_compiler",
        "//3rdparty/jvm/org/codehaus/janino:janino",
        "//3rdparty/jvm/org/scala_lang/modules:scala_parser_combinators_2_11",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        ":spark_core",
        ":spark_sketch_2_11",
        ":spark_tags_2_11",
        ":spark_unsafe_2_11"
    ],
    jars = [
        "//external:jar/org/apache/spark/spark_catalyst_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "spark_core",
    exports = [
        "//3rdparty/jvm/com/clearspring/analytics:stream",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/fasterxml/jackson/module:jackson_module_scala_2_11",
        "//3rdparty/jvm/com/github/luben:zstd_jni",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/ning:compress_lzf",
        "//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
        "//3rdparty/jvm/com/twitter:chill_2_11",
        "//3rdparty/jvm/com/twitter:chill_java",
        "//3rdparty/jvm/commons_net:commons_net",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_graphite",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_json",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_jvm",
        "//3rdparty/jvm/io/netty:netty",
        "//3rdparty/jvm/io/netty:netty_all",
        "//3rdparty/jvm/javax/activation:activation",
        "//3rdparty/jvm/javax/servlet:javax_servlet_api",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/net/razorvine:pyrolite",
        "//3rdparty/jvm/net/sf/py4j:py4j",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/apache/avro:avro_mapred_jar_hadoop2",
        "//3rdparty/jvm/org/apache/commons:commons_crypto",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/commons:commons_math3",
        "//3rdparty/jvm/org/apache/curator:curator_recipes",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_client",
        "//3rdparty/jvm/org/apache/ivy:ivy",
        "//3rdparty/jvm/org/apache/xbean:xbean_asm6_shaded",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/glassfish/jersey/containers:jersey_container_servlet",
        "//3rdparty/jvm/org/glassfish/jersey/containers:jersey_container_servlet_core",
        "//3rdparty/jvm/org/glassfish/jersey/core:jersey_client",
        "//3rdparty/jvm/org/glassfish/jersey/core:jersey_common",
        "//3rdparty/jvm/org/glassfish/jersey/core:jersey_server",
        "//3rdparty/jvm/org/json4s:json4s_jackson_2_11",
        "//3rdparty/jvm/org/lz4:lz4_java",
        "//3rdparty/jvm/org/roaringbitmap:RoaringBitmap",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/slf4j:jcl_over_slf4j",
        "//3rdparty/jvm/org/slf4j:jul_to_slf4j",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//3rdparty/jvm/org/xerial/snappy:snappy_java",
        "//3rdparty/jvm/oro:oro",
        ":spark_kvstore_2_11",
        ":spark_launcher_2_11",
        ":spark_network_common_2_11",
        ":spark_network_shuffle_2_11",
        ":spark_tags_2_11",
        ":spark_unsafe_2_11"
    ],
    jars = [
        "//external:jar/org/apache/spark/spark_core_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spark_kvstore_2_11",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_kvstore_2_11",
        ":spark_tags_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "spark_launcher_2_11",
    exports = [
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_launcher_2_11",
        ":spark_tags_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "spark_network_common_2_11",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/io/netty:netty_all",
        "//3rdparty/jvm/org/apache/commons:commons_crypto",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_network_common_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "spark_network_shuffle_2_11",
    exports = [
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_network_shuffle_2_11",
        ":spark_network_common_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "spark_sketch_2_11",
    exports = [
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_sketch_2_11",
        ":spark_tags_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "spark_sql",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/univocity:univocity_parsers",
        "//3rdparty/jvm/org/apache/arrow:arrow_vector",
        "//3rdparty/jvm/org/apache/orc:orc_core_jar_nohive",
        "//3rdparty/jvm/org/apache/orc:orc_mapreduce_jar_nohive",
        "//3rdparty/jvm/org/apache/parquet:parquet_column",
        "//3rdparty/jvm/org/apache/parquet:parquet_hadoop",
        "//3rdparty/jvm/org/apache/xbean:xbean_asm6_shaded",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        ":spark_catalyst",
        ":spark_core",
        ":spark_sketch_2_11",
        ":spark_tags_2_11"
    ],
    jars = [
        "//external:jar/org/apache/spark/spark_sql_2_11"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "spark_tags_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_tags_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "spark_unsafe_2_11",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/twitter:chill_2_11",
        "//3rdparty/jvm/org/spark_project/spark:unused",
        "//external:jar/org/apache/spark/spark_unsafe_2_11",
        ":spark_tags_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


