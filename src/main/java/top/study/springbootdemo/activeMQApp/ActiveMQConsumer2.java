package top.study.springbootdemo.activeMQApp;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

public class ActiveMQConsumer2 {
    /**
     * Queue队列
     * @param args
     * @throws JMSException
     * @throws IOException
     */
//    public static void main(String[] args) throws JMSException, IOException {
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
//
//        // 4、启动连接的目的就是为了创建session
//        // 可以配置session的一些参数，如是否启动事务 签收模式（这里先设置为自动签收模式auto）
//        // Session，用于发送和接受消息，而且是单线程的，支持事务的。
//        // 如果Session开启事务支持，那么Session将保存一组信息，要么commit到MQ，要么回滚这些消息。
//        // Session可以创建MessageProducer/MessageConsumer。
//        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
//        // 5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
//        Queue testQueue = session.createQueue("testQueue");
//        // 6、使用会话对象创建消费者对象
//        MessageConsumer consumer = session.createConsumer(testQueue);
//        // 7、向consumer对象中设置一个监听，用来接收message
//        consumer.setMessageListener(new MessageListener() {
//            @Override
//            public void onMessage(Message message) {
//                if (message instanceof TextMessage) {
//                    TextMessage textMessage = (TextMessage) message;
//                    try {
//                        System.out.println(textMessage.getText());
//                    } catch (JMSException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
//                }
//            }
//        });
//        // 8、程序等待接收用户消息
//        System.in.read();
//        // 9、关闭资源
//        consumer.close();
//        session.close();
//        connection.close();
//
//
//    }

    /**
     * Topic
     * 一对多
     * @param args
     * @throws JMSException
     * @throws IOException
     */
    public static void main(String[] args) throws JMSException, IOException {
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
        // 4、启动连接的目的就是为了创建session
        // 可以配置session的一些参数，如是否启动事务 签收模式（这里先设置为自动签收模式auto）
        // Session，用于发送和接受消息，而且是单线程的，支持事务的。
        // 如果Session开启事务支持，那么Session将保存一组信息，要么commit到MQ，要么回滚这些消息。
        // Session可以创建MessageProducer/MessageConsumer。
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        // 5、使用会话对象创建目标对象，包含queue和topic（一对一和一对多）
        Topic testTopic = session.createTopic("testTopic");
        // 6、使用会话对象创建消费者对象
        MessageConsumer consumer = session.createConsumer(testTopic);
        // 7、向consumer对象中设置一个监听，用来接收message
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    try {
                        System.out.println(textMessage.getText());
                    } catch (JMSException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        });
        // 8、程序等待接收用户消息
        System.in.read();
        // 9、关闭资源
        consumer.close();
        session.close();
        connection.close();
    }
}
