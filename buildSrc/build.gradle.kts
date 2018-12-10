println("running buildSrc/build.gradle.kts ...")

// since 1.0-rc3, the kotlin-dsl plugin requires a repository to be declared
repositories {
    jcenter()
}

plugins {
//    0.14.2 maps to kotlin 1.2.00 within gradle 4.5 rc1
//    0.15.6 maps to kotlin 1.2.21 within gradle 4.6 rc1
//    0.16.3 maps to kotlin 1.2.31 within gradle 4.7 rc1
//    1.0.2 doesnt pin kotlin dependency within gradle 5.0 rc2
//    id("org.gradle.kotlin.kotlin-dsl") version "0.16.3"
    `kotlin-dsl` // within newest is "1.0.4"
}

println("running buildSrc/build.gradle.kts ... end")
