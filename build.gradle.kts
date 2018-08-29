println("running project/build.gradle.kts ...")

plugins {
    base
    kotlin("jvm") version deps.plugin.kotlin apply false // spec kotlin version cause this script running first
}

buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath(deps.plugin.springBoot)
    }
}

allprojects {
    repositories {
        jcenter()
    }
}

println("running project/build.gradle.kts ... end")
