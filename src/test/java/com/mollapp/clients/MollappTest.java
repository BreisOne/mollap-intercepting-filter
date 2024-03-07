package com.mollapp.clients;

import com.mollapp.administrator.Tasks;
import com.mollapp.administrator.TasksProgrammer;
import com.mollapp.filters.Authentication;
import com.mollapp.filters.Authorisation;
import com.mollapp.targets.Target;
import com.mollapp.targets.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MollappTest {

    @Test
    void sendRequestTest() {
        Client mollapp = new Mollapp();
        Target vehicle = new Vehicle();
        TasksProgrammer programmer = new TasksProgrammer(vehicle);

        String user = "Francesc";

        mollapp.setTasksProgrammer(programmer);
        mollapp.sendRequest(user);

    }
}