package top.study.springbootdemo.activeMQWeb.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumerListener {

    @JmsListener(destination = "${spring.activemq.topic-name}", containerFactory = "topicListener")
    public void readTopicQueue(String msg) {
        System.out.println("topic接收到：" + msg);
    }
}
