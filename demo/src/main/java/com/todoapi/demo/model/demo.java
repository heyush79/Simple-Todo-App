package com.todoapi.demo.model;

public class demo {
    private int id;
    private String task;  // Matches frontend's 'text' field
    private boolean completed;

    // Constructors
    public demo() {}
    
    public demo(int id, String task, boolean completed) {
        this.id = id;
        this.task = task;
        this.completed = completed;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getTask() { return task; }
    public void setTask(String task) { this.task = task; }
    
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}