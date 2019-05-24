java_library(
    name = "orc_core_jar_nohive",
    exports = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//3rdparty/jvm/io/airlift:aircompressor",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/orc/orc_core_jar_nohive",
        ":orc_shims"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "orc_mapreduce_jar_nohive",
    exports = [
        "//3rdparty/jvm/commons_codec:commons_codec",
        "//3rdparty/jvm/commons_lang:commons_lang",
        "//external:jar/org/apache/orc/orc_mapreduce_jar_nohive"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "orc_shims",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/orc/orc_shims"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


