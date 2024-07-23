package com.deliveryboy.controllers;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation() {

        for(int i = 0 ; i < 200000; i++) {

            this.kafkaService
                    .updateLocation("( " + Math.round(Math.random() * 100) + " , " + Math.round(Math.random() * 100) + " )");

        }
        return new ResponseEntity<>(Map.of("Message" , "Location Update !") , HttpStatus.OK);

    }
}
