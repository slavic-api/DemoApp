package slavic_api.github.io.slavicmythologyapi.data.repository

import slavic_api.github.io.slavicmythologyapi.data.model.Deity
import slavic_api.github.io.slavicmythologyapi.data.service.ApiService
import slavic_api.github.io.slavicmythologyapi.util.NetworkUtil

class DataRepository(private val apiService: ApiService) {
    fun getDeities(): NetworkUtil.Result<List<Deity>> {
        return NetworkUtil.safeApiCall { apiService.getDeities().execute().body() ?: emptyList() }
    }

    fun getDeityDetails(id: String): NetworkUtil.Result<Deity> {
        return NetworkUtil.safeApiCall { apiService.getDeityDetails(id).execute().body() ?: Deity() }
    }
}