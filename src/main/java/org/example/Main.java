package org.example;


import org.example.application.Task;
import org.example.application.TaskManager;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    public static void runProgram() {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("Estudiar para el test"));
        manager.addTask(new Task("Enviar proyecto"));

        manager.getTasks().get(1).markAsCompleted();

        System.out.println("Tareas pendientes:");
        for (Task tarea : manager.getPendingTasks()) {
            System.out.println(" - " + tarea.getTitle());
        }

        System.out.println(" Tareas completadas: " + manager.getCompletedCount());
    }
}