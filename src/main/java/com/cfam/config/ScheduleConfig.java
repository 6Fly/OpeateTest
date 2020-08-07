//package com.cfam.config;
//
//import org.apache.log4j.Logger;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.scheduling.support.CronTrigger;
//
//
//
//@Configuration
//@EnableScheduling
//public class ScheduleConfig implements SchedulingConfigurer {
//
//    private Logger logger =Logger.getLogger(ScheduleConfig.class);
//
//    private String cron = "*/5 * * * * ?";
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//        //添加日报表
//        taskRegistrar.addTriggerTask(()->{
//            logger.info("=-===开始执行=======");
//        }, triggerContext ->{
//            //返回执行周期
//            return new CronTrigger(cron).nextExecutionTime(triggerContext);
//        });
//
//    }
//}
