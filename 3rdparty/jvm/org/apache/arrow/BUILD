java_library(
    name = "arrow_format",
    exports = [
        "//3rdparty/jvm/com/vlkan:flatbuffers",
        "//external:jar/org/apache/arrow/arrow_format"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "arrow_memory",
    exports = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/arrow/arrow_memory"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "arrow_vector",
    exports = [
        "//3rdparty/jvm/com/carrotsearch:hppc",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/google/code/findbugs:jsr305",
        "//3rdparty/jvm/com/vlkan:flatbuffers",
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/joda_time:joda_time",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/arrow/arrow_vector",
        ":arrow_format",
        ":arrow_memory"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


