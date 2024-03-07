package com.mollapp.filters;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class AuthenticationTest {

    @Test
    void authenticationTest() throws Exception {
        Filter authentication = new Authentication();
        String user = "Francec";
        String authenticationMsg = tapSystemOut(() -> { authentication.execution(user);});
        assertEquals("Autenticación OK para Francec",
                        authenticationMsg.trim());
    }
}