package com.zjf.activityMQ.receive;

import com.zjf.model.Student;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.Serializable;


/**
 * className:Receiver
 * package:com.zjf.activityMQ.receive
 * Description:简单描述
 *
 * @date: 2019/11/13 16:33
 * @Author: ASUS
 */
public class AsyncReceiver {
    private static final String BROKER_URL = "tcp://192.168.31.137:61616";
    private static final String DESTINATION = "myQueue";

    public static void main(String[] args) {
        receiveMessage();
        System.out.println("接收消息成功");
    }

    public static void receiveMessage(){
        //1、创建ConnectionFactury
        ConnectionFactory factory = new ActiveMQConnectionFactory(BROKER_URL);
        //设置信任包名称（这里不设置就会报错：This class is not trusted to be serialized as ObjectMessage payload）
        ((ActiveMQConnectionFactory) factory).setTrustAllPackages(true);
        Connection connection = null;
        Session session = null;
        Destination destination = null;
        MessageConsumer consumer = null;
        try {
            //2、创建Connection对象
            connection = factory.createConnection();
            //3、接收消息，需要将连接启动一下才可以接收到消息
            connection.start();
            //4、有了session可以创建destination、consumer、message
//            session = connection.createSession(Boolean.FALSE,Session.AUTO_ACKNOWLEDGE);
            session = connection.createSession(Boolean.TRUE,Session.SESSION_TRANSACTED);
            System.out.println("session" + session);
            //5、创建Destination
            destination = session.createQueue(DESTINATION);
            //6、创建consumer
            consumer = session.createConsumer(destination);

            final Session finalSession = session;
            System.out.println("finalSession" + finalSession);
            consumer.setMessageListener(new MessageListener() {
                @Override
                public void onMessage(Message message) {
                    if(message instanceof ObjectMessage){
                        Object object = null;
                        try {
                            object = ((ObjectMessage) message).getObject();
                            System.out.println("学生信息：" + object.toString());
                        } catch (JMSException e) {
                            e.printStackTrace();
                        }
                        //这里进行逻辑处理
                        System.out.println(object.toString());
                    }else if(message instanceof TextMessage){
                        System.out.println(message);
                    }
                    //如果是事务性消息，需要添加提交，否则不会消费成功
                    //事务性消息的提交，也就意味着消息的确认
                    try {
                        finalSession.commit();
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (JMSException e) {
            e.printStackTrace();
        }/*finally {
            if(consumer != null){
                try {
                    consumer.close();
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
        }*/
    }
}
