package com.mollapp.administrator;

import com.mollapp.filters.Filter;
import com.mollapp.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private Target vehicle = null;
    private List<Filter> tasks = new ArrayList<>();
    private String user;

    public Tasks(){
    };

    public Target getTarget(){
        return this.vehicle;
    }
    public void setTarget(Target vechicle){
        this.vehicle = vechicle;
    }
    public void addTask(Filter task){
        tasks.add(task);
    }
    public List<Filter> getTasks(){
        return this.tasks;
    }

    public void execution(String user) {
        tasks.forEach(task -> task.execution(user));
        vehicle.execution(user);
    }

}
