package top.study.springbootdemo.activeMQWeb.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueConsumerListener {
    // queue消费者模式
    @JmsListener(destination = "${spring.activemq.queue-name}", containerFactory = "queueListener")
    public void readActiveQueue(String msg) {
        System.out.println("queue接收到：" + msg);
    }
}
