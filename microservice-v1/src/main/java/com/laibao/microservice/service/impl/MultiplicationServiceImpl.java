package com.laibao.microservice.service.impl;

import com.laibao.microservice.domain.Multiplication;
import com.laibao.microservice.domain.MultiplicationResultAttempt;
import com.laibao.microservice.service.MultiplicationService;
import com.laibao.microservice.service.RandomGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {

    private RandomGeneratorService randomGeneratorService;

    public MultiplicationServiceImpl(RandomGeneratorService randomGeneratorService) {
        this.randomGeneratorService = randomGeneratorService;
    }

    @Override
    public Multiplication createRandomMultiplication() {
        int factorA = randomGeneratorService.generateRandomFactor();
        int factorB = randomGeneratorService.generateRandomFactor();
        return new Multiplication(factorA, factorB);
    }

    @Override
    public boolean checkAttempt(MultiplicationResultAttempt resultAttempt) {
        return resultAttempt.getResultAttempt() == resultAttempt.getMultiplication().getFactorA() * resultAttempt.getMultiplication().getFactorB();
    }
}
