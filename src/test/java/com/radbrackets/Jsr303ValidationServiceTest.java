package com.radbrackets;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.junit.jupiter.api.*;


class Jsr303ValidationServiceTest {

    private Jsr303ValidationService validationService = new Jsr303ValidationService(null);

    @Test
    public void shouldValidateData() {
        // given
        TestingData test = new TestingData(null);

        // when
        Validated result = validationService.validate(test);

        // then
        Assertions.assertTrue(result instanceof Invalid);
    }

    @Valid
    class TestingData {

        @NotNull
        private String test;

        public TestingData(String test) {
            this.test = test;
        }

    }

}
