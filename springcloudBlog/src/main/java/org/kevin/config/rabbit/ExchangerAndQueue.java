package org.kevin.config.rabbit;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@Configuration
public class ExchangerAndQueue {
    public static final String FANOUT_EXCHANGE_NAME = "fanout.exchange.name";
    public static final String FANOUT_QUEUE_NAME = "fanout.queue";
    public static final String TOPIC_EXCHANGE_NAME = "topic.exchange.name";
    public static final String TOPIC_QUEUE_NAME = "topic.queue";

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(FANOUT_EXCHANGE_NAME, false, true);
    }
    @Bean
    public Queue fanoutQueue(){
        return new Queue(FANOUT_QUEUE_NAME, false, true, true);
    }

    @Bean
    public Binding bindFanout(FanoutExchange fanoutExchange, Queue fanoutQueue){
        return BindingBuilder.bind(fanoutQueue).to(fanoutExchange);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(TOPIC_EXCHANGE_NAME, false, true);
    }
    @Bean
    public Queue topicQueue(){
        return new Queue(TOPIC_QUEUE_NAME, false, true, true);
    }

    @Bean
    public Binding bindTopic(TopicExchange topicExchange, Queue topicQueue){
        return BindingBuilder.bind(topicQueue).to(topicExchange).with("topic.*");
    }
}
