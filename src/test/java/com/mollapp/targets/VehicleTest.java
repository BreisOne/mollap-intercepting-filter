package com.mollapp.targets;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void vehicleTest() throws Exception{
        Target car = new Vehicle();
        String user = "Francesc";
        String carMsg = tapSystemOut(()->{car.execution(user);});
        assertEquals("Puerta abierta Francesc!", carMsg.trim());
    }

}