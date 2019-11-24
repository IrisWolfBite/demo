package com.example.recreive.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.jms.ConnectionFactory;

/**
 * className:ActivityConfiguration
 * package:com.example.recreive.configuration
 * Description:简单描述
 *
 * @date: 2019/11/15 16:33
 * @Author: ASUS
 */
@Configuration
public class ActivityMQConfiguration {
    @Autowired
    private ConnectionFactory connectionFactory;

    @Autowired
    private MyListener myListener;

    //通过@Value注解接收SpringBoot配置文件中的目的地配置
    @Value("${spring.jms.template.default-destination}")
    private String destination;

    @Bean
    public DefaultMessageListenerContainer defaultMessageListenerContainer(){
        DefaultMessageListenerContainer listenerContainer = new DefaultMessageListenerContainer();
        listenerContainer.setConnectionFactory(connectionFactory);
        listenerContainer.setMessageListener(myListener);
        listenerContainer.setDestinationName(destination);

        return listenerContainer;
    }

}
