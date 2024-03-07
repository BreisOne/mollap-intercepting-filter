package com.mollapp.administrator;

import com.mollapp.targets.Target;
import com.mollapp.targets.Vehicle;

public class TasksProgrammer {
    private Target vehicle;
    private Tasks tasks = null;

    public TasksProgrammer(Target vehicle) {
        this.vehicle = vehicle;
    }
    public Tasks getTasks(){
        return this.tasks;
    }
    public void setTasks(Tasks tasks){
        this.tasks = tasks;
    }

    public void executeTasks(String user){
        tasks.setTarget(vehicle);
        tasks.execution(user);
    }
}
