package org.kevin.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kevin.Z
 * @version 2021/6/27
 */
@Configuration
public class QueueConfig {
    private static final String TOPIC_QUEUE_NAME = "topic.secretMoment";
    private static final String TOPIC_QUEUE_ARTICLE = "topic.article";

    @Bean
    public Queue secretMoment() {
        return new Queue(TOPIC_QUEUE_NAME, false, true, true);
    }

    @Bean
    public Queue articleQueue() {
        return new Queue(TOPIC_QUEUE_ARTICLE, false, true, true);
    }
}
