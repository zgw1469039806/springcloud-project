package org.rm.controller;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @DATA 2019-03-15 11:10
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Component
public class SendController {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send()
    {
        String context = "hello" + new Date();
        System.out.println("Sender" + context);
        amqpTemplate.convertAndSend("hello", context);

    }


}
