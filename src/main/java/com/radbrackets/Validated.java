package com.radbrackets;

public abstract sealed class Validated<T> permits Valid, Invalid {
    private T validated;

    Validated(T validated) {
        this.validated = validated;
    }
}


