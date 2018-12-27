package com.laibao.microservice.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication implements Serializable {

    private static final long serialVersionUID = 3449814217371039673L;

    // Both factors
    private final int factorA;

    private final int factorB;

    // The result of the operation A * B
    private int result;


     Multiplication() {
            this(0,0);
    }

}
