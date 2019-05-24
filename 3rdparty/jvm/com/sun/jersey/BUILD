java_library(
    name = "jersey_client",
    exports = [
        "//external:jar/com/sun/jersey/jersey_client",
        ":jersey_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jersey_core",
    exports = [
        "//external:jar/com/sun/jersey/jersey_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jersey_json",
    exports = [
        "//3rdparty/jvm/com/sun/xml/bind:jaxb_impl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_core_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_jaxrs",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_mapper_asl",
        "//3rdparty/jvm/org/codehaus/jackson:jackson_xc",
        "//3rdparty/jvm/org/codehaus/jettison:jettison",
        "//external:jar/com/sun/jersey/jersey_json",
        ":jersey_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jersey_server",
    exports = [
        "//3rdparty/jvm/asm:asm",
        "//external:jar/com/sun/jersey/jersey_server",
        ":jersey_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


