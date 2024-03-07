package com.mollapp.clients;

import com.mollapp.administrator.TasksProgrammer;
public interface Client {
    void setTasksProgrammer(TasksProgrammer manager);
    void sendRequest(String user);
}
