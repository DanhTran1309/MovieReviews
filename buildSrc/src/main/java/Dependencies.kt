import sun.misc.Version

object Release {
    const val versionCode = 1
    const val versionName = "1.0"
}

object SdkVersion {
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
}

object Versions {
    const val kotlin = "1.3.72"
    const val gradle = "4.0.1"

    const val coreKtx = "1.3.0"
    const val appCompat = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val lifecycle = "2.2.0"
    const val recyclerView = "1.1.0"
    const val nav = "2.3.0"
    const val paging = "2.1.2"
    const val material = "1.1.0"
    const val hilt = "2.28-alpha"

    const val junit = "4.12"
    const val extJunit = "1.1.1"
    const val espressoCore = "3.2.0"

    const val retrofit = "2.9.0"
    const val gson = "2.8.6"
    const val retrofitGsonConverter = "2.9.0"
    const val httpLoggingInterceptor = "4.8.0"
    const val glide = "4.11.0"
    const val rxjava = "3.0.4"
    const val rxandroid = "3.0.0"
    const val rxkotlin = "3.0.0"
}

object Libraries {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitGsonConverter}"
    const val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.httpLoggingInterceptor}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val rxjava = "io.reactivex.rxjava3:rxjava:${Versions.rxjava}"
    const val rxandroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxandroid}"
    const val rxkotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxkotlin}"
}

object AndroidLibraries {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav}"
    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

object KotlinLibraries {
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
