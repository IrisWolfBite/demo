package com.zjf.activityMQ.send;

import com.zjf.model.Student;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * className:Sender
 * package:com.zjf.activityMQ
 * Description:非事务性消息，自动消息确认，发送的消息为Object对象
 *
 * @date: 2019/11/13 15:00
 * @Author: ASUS
 */
public class Sender {
    public static final String BROKER_URL = "tcp://192.168.31.137:61616";
    //相当于一个队列
    public static final String DESTINATION = "myQueue";

    public static void main(String[] args) {
        sendMessage();
        System.out.println("点对点-发送消息");
    }

    public static void sendMessage(){
        //1、创建连接工厂
        ConnectionFactory factory = new ActiveMQConnectionFactory(BROKER_URL);
        Connection connection = null;
        Session session = null;
        Message message = null;
        Destination destination = null;
        MessageProducer producer = null;
        try {
            //2、创建connection对象
            connection = factory.createConnection();
            //3、创建session(参数一：是否是事务性消息；参数二：是否自动确认消息)
//            session = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
            session = connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
            //4、有了session之后，就可以创建消息、目的地、生产者、消费者
            message = session.createObjectMessage(new Student("zs","男",23));
            //5.创建Destination
            destination = session.createQueue(DESTINATION);
            //6、创建生产者
            producer = session.createProducer(destination);
            //7、发送消息
            producer.send(message);
            //如果是事务性消息，需要添加提交，否则消息不会发送成功
            session.commit();
        } catch (JMSException e) {
            e.printStackTrace();
        }finally {
            if(producer != null){
                try {
                    producer.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if(session != null){
                try {
                    session.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
            if(connection != null){
                try {
                    connection.close();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
