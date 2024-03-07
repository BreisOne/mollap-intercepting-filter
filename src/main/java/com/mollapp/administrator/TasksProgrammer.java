package com.mollapp.administrator;

import com.mollapp.filters.Filter;
import com.mollapp.targets.Target;

public class TasksProgrammer {
    private Target vehicle;
    private Tasks tasks = new Tasks();

    public TasksProgrammer(Target vehicle) {
        this.vehicle = vehicle;
    }
    public Tasks getTasks(){
        return this.tasks;
    }
    public void setTask(Filter task){
        tasks.addTask(task);
    }

    public void executeTasks(String user){
        tasks.setTarget(vehicle);
        tasks.execution(user);
    }
}
