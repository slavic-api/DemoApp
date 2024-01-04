package slavic_api.github.io.slavicmythologyapi.data.service

import retrofit2.http.GET
import retrofit2.http.Path
import slavic_api.github.io.slavicmythologyapi.data.model.Deity

interface ApiService {
    @GET("deities_list.json")
    fun getDeities(): retrofit2.Call<List<Deity>>

    @GET("deities/{id}.json")
    fun getDeityDetails(@Path("id") id: String): retrofit2.Call<Deity>
}