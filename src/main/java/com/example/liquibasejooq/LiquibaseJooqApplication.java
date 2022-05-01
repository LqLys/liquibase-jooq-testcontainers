package com.example.liquibasejooq;

import net.javacrumbs.shedlock.spring.annotation.EnableSchedulerLock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableScheduling
@EnableSchedulerLock(defaultLockAtMostFor = "PT30S")
@EnableTransactionManagement
@SpringBootApplication
public class LiquibaseJooqApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiquibaseJooqApplication.class, args);
    }

}
