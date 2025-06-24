package com.todoapi.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.todoapi.demo.model.demo;

@Service
public class demoService {
    private final List<demo> todos = new ArrayList<>();
    private final AtomicInteger idCounter = new AtomicInteger(1);

    // Create
    public demo addTodo(String task) {
        demo newTodo = new demo(idCounter.getAndIncrement(), task, false);
        todos.add(newTodo);
        return newTodo;
    }

    // Read
    public List<demo> getAllTodos() {
        return new ArrayList<>(todos); // Return copy
    }

    // Update
    public demo toggleCompleted(int id) {
        for (demo todo : todos) {
            if (todo.getId() == id) {
                todo.setCompleted(!todo.isCompleted());
                return todo;
            }
        }
        return null; // Todo not found
    }

    // Delete
    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }
}