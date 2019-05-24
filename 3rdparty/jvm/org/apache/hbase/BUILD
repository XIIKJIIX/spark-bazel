java_library(
    name = "hbase_client",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/commons:commons_crypto",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_auth",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_netty",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/htrace:htrace_core4",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/jruby/jcodings:jcodings",
        "//3rdparty/jvm/org/jruby/joni:joni",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_client",
        ":hbase_common",
        ":hbase_hadoop2_compat",
        ":hbase_hadoop_compat",
        ":hbase_protocol",
        ":hbase_protocol_shaded"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "hbase_common",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/github/stephenc/findbugs:findbugs_annotations",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/commons:commons_crypto",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/htrace:htrace_core4",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_common"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "hbase_hadoop2_compat",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_mapreduce_client_core",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_hadoop2_compat",
        ":hbase_common",
        ":hbase_hadoop_compat",
        ":hbase_metrics",
        ":hbase_metrics_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_hadoop_compat",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_hadoop_compat",
        ":hbase_metrics_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_http",
    exports = [
        "//3rdparty/jvm/javax/servlet:javax_servlet_api",
        "//3rdparty/jvm/javax/ws/rs:javax_ws_rs_api",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_auth",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_http",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_security",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_server",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_servlet",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_util",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_util_ajax",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_webapp",
        "//3rdparty/jvm/org/glassfish/jersey/containers:jersey_container_servlet_core",
        "//3rdparty/jvm/org/glassfish/jersey/core:jersey_server",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_http",
        ":hbase_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_mapreduce",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_hdfs",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_mapreduce_client_core",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_netty",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/htrace:htrace_core4",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_mapreduce",
        ":hbase_client",
        ":hbase_common",
        ":hbase_hadoop2_compat",
        ":hbase_hadoop_compat",
        ":hbase_metrics",
        ":hbase_metrics_api",
        ":hbase_protocol",
        ":hbase_protocol_shaded",
        ":hbase_replication",
        ":hbase_server",
        ":hbase_zookeeper"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "hbase_metrics",
    exports = [
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//external:jar/org/apache/hbase/hbase_metrics",
        ":hbase_common",
        ":hbase_metrics_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_metrics_api",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_metrics_api",
        ":hbase_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_procedure",
    exports = [
        "//3rdparty/jvm/com/github/stephenc/findbugs:findbugs_annotations",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_procedure",
        ":hbase_common",
        ":hbase_metrics_api",
        ":hbase_protocol_shaded"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_protocol",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_protocol"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_protocol_shaded",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//external:jar/org/apache/hbase/hbase_protocol_shaded"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_replication",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_replication",
        ":hbase_client",
        ":hbase_common",
        ":hbase_protocol_shaded",
        ":hbase_zookeeper"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_server",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/lmax:disruptor",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/javax/servlet/jsp:javax_servlet_jsp_api",
        "//3rdparty/jvm/javax/servlet:javax_servlet_api",
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/commons:commons_crypto",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/commons:commons_math3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_annotations",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_auth",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_client",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_distcp",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_hdfs",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_mapreduce_client_core",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_netty",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/htrace:htrace_core4",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_server",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_servlet",
        "//3rdparty/jvm/org/eclipse/jetty:jetty_webapp",
        "//3rdparty/jvm/org/glassfish/web:javax_servlet_jsp",
        "//3rdparty/jvm/org/jamon:jamon_runtime",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hbase/hbase_server",
        ":hbase_client",
        ":hbase_common",
        ":hbase_hadoop2_compat",
        ":hbase_hadoop_compat",
        ":hbase_http",
        ":hbase_metrics",
        ":hbase_metrics_api",
        ":hbase_procedure",
        ":hbase_protocol",
        ":hbase_protocol_shaded",
        ":hbase_replication",
        ":hbase_zookeeper"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hbase_zookeeper",
    exports = [
        "//3rdparty/jvm/junit:junit",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/commons:commons_lang3",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_auth",
        "//3rdparty/jvm/org/apache/hadoop:hadoop_common",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_miscellaneous",
        "//3rdparty/jvm/org/apache/hbase/thirdparty:hbase_shaded_protobuf",
        "//3rdparty/jvm/org/apache/yetus:audience_annotations",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hbase/hbase_zookeeper",
        ":hbase_client",
        ":hbase_common",
        ":hbase_hadoop2_compat",
        ":hbase_hadoop_compat",
        ":hbase_protocol_shaded"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


