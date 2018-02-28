println("running buildSrc/build.gradle.kts ...")

plugins {
    // 0.14.2 maps to kotlin 1.2.0
    // 0.15.6 maps to kotlin 1.2.21
    id("org.gradle.kotlin.kotlin-dsl") version "0.15.6"
}

println("running buildSrc/build.gradle.kts ... end")
