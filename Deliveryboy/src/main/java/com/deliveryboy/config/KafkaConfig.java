package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic newTopic() {


        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
//                .partitions() //How many Partitions within a Topic.
//                .replicas() //How many will have the copy of the data.
                .build();
    }

}
// Here the TopicBuilder class is a utility provided by Spring Kafka to make it easier to define and create Kafka topics.
