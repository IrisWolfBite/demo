package com.example.recreive.configuration;

import org.springframework.stereotype.Component;

import javax.jms.*;

/**
 * className:MyListener
 * package:com.example.recreive.configuration
 * Description:简单描述
 *
 * @date: 2019/11/15 16:28
 * @Author: ASUS
 */
@Component
public class MyListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            try {
                String textMessage = ((TextMessage) message).getText();
                System.out.println(textMessage);
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }else if(message instanceof ObjectMessage){
            try {
                Object o = ((ObjectMessage) message).getObject();
                System.out.println(o.toString());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
