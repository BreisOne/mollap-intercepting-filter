package com.mollapp.filters;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {

    @Test
    void authenticationTest() throws Exception {
        Filter authentication = new Authentication();
        String name = "Francec";
        String authenticationMsg = tapSystemOut(() -> { authentication.execution(name);});
        assertEquals("Autenticación OK para Francec",
                        authenticationMsg.trim());
    }
}