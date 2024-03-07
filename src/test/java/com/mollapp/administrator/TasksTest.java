package com.mollapp.administrator;

import com.mollapp.filters.Authentication;
import com.mollapp.filters.Authorisation;
import com.mollapp.filters.Filter;
import com.mollapp.targets.Target;
import com.mollapp.targets.Vehicle;
import com.sun.jdi.InterfaceType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

class TasksTest {

    @Test
    void getTargetTest(){
        Target car = new Vehicle();
        Tasks tasks = new Tasks();
        tasks.setTarget(car);

        Target targetVehicle = tasks.getTarget();
        assertTrue(targetVehicle != null);
    }
    @Test
    void getTasksTest(){

        Tasks tasks = new Tasks();
        tasks.addTask(new Authentication());
        tasks.addTask(new Authorisation());

        List<Filter> tasksList = tasks.getTasks();
        assertTrue(tasksList != null);
    }
    @Test
    void executionTest() throws Exception{
        Target car = new Vehicle();
        Tasks tasks = new Tasks();
        String user = "Francesc";
        tasks.setTarget(car);
        tasks.addTask(new Authentication());
        tasks.addTask(new Authorisation());

        String tasksMsg = tapSystemOut(() -> { tasks.execution(user);});
        System.out.println(tasksMsg);

        //assertEquals("Autenticación OK para Francesc\n"+
        //              "Autorización OK para Francesc\n"+
        //              "Puerta abierta Francesc!", tasksMsg);
    }


}