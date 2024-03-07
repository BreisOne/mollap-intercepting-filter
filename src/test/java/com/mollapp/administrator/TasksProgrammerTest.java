package com.mollapp.administrator;

import com.mollapp.filters.Authentication;
import com.mollapp.filters.Authorisation;
import com.mollapp.targets.Target;
import com.mollapp.targets.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksProgrammerTest {

    @Test
    void getTasksTest(){
        Target vehicle = new Vehicle();
        TasksProgrammer tasksProgrammer = new TasksProgrammer(vehicle);
        tasksProgrammer.setTask(new Authentication());
        tasksProgrammer.setTask(new Authentication());

        assertTrue(tasksProgrammer.getTasks().getTasks().size() == 2);
    }
    @Test
    void executionTest(){
        Target vehicle = new Vehicle();
        String user = "Francesc";

        TasksProgrammer tasksProgrammer = new TasksProgrammer(vehicle);
        tasksProgrammer.setTask(new Authentication());
        tasksProgrammer.setTask(new Authorisation());

        tasksProgrammer.executeTasks(user);
    }

}