package org.rm.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @DATA 2019-03-15 11:15
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello)
    {
        System.out.println("Receiver:"+hello);
    }
}
