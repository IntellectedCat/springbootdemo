package top.study.activemq_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActiveMQWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ActiveMQWebApplication.class, args);
    }
}
