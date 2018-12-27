package com.laibao.microservice.domain;

import java.io.Serializable;

public class Multiplication implements Serializable {

    private static final long serialVersionUID = 3449814217371039673L;

    // Both factors
    private int factorA;

    private int factorB;

    // The result of the operation A * B
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA() {
        return factorA;
    }

    public int getFactorB() {
        return factorB;
    }

    public int getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "factorA=" + factorA +
                ", factorB=" + factorB +
                ", result=" + result +
                '}';
    }
}
