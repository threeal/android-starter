plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.detekt)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ktfmt)
}

android {
    namespace = "com.example.counter"
    compileSdk = 37

    defaultConfig {
        applicationId = "com.example.counter"
        minSdk = 26
        targetSdk = 37
        versionCode = 1
        versionName = "0.1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(platform(libs.compose.bom))
    implementation(libs.activity.compose)
    implementation(libs.compose.material3)
    implementation(libs.lifecycle.viewmodel.compose)
    detektPlugins(libs.compose.rules.detekt)
    testImplementation(libs.kotlin.test.junit)
}

dependencyLocking { lockAllConfigurations() }

detekt {
    allRules = true
    buildUponDefaultConfig = true
    config.setFrom("detekt.yaml")
}

kotlin { compilerOptions { allWarningsAsErrors = true } }

ktfmt { kotlinLangStyle() }
