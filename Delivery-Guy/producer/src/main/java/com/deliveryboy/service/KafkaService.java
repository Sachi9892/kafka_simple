package com.deliveryboy.service;


import com.deliveryboy.appconstants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

    public boolean updateLocation(String location) {
        this.kafkaTemplate.send(Constants.LOCATION_TOPIC, location );
        return true;
    }
}
