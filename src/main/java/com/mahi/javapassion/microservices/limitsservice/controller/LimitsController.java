package com.mahi.javapassion.microservices.limitsservice.controller;

import com.mahi.javapassion.microservices.limitsservice.beans.Limits;
import com.mahi.javapassion.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimits() {
        return Limits.builder()
                .minimum(configuration.getMinimum())
                .maximum(configuration.getMaximum())
                .build();
    }

}
