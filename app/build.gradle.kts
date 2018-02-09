println("running app/build.gradle.kts ...")

plugins {
    // use id
    id("java")
    id("application")
    id("org.springframework.boot")

    kotlin("jvm")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClassName = "com.fionera.test.Application"
}

group = "com.fionera.spring_demo"
version = "0.0.5-SNAPSHOT"

dependencies {
    compile(deps.dependencies.springBootWebStarter)
    compile(deps.dependencies.springBootMyBatisStarter)
    compile(deps.dependencies.mysqlJDBC)
    compile(deps.dependencies.guaua)
    compile(deps.dependencies.druid)

//    compile(kotlin("stdlib-jre8")) // using global spec will cause duplicated versions, which has 1.2.0 from kotlin-dsl

    runtime(deps.dependencies.springBootTomcatStarter)

    testCompile(deps.dependencies.springBootTestStarter)
}

println("running app/build.gradle.kts ... end")
