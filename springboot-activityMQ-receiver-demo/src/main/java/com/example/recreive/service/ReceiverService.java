package com.example.recreive.service;

import javax.jms.Message;

/**
 * className:ReceiverService
 * package:com.example.recreive.service
 * Description:简单描述
 *
 * @date: 2019/11/15 12:36
 * @Author: ASUS
 */
public interface ReceiverService {
    void receive(Message message);
}
