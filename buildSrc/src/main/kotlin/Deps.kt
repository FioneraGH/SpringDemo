object deps {
    val springBootVersion = "1.5.15.RELEASE"

    object plugin {
        val kotlin = "1.3.10"
        val springBoot = "org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion"
    }

    object dependencies {
        // compile
        val springBootWebStarter = "org.springframework.boot:spring-boot-starter-web:$springBootVersion"
        val springBootSecurityStarter = "org.springframework.boot:spring-boot-starter-security:$springBootVersion"
        val springBootMyBatisStarter = "org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.2"
        val mysqlJDBC = "mysql:mysql-connector-java:5.1.47"
        val guaua = "com.google.guava:guava:26.0-jre"
        val druid = "com.alibaba:druid:1.1.9"

        // runtime
        val springBootTomcatStarter = "org.springframework.boot:spring-boot-starter-tomcat"

        // test
        val springBootTestStarter = "org.springframework.boot:spring-boot-starter-test"
    }
}