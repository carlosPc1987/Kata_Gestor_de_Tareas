package org.example.application;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getPendingTasks() {
        List<Task> pendents = new ArrayList<>();
        for (Task t : tasks) {
            if (!t.isCompleted()) {
                pendents.add(t);
            }
        }
        return pendents;
    }

    public int getCompletedCount() {
        int count = 0;
        for (Task t : tasks) {
            if (t.isCompleted()) {count++;
            }
        }
        return count;
    }
}