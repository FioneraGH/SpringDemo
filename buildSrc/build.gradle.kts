println("running buildSrc/build.gradle.kts ...")

plugins {
//    0.14.2 maps to kotlin 1.2.00 within gradle 4.5 rc1
//    0.15.6 maps to kotlin 1.2.21 within gradle 4.6 rc1
//    0.16.3 maps to kotlin 1.2.31 within gradle 4.7 rc1
//    id("org.gradle.kotlin.kotlin-dsl") version "0.16.3"
    `kotlin-dsl`
}

println("running buildSrc/build.gradle.kts ... end")
