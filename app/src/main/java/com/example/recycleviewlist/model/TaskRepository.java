package com.example.recycleviewlist.model;

import java.util.List;
import java.util.UUID;

public class TaskRepository implements Reposible {
    private static TaskRepository getInstance;
    private List<Task> mTasks;

    public static TaskRepository getInstance() {
        if (getInstance == null) {
            getInstance = new TaskRepository();
        }
        return getInstance;
    }

    private TaskRepository() {
    }

    @Override
    public void addTasks(List<Task> tasks) {
        mTasks = tasks;
    }

    @Override
    public void addTask(Task task) {
        mTasks.add(task);
    }

    @Override
    public Task getTask(UUID uuid) {
        for (Task task : mTasks) {
            if (task.getUUID().equals(uuid)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public int getPosition(UUID uuid) {
        return mTasks.indexOf(getTask(uuid));
    }

    @Override
    public List<Task> getTasks() {
        return mTasks;
    }

    @Override
    public void setTask(UUID uuid, Task task) {
        mTasks.set(getPosition(uuid), task);
    }

    @Override
    public void removeTask(UUID uuid) {
        mTasks.remove(getTask(uuid));
    }

    @Override
    public void removeTasks() {
        addTasks(null);
    }
}

interface Reposible {
    /**
     * CREAT
     * READ
     * Upgrade
     * DELETE
     */
    void addTasks(List<Task> tasks);

    void addTask(Task task);

    Task getTask(UUID uuid);

    int getPosition(UUID uuid);

    List<Task> getTasks();

    void setTask(UUID uuid, Task task);

    void removeTask(UUID uuid);

    void removeTasks();
}