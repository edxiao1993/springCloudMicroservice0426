package org.kevin.service;

import org.kevin.model.Article;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@Service
public class RabbitMQService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendSecretMoment(String msg){
        System.out.println("somebody are going to send a MSG");
        rabbitTemplate.convertAndSend("topic.secretMoment", msg);
    }

    public void sendArticle(Article article){
        System.out.println("I am going to send an article~");
        rabbitTemplate.convertAndSend("topic.article", article);
    }
}
