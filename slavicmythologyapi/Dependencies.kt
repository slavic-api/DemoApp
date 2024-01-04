package slavic_api.github.io.demoapplication.dependencies

object Versions {
    const val kotlin = "1.5.30" // Kotlin version
    const val retrofit = "2.9.0" // Retrofit version
    const val okhttp = "4.9.1"   // OkHttp version
}

object Dependencies {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    // Gson converter for Retrofit
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
}

object Plugins {
    const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}
