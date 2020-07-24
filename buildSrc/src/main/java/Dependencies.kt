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

    const val junit = "4.12"
    const val extJunit = "1.1.1"
    const val espressoCore = "3.2.0"
}

object Dependencies {
    const val buildGradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libraries {

}

object AndroidLibraries {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object KotlinLibraries {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}
