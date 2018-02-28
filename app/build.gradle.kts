println("running app/build.gradle.kts ...")

plugins {
    // use id
    id("java")
    id("application")
    id("org.springframework.boot")

    war

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
version = "0.1.0"

dependencies {
    compile(deps.dependencies.springBootWebStarter)
    compile(deps.dependencies.springBootMyBatisStarter)
    compile(deps.dependencies.mysqlJDBC)
    compile(deps.dependencies.guaua)
    compile(deps.dependencies.druid)

    /*
     Using global spec will cause duplicated versions.
     buildSrc has 1.2.0 from kotlin-dsl.
     But this has no side effect when we use kotlin in compile scope.
      */
    compile(kotlin("stdlib-jdk8"))

    /*
     Plugin "war" provided
     */
    providedRuntime(deps.dependencies.springBootTomcatStarter)

    testCompile(deps.dependencies.springBootTestStarter)
}

println("running app/build.gradle.kts ... end")
