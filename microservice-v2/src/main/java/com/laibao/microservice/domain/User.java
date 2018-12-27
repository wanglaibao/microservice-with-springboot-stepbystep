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
public final class User implements Serializable{
    private static final long serialVersionUID = -4355327317195219377L;

    private final String alias;

    User() {
        this.alias = null;
    }
}
