println("running project/build.gradle.kts ...")

plugins {
    base
    kotlin("jvm") version "1.2.21" apply false // spec kotlin version cause this script running first
}

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath(deps.plugin.springBoot)
    }
}

allprojects {
    repositories {
        mavenCentral()
    }
}

println("running project/build.gradle.kts ... end")
