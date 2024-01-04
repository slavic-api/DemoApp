package slavic_api.github.io.slavicmythologyapi.data.manager


import slavic_api.github.io.slavicmythologyapi.data.repository.DataRepository

class DataManager(private val dataRepository: DataRepository) {
    fun getDeities() = dataRepository.getDeities()
    fun getDeityDetails(id: String) = dataRepository.getDeityDetails(id)
}
