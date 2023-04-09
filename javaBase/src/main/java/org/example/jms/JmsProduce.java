package org.example.jms;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class JmsProduce {

    public static final String ACTIVEMQ_URL = "tcp://192.168.0.109:61616";
    public static final String QUEUE_NAME = "queue01";

    public static void main(String[] args) throws JMSException {

        //创建连接工厂,按照给定的URL地址，采用默认用户名和密码，默认都是admin
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        //通过连接工厂，获得activeMQ连接对象并启动访问
        Connection connection = activeMQConnectionFactory.createConnection();
        connection.start();
        //创建session会话，创建session时传入两个参数，第一个是事务，第二个是签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        //创建目的地(具体可以是queue或者topic)
        Queue queue = session.createQueue(QUEUE_NAME);
        //创建消息生产者，并指明消息生产者生产的消息目的地
        MessageProducer producer = session.createProducer(queue);
        //通过使用messageProducer生产消息并放入queue中
        for (int i = 1; i <= 3; i++) {
            //创建消息
            TextMessage msg = session.createTextMessage("msg---" + i);
            //通过messageProducer将消息发送给mq
            producer.send(msg);
        }
        //关闭资源
        session.close();
        connection.close();
        System.out.println("****消息发送到MQ完成****");
    }
}
