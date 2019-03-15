package org.gw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @DATA 2019-03-13 16:08
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@Controller
public class QueueController {

    @Autowired
    JmsTemplate jmsTemplate;

    @RequestMapping("/sendMsg")
    public String sendMsg(String name, String msg) {
        jmsTemplate.send(name, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage();
                textMessage.setText(msg);
                return textMessage;
            }
        });
        return "/index";
    }

    @JmsListener(destination = "qwq")
    public void receiveMsg(String message) {
        System.out.println("接受到数据:" + message);
        //model.addAttribute("msgs", message);
    }
}
