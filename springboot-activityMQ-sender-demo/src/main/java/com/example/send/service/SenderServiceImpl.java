package com.example.send.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * className:SenderService
 * package:com.example.send
 * Description:简单描述
 *
 * @date: 2019/11/15 11:06
 * @Author: ASUS
 */
@Service
public class SenderServiceImpl implements SenderService{
    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String name){
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("Hello ActivityMQ," + name);
            }
        });
    }
}
