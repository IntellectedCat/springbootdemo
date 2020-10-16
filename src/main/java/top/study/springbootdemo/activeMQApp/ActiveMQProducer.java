package top.study.springbootdemo.activeMQApp;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class ActiveMQProducer {
    /**
     * Queue队列
     * 一对一
     * @param args
     * @throws JMSException
     * @throws IOException
     */
//    public static void main(String[] args) throws JMSException {
//        // 1、创建工厂连接对象，需要制定ip和端口号
//        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(
//                ActiveMQConnectionFactory.DEFAULT_USER,
//                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
//                ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL
//        );
//        // 2、使用连接工厂创建一个连接对象
//        Connection connection = activeMQConnectionFactory.createConnection();
//        // 3、开启连接
//        connection.start();
//        // 4、建立一个会话
//        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
//        // 5、使用会话对象创建目标对象
//        Queue testQueue = session.createQueue("testQueue");
//        // 6、使用会话对象创建生产者对象
//        MessageProducer producer = session.createProducer(testQueue);
//        // 7、使用会话对象创建一个信息对象
//        TextMessage textMessage = session.createTextMessage("hello world");
//        // 8、发送消息
//        producer.send(textMessage);
//        // 9、关闭资源
//        producer.close();
//        session.close();
//        connection.close();
//    }

    /**
     * Topic
     * 一对多
     * 正常情况下topic消息不会在服务器持久化，所以要先打开消费者，再打开生产者，消费者才可以接收到信息
     * @param args
     * @throws JMSException
     * @throws IOException
     */
    public static void main(String[] args) throws JMSException {
        // 1、创建工厂连接对象，需要制定ip和端口号
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(
                ActiveMQConnectionFactory.DEFAULT_USER,
                ActiveMQConnectionFactory.DEFAULT_PASSWORD,
                ActiveMQConnectionFactory.DEFAULT_BROKER_BIND_URL
        );
        // 2、使用连接工厂创建一个连接对象
        Connection connection = activeMQConnectionFactory.createConnection();
        // 3、开启连接
        connection.start();
        // 4、建立一个会话
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        // 5、使用会话对象创建目标对象
        Topic testTopic = session.createTopic("testTopic");
        // 6、使用会话对象创建生产者对象
        MessageProducer producer = session.createProducer(testTopic);
        // 7、使用会话对象创建一个信息对象
        TextMessage textMessage = session.createTextMessage("hello world");
        // 8、发送消息
        producer.send(textMessage);
        // 9、关闭资源
        producer.close();
        session.close();
        connection.close();
    }
}
