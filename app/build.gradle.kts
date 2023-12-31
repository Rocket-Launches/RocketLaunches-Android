plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  id("com.google.devtools.ksp")
  id("com.google.dagger.hilt.android")
}

android {
  namespace = "dev.patogordo.rocketlaunches"
  compileSdk = 34

  defaultConfig {
    applicationId = "dev.patogordo.rocketlaunches"
    minSdk = 25
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    vectorDrawables {
      useSupportLibrary = true
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions {
    jvmTarget = "17"
  }

  buildFeatures {
    compose = true
  }

  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.3"
  }

  packaging {
    resources {
      excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
  }
}

dependencies {
  // Layout Libs
  implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
  implementation("androidx.navigation:navigation-compose:2.7.5")
  /* images */
  implementation("io.coil-kt:coil-compose:2.5.0")
  /* icons */
  implementation("androidx.compose.material:material-icons-extended")
  /* animations */
  implementation("com.airbnb.android:lottie-compose:6.2.0")

  // Api Request Libs
  implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")
  implementation("com.squareup.retrofit2:retrofit:2.9.0")
  implementation("com.squareup.retrofit2:converter-gson:2.9.0")

  // MVVM Libs
  implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
  implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")

  // (DI) Dependency Injection Libs
  implementation("javax.inject:javax.inject:1")
  implementation("com.google.dagger:hilt-android:2.48.1")
  implementation("androidx.hilt:hilt-navigation-compose:1.1.0")
  implementation("androidx.wear.compose:compose-material:1.2.1")
  ksp("com.google.dagger:hilt-compiler:2.48.1")

  // CO-Routines
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

  implementation("androidx.core:core-ktx:1.12.0")
  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
  implementation("androidx.activity:activity-compose:1.8.1")
  implementation(platform("androidx.compose:compose-bom:2023.03.00"))
  implementation("androidx.compose.ui:ui")
  implementation("androidx.compose.ui:ui-graphics")
  implementation("androidx.compose.ui:ui-tooling-preview")
  implementation("androidx.compose.material3:material3")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
  androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
  androidTestImplementation("androidx.compose.ui:ui-test-junit4")
  debugImplementation("androidx.compose.ui:ui-tooling")
  debugImplementation("androidx.compose.ui:ui-test-manifest")
}
