plugins {
    id("com.android.application")
    kotlin("android")
}

val compose_version = "1.1.1"
val ktor_version = "2.0.0-beta-1"

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.example.ktortutorial101.android"
        minSdk = 24
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = compose_version
    }
    testOptions {
        unitTests {
            isReturnDefaultValues = true
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.activity:activity-compose:1.4.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.compose.material:material:$compose_version")
    implementation("androidx.compose.material:material-icons-extended:$compose_version")
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.runtime:runtime:$compose_version")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose_version")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.17.0")
    implementation("com.google.android.material:material:1.5.0")
    implementation("com.github.skydoves:landscapist-coil:1.4.9")
    implementation("io.coil-kt:coil-compose:2.0.0-rc01")
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("com.squareup.picasso:picasso:2.71828")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:$compose_version")
    debugImplementation("androidx.compose.ui:ui-tooling:$compose_version")
}