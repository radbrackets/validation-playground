package com.radbrackets;

import jakarta.validation.*;

import java.util.*;

public final class Invalid<T> extends Validated<T> {

    private Set<ConstraintViolation<T>> errors;

    Invalid(T validated, Set<ConstraintViolation<T>> errors) {
        super(validated);
        this.errors = errors;
    }
}
