package com.laibao.microservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Identifies the attempt from a {@link User} to solve a
 * {@link Multiplication}.
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationResultAttempt implements Serializable{
    private static final long serialVersionUID = 3575179230051736526L;

    private final User user;
    private final Multiplication multiplication;
    private final int resultAttempt;

    // Empty constructor for JSON (de)serialization
    MultiplicationResultAttempt() {
        user = null;
        multiplication = null;
        resultAttempt = -1;
    }
}
