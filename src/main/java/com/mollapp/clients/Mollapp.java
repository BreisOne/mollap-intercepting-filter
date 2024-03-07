package com.mollapp.clients;

import com.mollapp.administrator.Tasks;
import com.mollapp.administrator.TasksProgrammer;
import com.mollapp.filters.Authentication;
import com.mollapp.filters.Authorisation;

public class Mollapp implements Client {
    private TasksProgrammer programmer = null;
    public Mollapp() {}

    @Override
    public void setTasksProgrammer(TasksProgrammer programmer) {
        this.programmer = programmer;
    }
    @Override
    public void sendRequest(String user) {
        programmer.executeTasks(user);
    }
}
