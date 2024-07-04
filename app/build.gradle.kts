plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.exmobile_zem"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.exmobile_zem"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    //на выбор(подгрузка картинок):
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("io.coil-kt:coil:2.6.0")
    //работа со фрагментами:
    implementation("androidx.fragment:fragment-ktx:1.8.1")

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}