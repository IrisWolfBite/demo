/*package com.example.recreive.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.*;

*//**
 * className:ReceiverServiceImpl
 * package:com.example.recreive.service
 * Description:简单描述
 *
 * @date: 2019/11/15 12:36
 * @Author: ASUS
 *//*
@Service
public class ReceiverServiceImpl implements ReceiverService {

    @Override
    @JmsListener(destination = "${spring.jms.template.default-destination}")
    public void receive(Message message) {
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
}*/
