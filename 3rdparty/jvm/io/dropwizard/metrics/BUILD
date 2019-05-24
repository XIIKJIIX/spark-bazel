java_library(
    name = "metrics_core",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/io/dropwizard/metrics/metrics_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "metrics_graphite",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/io/dropwizard/metrics/metrics_graphite",
        ":metrics_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "metrics_json",
    exports = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/io/dropwizard/metrics/metrics_json",
        ":metrics_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "metrics_jvm",
    exports = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        "//external:jar/io/dropwizard/metrics/metrics_jvm",
        ":metrics_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


