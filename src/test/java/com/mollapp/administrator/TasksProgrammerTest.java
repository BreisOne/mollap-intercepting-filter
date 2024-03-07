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
        Tasks tasks = new Tasks();
        TasksProgrammer tasksProgrammer = new TasksProgrammer(vehicle);
        tasksProgrammer.setTasks(tasks);

        assertTrue(tasksProgrammer.getTasks() != null);
    }
    @Test
    void executionTest(){
        Target vehicle = new Vehicle();
        String user = "Francesc";
        Tasks tasks = new Tasks();
        tasks.addTask(new Authentication());
        tasks.addTask(new Authorisation());

        TasksProgrammer tasksProgrammer = new TasksProgrammer(vehicle);
        tasksProgrammer.setTasks(tasks);

        tasksProgrammer.executeTasks(user);
    }

}