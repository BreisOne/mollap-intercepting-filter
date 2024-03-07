package com.mollapp;

import com.mollapp.administrator.TasksProgrammer;
import com.mollapp.clients.Mollapp;
import com.mollapp.filters.Authentication;
import com.mollapp.filters.Authorisation;
import com.mollapp.targets.Vehicle;

public final class App {
    public static void main(String[] args) {

        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        TasksProgrammer tasksProgrammer = new TasksProgrammer(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        tasksProgrammer.setTask(new Authentication());
        tasksProgrammer.setTask(new Authorisation());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTasksProgrammer(tasksProgrammer);
        mollapp.sendRequest("Francesc");
    }
}