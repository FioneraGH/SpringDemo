object deps {
    val springBootVersion = "1.5.12.RELEASE"

    object plugin {
        val kotlin = "1.2.60"
        val springBoot = "org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion"
    }

    object dependencies {
        // compile
        val springBootWebStarter = "org.springframework.boot:spring-boot-starter-web:$springBootVersion"
        val springBootSecurityStarter = "org.springframework.boot:spring-boot-starter-security:$springBootVersion"
        val springBootMyBatisStarter = "org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.1"
        val mysqlJDBC = "mysql:mysql-connector-java:5.1.46"
        val guaua = "com.google.guava:guava:24.1-jre"
        val druid = "com.alibaba:druid:1.1.9"

        // runtime
        val springBootTomcatStarter = "org.springframework.boot:spring-boot-starter-tomcat"

        // test
        val springBootTestStarter = "org.springframework.boot:spring-boot-starter-test"
    }
}