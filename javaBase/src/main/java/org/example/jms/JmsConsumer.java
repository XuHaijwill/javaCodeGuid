package org.example.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JmsConsumer {
    public static final String ACTIVEMQ_URL = "tcp://192.168.0.109:61616";
    public static final String QUEUE_NAME = "example.A";

    public static void main(String[] args) throws JMSException {
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        Connection connection = factory.createConnection();
        connection.start();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue(QUEUE_NAME);
        MessageConsumer consumer = session.createConsumer(queue);
        while (true) {
            TextMessage msg = (TextMessage) consumer.receive();
            if (msg != null) {
                System.out.println("消费者消费的消息为：" + msg.getText());
            } else {
                break;
            }
        }
        session.close();
        connection.close();
        System.out.println("****消费者消费消息完毕****");
    }
}
