java_library(
    name = "json4s_ast_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/org/json4s/json4s_ast_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "json4s_core_2_11",
    exports = [
        "//3rdparty/jvm/com/thoughtworks/paranamer:paranamer",
        "//3rdparty/jvm/org/scala_lang/modules:scala_xml_2_11",
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/org/json4s/json4s_core_2_11",
        ":json4s_ast_2_11",
        ":json4s_scalap_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "json4s_jackson_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/org/json4s/json4s_jackson_2_11",
        ":json4s_core_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "json4s_scalap_2_11",
    exports = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//external:jar/org/json4s/json4s_scalap_2_11"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


