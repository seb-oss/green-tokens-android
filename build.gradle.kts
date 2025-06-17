// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.dokka)
    alias(libs.plugins.vanniktech.maven.publish) apply false
}

subprojects {
    plugins.apply("org.jetbrains.dokka")
}