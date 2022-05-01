package com.example.liquibasejooq.scheduler;

import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {


    @Scheduled(cron = "0/10 * * * * ?")
    @SchedulerLock(name = "TaskScheduler_scheduledTask",
            lockAtLeastForString = "PT5S", lockAtMostForString = "PT14S")
    public void scheduledTask() {
        System.out.println("aaap");
    }
}
