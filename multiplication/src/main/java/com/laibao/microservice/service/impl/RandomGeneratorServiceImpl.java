package com.laibao.microservice.service.impl;

import com.laibao.microservice.service.RandomGeneratorService;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;

@Service
public class RandomGeneratorServiceImpl implements RandomGeneratorService {

    final static int MINIMUM_FACTOR = 11;

    final static int MAXIMUM_FACTOR = 99;

    @Override
    public int generateRandomFactor() {
        return new SecureRandom().nextInt((MAXIMUM_FACTOR - MINIMUM_FACTOR) + 1) + MINIMUM_FACTOR;
    }
}
