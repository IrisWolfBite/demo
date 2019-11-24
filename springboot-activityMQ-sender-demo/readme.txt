
消息控制台地址：http://192.168.31.137:8161/

springboot-demo：消息提供者（每次生产一条消息）

springboot-demo2：消息的异步消费，直接启动即可

注意：消息的异步调用的实现有两种方式：
        1.直接使用@JmsListener(destination = "${spring.jms.template.default-destination}")注解
        2.@Configuration配置方式实现
            具体的实现步骤见springboot-demo2中的configuration包