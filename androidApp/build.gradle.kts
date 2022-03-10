plugins {
    id("com.android.application")
    kotlin("android")
}

val ktor_version = "2.0.0-beta-1"

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.example.ktortutorial101.android"
        minSdk = 24
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("io.ktor:ktor-client-core:$ktor_version")
}