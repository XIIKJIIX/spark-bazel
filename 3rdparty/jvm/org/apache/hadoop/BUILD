java_library(
    name = "hadoop_annotations",
    exports = [
        "//external:jar/org/apache/hadoop/hadoop_annotations"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_auth",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/curator:curator_framework",
        "//3rdparty/jvm/org/apache/directory/server:apacheds_kerberos_codec",
        "//3rdparty/jvm/org/apache/httpcomponents:httpclient",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_auth"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_client",
    exports = [
        "//external:jar/org/apache/hadoop/hadoop_client",
        ":hadoop_annotations",
        ":hadoop_common",
        ":hadoop_hdfs",
        ":hadoop_mapreduce_client_app",
        ":hadoop_mapreduce_client_core",
        ":hadoop_mapreduce_client_jobclient",
        ":hadoop_yarn_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_common",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/google/code/gson:gson",
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/jcraft:jsch",
        "//3rdparty/jvm/com/sun/jersey:jersey_json",
        "//3rdparty/jvm/com/sun/jersey:jersey_server",
        "//3rdparty/jvm/commons_cli:commons_cli",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_collections:commons_collections",
        "//3rdparty/jvm/commons_configuration:commons_configuration",
        "//3rdparty/jvm/commons_httpclient:commons_httpclient",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/commons_logging:commons_logging",
        "//3rdparty/jvm/commons_net:commons_net",
        "//3rdparty/jvm/javax/servlet/jsp:jsp_api",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/net/java/dev/jets3t:jets3t",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/apache/commons:commons_compress",
        "//3rdparty/jvm/org/apache/commons:commons_math3",
        "//3rdparty/jvm/org/apache/curator:curator_client",
        "//3rdparty/jvm/org/apache/curator:curator_recipes",
        "//3rdparty/jvm/org/apache/htrace:htrace_core",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/mortbay/jetty:jetty",
        "//3rdparty/jvm/org/mortbay/jetty:jetty_sslengine",
        "//3rdparty/jvm/org/mortbay/jetty:jetty_util",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//3rdparty/jvm/xmlenc:xmlenc",
        "//external:jar/org/apache/hadoop/hadoop_common",
        ":hadoop_annotations",
        ":hadoop_auth"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_distcp",
    exports = [
        "//external:jar/org/apache/hadoop/hadoop_distcp"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_hdfs",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/sun/jersey:jersey_core",
        "//3rdparty/jvm/com/sun/jersey:jersey_server",
        "//3rdparty/jvm/commons_cli:commons_cli",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_daemon:commons_daemon",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/commons_logging:commons_logging",
        "//3rdparty/jvm/io/netty:netty",
        "//3rdparty/jvm/io/netty:netty_all",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/htrace:htrace_core",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//3rdparty/jvm/org/mortbay/jetty:jetty",
        "//3rdparty/jvm/org/mortbay/jetty:jetty_util",
        "//3rdparty/jvm/xerces:xercesImpl",
        "//3rdparty/jvm/xmlenc:xmlenc",
        "//external:jar/org/apache/hadoop/hadoop_hdfs"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_mapreduce_client_app",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_mapreduce_client_app",
        ":hadoop_mapreduce_client_common",
        ":hadoop_mapreduce_client_shuffle"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_mapreduce_client_common",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_mapreduce_client_common",
        ":hadoop_mapreduce_client_core",
        ":hadoop_yarn_client",
        ":hadoop_yarn_common",
        ":hadoop_yarn_server_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_mapreduce_client_core",
    exports = [
        "//3rdparty/jvm/com/google/inject/extensions:guice_servlet",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/io/netty:netty",
        "//3rdparty/jvm/org/apache/avro:avro",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_mapreduce_client_core",
        ":hadoop_annotations",
        ":hadoop_yarn_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_mapreduce_client_jobclient",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_mapreduce_client_jobclient",
        ":hadoop_mapreduce_client_common",
        ":hadoop_mapreduce_client_shuffle"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_mapreduce_client_shuffle",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/slf4j:slf4j_log4j12",
        "//external:jar/org/apache/hadoop/hadoop_mapreduce_client_shuffle",
        ":hadoop_mapreduce_client_common",
        ":hadoop_yarn_server_common",
        ":hadoop_yarn_server_nodemanager"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_yarn_api",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/commons_logging:commons_logging",
        "//external:jar/org/apache/hadoop/hadoop_yarn_api",
        ":hadoop_annotations"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_yarn_client",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/commons_cli:commons_cli",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/log4j:log4j",
        "//external:jar/org/apache/hadoop/hadoop_yarn_client",
        ":hadoop_yarn_api",
        ":hadoop_yarn_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_yarn_common",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/inject/extensions:guice_servlet",
        "//3rdparty/jvm/com/google/inject:guice",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/sun/jersey/contribs:jersey_guice",
        "//3rdparty/jvm/com/sun/jersey:jersey_client",
        "//3rdparty/jvm/com/sun/jersey:jersey_core",
        "//3rdparty/jvm/com/sun/jersey:jersey_json",
        "//3rdparty/jvm/com/sun/jersey:jersey_server",
        "//3rdparty/jvm/commons_cli:commons_cli",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_io:commons_io",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/commons_logging:commons_logging",
        "//3rdparty/jvm/javax/servlet:servlet_api",
        "//3rdparty/jvm/javax/xml/bind:jaxb_api",
        "//3rdparty/jvm/log4j:log4j",
        "//3rdparty/jvm/org/apache/commons:commons_compress",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_jaxrs",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_xc",
        "//3rdparty/jvm/org/mortbay/jetty:jetty_util",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hadoop/hadoop_yarn_common",
        ":hadoop_annotations",
        ":hadoop_yarn_api"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_yarn_server_common",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//external:jar/org/apache/hadoop/hadoop_yarn_server_common",
        ":hadoop_yarn_api",
        ":hadoop_yarn_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hadoop_yarn_server_nodemanager",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/com/google/inject:guice",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/sun/jersey/contribs:jersey_guice",
        "//3rdparty/jvm/com/sun/jersey:jersey_client",
        "//3rdparty/jvm/com/sun/jersey:jersey_core",
        "//3rdparty/jvm/com/sun/jersey:jersey_json",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/javax/servlet:servlet_api",
        "//3rdparty/jvm/javax/xml/bind:jaxb_api",
        "//3rdparty/jvm/org/codehaus/jettison:jettison",
        "//3rdparty/jvm/org/fusesource/leveldbjni:leveldbjni_all",
        "//3rdparty/jvm/org/mortbay/jetty:jetty_util",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/hadoop/hadoop_yarn_server_nodemanager",
        ":hadoop_yarn_api",
        ":hadoop_yarn_common",
        ":hadoop_yarn_server_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


