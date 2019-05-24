java_library(
    name = "jetty_http",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_http",
        ":jetty_util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_io",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_io",
        ":jetty_util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_security",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_security",
        ":jetty_server"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_server",
    exports = [
        "//3rdparty/jvm/javax/servlet:javax_servlet_api",
        "//external:jar/org/eclipse/jetty/jetty_server",
        ":jetty_http",
        ":jetty_io"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_servlet",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_servlet",
        ":jetty_security"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_util",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_util_ajax",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_util_ajax",
        ":jetty_util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_webapp",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_webapp",
        ":jetty_servlet",
        ":jetty_xml"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "jetty_xml",
    exports = [
        "//external:jar/org/eclipse/jetty/jetty_xml",
        ":jetty_util"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


