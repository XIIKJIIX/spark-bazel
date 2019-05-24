java_library(
    name = "parquet_column",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//external:jar/org/apache/parquet/parquet_column",
        ":parquet_common",
        ":parquet_encoding"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parquet_common",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/parquet/parquet_common",
        ":parquet_format"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parquet_encoding",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//external:jar/org/apache/parquet/parquet_encoding",
        ":parquet_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parquet_format",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/parquet/parquet_format"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parquet_hadoop",
    exports = [
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/xerial/snappy:snappy_java",
        "//external:jar/org/apache/parquet/parquet_hadoop",
        ":parquet_column",
        ":parquet_format",
        ":parquet_jackson"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "parquet_jackson",
    exports = [
        "//external:jar/org/apache/parquet/parquet_jackson"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


