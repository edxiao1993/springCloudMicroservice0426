package org.kevin.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.nio.channels.Channel;


/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@Service
public class RabbisMQListenerService {

    @RabbitListener(queues = "topic.secretMoment")
    public void secretMomentReceiver(String msg){
        System.out.println("I got a message from everywhere:");
        System.out.println("msg = " + msg);
    }

}
