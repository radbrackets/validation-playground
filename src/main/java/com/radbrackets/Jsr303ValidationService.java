package com.radbrackets;

import jakarta.validation.*;
import java.util.*;

public class Jsr303ValidationService {

    private Validator validator;

    public Jsr303ValidationService(Validator validator) {
        this.validator = validator == null ? Validation.buildDefaultValidatorFactory().getValidator() : validator;
    }

    public <T> Validated<T> validate(T data) {
        Set<ConstraintViolation<T>> errors = validator.validate(data);
        if (errors.isEmpty()) return new Valid(data);
        else return new Invalid(data, errors);
    }
}
