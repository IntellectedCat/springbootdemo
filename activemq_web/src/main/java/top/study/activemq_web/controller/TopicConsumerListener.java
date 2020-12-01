package top.study.activemq_web.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicConsumerListener {

    @JmsListener(destination = "${spring.activemq.topic-name}", containerFactory = "topicListener")
    public void readTopicQueue(String msg) {
        System.out.println("topic接收到：" + msg);
    }

    @JmsListener(destination = "${spring.activemq.topic-name}", containerFactory = "topicListener2")
    public void readTopicQueue2(String msg) {
        System.out.println("topic2接收到：" + msg);
    }
}
