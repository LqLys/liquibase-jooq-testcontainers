package com.example.liquibasejooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class LiquibaseJooqApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseJooqApplication.class, args);
    }

}
