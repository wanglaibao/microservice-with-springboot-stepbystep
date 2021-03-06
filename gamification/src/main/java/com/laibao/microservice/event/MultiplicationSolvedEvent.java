package com.laibao.microservice.event;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class MultiplicationSolvedEvent implements Serializable {
    private static final long serialVersionUID = -428953144988586684L;
    private final Long multiplicationResultAttemptId;
    private final Long userId;
    private final boolean correct;
}
