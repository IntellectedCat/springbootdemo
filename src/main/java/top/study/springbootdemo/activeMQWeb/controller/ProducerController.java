package top.study.springbootdemo.activeMQWeb.controller;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;
import javax.jms.Queue;
import javax.jms.Topic;

@RestController
public class ProducerController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    @PostMapping("/queue/test")
    public String sendQueue(String str) {
        this.sendMessage(queue, str);
        return "success";
    }

    @PostMapping("/topic/test")
    public String sendTopic(String str) {
        this.sendMessage(topic, str);
        return "success";
    }

    private void sendMessage(Destination destination, final String msg) {
        jmsMessagingTemplate.convertAndSend(destination, msg);
    }
}
