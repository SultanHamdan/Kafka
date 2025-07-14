package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location) {

        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
        return true;
    }

}
// This service is responsible for sending data to a Kafka topic using Spring Kafka’s KafkaTemplate.
// Sends data in the Key and Value type.
