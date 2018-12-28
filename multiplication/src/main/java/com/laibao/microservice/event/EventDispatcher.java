package com.laibao.microservice.event;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Handles the communication with the Event Bus
 */

@Component
public class EventDispatcher {
    private final RabbitTemplate rabbitTemplate;

    // The exchange to use to send anything related to Multiplication
    private final String multiplicationExchange;

    // The routing key to use to send this particular event
    private final String multiplicationSolvedRoutingKey;


    @Autowired
    public EventDispatcher(RabbitTemplate rabbitTemplate,
                            @Value("${multiplication.exchange}") final String multiplicationExchange,
                            @Value("${multiplication.solved.key}") final String multiplicationSolvedRoutingKey) {
        this.rabbitTemplate = rabbitTemplate;
        this.multiplicationExchange = multiplicationExchange;
        this.multiplicationSolvedRoutingKey = multiplicationSolvedRoutingKey;
    }

    public void send(final MultiplicationSolvedEvent multiplicationSolvedEvent) {
        rabbitTemplate.convertAndSend(multiplicationExchange, multiplicationSolvedRoutingKey,multiplicationSolvedEvent);
    }
}
