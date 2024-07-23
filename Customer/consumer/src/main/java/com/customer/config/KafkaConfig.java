package com.customer.config;

import com.customer.appconstants.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConfig.class);

    @KafkaListener(topics = Constant.LOCATION_UPDATE_TOPIC, groupId = Constant.GROUP_ID)
    public void getLocation( String value ) {

        System.out.println(value);

    }
}
