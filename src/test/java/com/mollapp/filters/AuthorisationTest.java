package com.mollapp.filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;

class AuthorisationTest {
    @Test
    void authorisationTest() throws Exception{
        Filter authorization = new Authorisation();
        String user = "Francesc";
        String authorizationMsg = tapSystemOut(() -> { authorization.execution(user);});
        assertEquals("Autorización OK para Francesc",authorizationMsg.trim());
    }
}