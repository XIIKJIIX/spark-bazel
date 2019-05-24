java_library(
    name = "curator_client",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/org/apache/curator/curator_client"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "curator_framework",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//external:jar/org/apache/curator/curator_framework",
        ":curator_client"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "curator_recipes",
    exports = [
        "//3rdparty/jvm/com/google/guava:guava",
        "//3rdparty/jvm/org/apache/zookeeper:zookeeper",
        "//external:jar/org/apache/curator/curator_recipes",
        ":curator_framework"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


