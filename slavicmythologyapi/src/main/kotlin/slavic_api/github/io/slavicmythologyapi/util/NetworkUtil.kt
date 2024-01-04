package slavic_api.github.io.slavicmythologyapi.util

import retrofit2.HttpException
import java.io.IOException

object NetworkUtil {
    fun <T> safeApiCall(apiCall: () -> T): Result<T> {
        return try {
            Result.Success(apiCall())
        } catch (throwable: Throwable) {
            Result.Error(handleNetworkError(throwable))
        }
    }

    private fun handleNetworkError(throwable: Throwable): String {
        return when (throwable) {
            is IOException -> "Network connection error. Please check your internet connection."
            is HttpException -> {
                val errorCode = throwable.code()
                "Network error occurred: HTTP $errorCode ${throwable.message()}"
            }

            else -> "An unexpected error occurred."
        }
    }

    sealed class Result<out T> {
        data class Success<out T>(val data: T) : Result<T>()
        data class Error(val errorMessage: String) : Result<Nothing>()
    }

}