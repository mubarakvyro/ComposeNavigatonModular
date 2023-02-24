plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.hilt)
//    alias(libs.plugins.google.firebase)
//    alias(libs.plugins.kotlin.serialization)
    id("kotlin-kapt")
//    id("kotlin-parcelize")
}

android {
    namespace = "com.framework"
    compileSdk = libs.versions.sdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.sdk.get().toInt()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.v.get()
        kotlinCompilerVersion = libs.versions.kotlin.compiler.version.v.get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

//    coreLibraryDesugaring(libs.jdk.desugaring)

    api(libs.bundles.android.core)
    api(libs.bundles.android.lifecycle)

    api(libs.bundles.compose)
    debugImplementation(libs.bundles.compose.debug)

    api(libs.bundles.accompanist)
    api(libs.coroutines)

//    api(platform(libs.firebase.platform))
//    api(libs.bundles.firebase.common)
//    api(libs.firebase.config)

    implementation(libs.bundles.di)
    kapt(libs.bundles.di.kapt)

//    api(libs.bundles.networking)
//    api(libs.bundles.serialization)
//    kapt(libs.bundles.service.kapt)
//
//    api 'androidx.core:core-ktx:1.8.0'
//    api "androidx.compose.ui:ui:$compose_version"
//    //noinspection GradleDependency
//    api "androidx.compose.material:material:$compose_version"
//    api "androidx.compose.ui:ui-tooling-preview:$compose_version"
//    api 'androidx.activity:activity-compose:1.6.0'
//    testApi 'junit:junit:4.13.2'
//    testApi 'com.google.truth:truth:1.1.3'
//    androidTestApi 'androidx.test.ext:junit:1.1.3'
//    androidTestApi 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestApi 'com.google.truth:truth:1.1.3'
//    androidTestApi "androidx.compose.ui:ui-test-junit4:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_version"
//
//
//    /** Compose navigation */
//    def compose_navigation_version = "2.5.1"
//    api "androidx.navigation:navigation-compose:$compose_navigation_version"
//
//    // Ktor
//    def core_ktor_version = '1.5.0'
//    api "io.ktor:ktor-client-core:$core_ktor_version"
//    def android_ktor_version = "1.6.3"
//    api "io.ktor:ktor-client-android:$android_ktor_version"
//    api "io.ktor:ktor-client-serialization:$core_ktor_version"
//    api "io.ktor:ktor-client-logging:$core_ktor_version"
//    api "io.ktor:ktor-client-auth:$core_ktor_version"
//    api "ch.qos.logback:logback-classic:1.2.3"
//    api "org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.0"
//
//    // Truth
//    def truth_version = "1.1.3"
//    testImplementation "com.google.truth:truth:$truth_version"
//    androidTestImplementation "com.google.truth:truth:$truth_version"
//
//    // Timber
//    def timber_version = "5.0.1"
//    api "com.jakewharton.timber:timber:$timber_version"
//
//    // Coroutines
//    def core_coroutine_version = "1.6.1"
//    api "org.jetbrains.kotlinx:kotlinx-coroutines-core:$core_coroutine_version"
//    def android_coroutine_version = "1.6.4"
//    api "org.jetbrains.kotlinx:kotlinx-coroutines-android:$android_coroutine_version"
//
//    // Coroutine Lifecycle Scopes
//    def lifecycle_version = "2.5.1"
//    api "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
//    api "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version"
//
//    // compose coil to load images
//    def compose_coil_version = "2.2.0"
//    api "io.coil-kt:coil-compose:$compose_coil_version"
//    api "io.coil-kt:coil-svg:$compose_coil_version"
//
//    //Dagger - Hilt
//    api "com.google.dagger:hilt-android:$hilt_plugin_version"
//    kapt "com.google.dagger:hilt-android-compiler:$hilt_plugin_version"
//    kapt "androidx.hilt:hilt-compiler:1.0.0"
//    api 'androidx.hilt:hilt-navigation-compose:1.0.0'
//
//    // Room
//    def room_version = "2.4.3"
//    api "androidx.room:room-runtime:$room_version"
//    kapt "androidx.room:room-compiler:$room_version"
//    api "androidx.room:room-ktx:$room_version"
//    androidTestImplementation "androidx.room:room-testing:$room_version"
//    annotationProcessor "androidx.room:room-compiler:$room_version"
//
//    // live data with compose
//    def compose_livedata = "1.2.1"
//    api "androidx.compose.runtime:runtime-livedata:$compose_livedata"
//
//    // Lotti file
//    def lottie_files = "5.2.0"
//    api "com.airbnb.android:lottie-compose:$lottie_files"
//
//    // accompanist - Placeholder
//    def accompanist_placeholder = "0.26.1-alpha"
//    api "com.google.accompanist:accompanist-placeholder:$accompanist_placeholder"
//
//    // accompanist - PagerView
//    def accompanist_pager = "0.26.1-alpha"
//    api "com.google.accompanist:accompanist-pager:$accompanist_pager"
//    api "com.google.accompanist:accompanist-pager-indicators:$accompanist_pager"
//
//    api("androidx.compose.material3:material3:1.0.0-rc01")
//    api("androidx.compose.material3:material3-window-size-class:1.0.0-rc01")
//    // Data store
//    def data_store_version = "1.0.0"
//    api "androidx.datastore:datastore-preferences:$data_store_version"
//
//    // WhatIf
//    api "com.github.skydoves:whatif:1.1.1"
}