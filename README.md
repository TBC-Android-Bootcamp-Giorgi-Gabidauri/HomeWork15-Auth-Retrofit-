# HomeWork15-Auth-Retrofit-

# Auth via Retrofit


https://user-images.githubusercontent.com/66998427/184554593-6855c05b-b3c9-4a43-bc4e-f84ba71bedbb.mp4


# Used
- Dependency Injection,
- navigation,
- baseFragment
- baseUseCase
- repository
- Retrofit
- ResponseHandler<Generic>

# Dependencies
- module Gradle

    def nav_version = "2.5.1"
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

    def retrofit_version = "2.9.0"
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"

    implementation 'androidx.activity:activity-ktx:1.5.1'

    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'

    def koin_version = "3.1.2"
    implementation "io.insert-koin:koin-android:$koin_version"
    implementation "io.insert-koin:koin-android-compat:$koin_version"
    implementation "io.insert-koin:koin-core:$koin_version"

    implementation "androidx.preference:preference-ktx:1.2.0"
    
- plugins

    - id 'androidx.navigation.safeargs.kotlin'
    - id 'kotlin-parcelize'
    - id 'kotlin-kapt'
    
- appLVL Gradle

buildscript {
     repositories {
         google()
          mavenCentral()
      }
     dependencies {
          def nav_version = "2.5.0"
          classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
     }
 }
