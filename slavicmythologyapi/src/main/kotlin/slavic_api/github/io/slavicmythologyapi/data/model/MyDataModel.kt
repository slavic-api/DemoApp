package slavic_api.github.io.slavicmythologyapi.data.model

class MyDataModel {
    // placeholder for a huge json
}

data class Deity(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val attributes: Attributes = Attributes(),
    val image: String = ""
)

data class Attributes(
    val domains: List<String> = emptyList(),
    val symbols: List<String> = emptyList(),
    val element: String = "",
    val associatedConcepts: List<String> = emptyList()
)
