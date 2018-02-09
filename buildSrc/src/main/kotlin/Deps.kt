object deps {
    val springBootVersion = "1.5.10.RELEASE"

    object plugin {
        val kotlin = "1.2.21"
        val springBoot = "org.springframework.boot:spring-boot-gradle-plugin:$springBootVersion"
    }

    object dependencies {
        // compile
        val springBootWebStarter = "org.springframework.boot:spring-boot-starter-web:$springBootVersion"
        val springBootMyBatisStarter = "org.mybatis.spring.boot:mybatis-spring-boot-starter:1.3.1"
        val mysqlJDBC = "mysql:mysql-connector-java:5.1.45"
        val guaua = "mysql:mysql-connector-java:5.1.45"
        val druid = "com.alibaba:druid:1.1.7"

        // runtime
        val springBootTomcatStarter = "org.springframework.boot:spring-boot-starter-tomcat"

        //test
        val springBootTestStarter = "org.springframework.boot:spring-boot-starter-test"
    }
}