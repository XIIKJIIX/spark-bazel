java_library(
    name = "jersey_client",
    exports = [
        "//3rdparty/jvm/javax/ws/rs:javax_ws_rs_api",
        "//3rdparty/jvm/org/glassfish/hk2/external:javax_inject",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_api",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_locator",
        "//external:jar/org/glassfish/jersey/core/jersey_client",
        ":jersey_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jersey_common",
    exports = [
        "//3rdparty/jvm/javax/annotation:javax_annotation_api",
        "//3rdparty/jvm/javax/ws/rs:javax_ws_rs_api",
        "//3rdparty/jvm/org/glassfish/hk2/external:javax_inject",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_api",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_locator",
        "//3rdparty/jvm/org/glassfish/hk2:osgi_resource_locator",
        "//3rdparty/jvm/org/glassfish/jersey/bundles/repackaged:jersey_guava",
        "//external:jar/org/glassfish/jersey/core/jersey_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jersey_server",
    exports = [
        "//3rdparty/jvm/javax/annotation:javax_annotation_api",
        "//3rdparty/jvm/javax/validation:validation_api",
        "//3rdparty/jvm/javax/ws/rs:javax_ws_rs_api",
        "//3rdparty/jvm/org/glassfish/hk2/external:javax_inject",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_api",
        "//3rdparty/jvm/org/glassfish/hk2:hk2_locator",
        "//3rdparty/jvm/org/glassfish/jersey/media:jersey_media_jaxb",
        "//external:jar/org/glassfish/jersey/core/jersey_server",
        ":jersey_client",
        ":jersey_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


