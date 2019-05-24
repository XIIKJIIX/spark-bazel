java_library(
    name = "hk2_api",
    exports = [
        "//3rdparty/jvm/javax/inject:javax_inject",
        "//3rdparty/jvm/org/glassfish/hk2/external:aopalliance_repackaged",
        "//external:jar/org/glassfish/hk2/hk2_api",
        ":hk2_utils"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hk2_locator",
    exports = [
        "//3rdparty/jvm/org/glassfish/hk2/external:aopalliance_repackaged",
        "//3rdparty/jvm/org/glassfish/hk2/external:javax_inject",
        "//3rdparty/jvm/org/javassist:javassist",
        "//external:jar/org/glassfish/hk2/hk2_locator",
        ":hk2_api",
        ":hk2_utils"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "hk2_utils",
    exports = [
        "//3rdparty/jvm/javax/inject:javax_inject",
        "//external:jar/org/glassfish/hk2/hk2_utils"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "osgi_resource_locator",
    exports = [
        "//external:jar/org/glassfish/hk2/osgi_resource_locator"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


