java_library(
    name = "avro",
    exports = [
        "//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
        "//3rdparty/jvm/org/apache/commons:commons_compress",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//3rdparty/jvm/org/tukaani:xz",
        "//3rdparty/jvm/org/xerial/snappy:snappy_java",
        "//external:jar/org/apache/avro/avro"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "avro_ipc",
    exports = [
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/avro/avro_ipc",
        ":avro"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "avro_mapred_jar_hadoop2",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/avro/avro_mapred_jar_hadoop2",
        ":avro_ipc"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


