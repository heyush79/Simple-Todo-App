package com.todoapi.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapi.demo.model.demo;
import com.todoapi.demo.service.demoService;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:3000")
public class demoController {
    
    private final demoService todoService;
    
    public demoController(demoService todoService) {
        this.todoService = todoService;
    }

    // Create new todo
    @PostMapping
    public ResponseEntity<demo> addTodo(@RequestBody demo todo) {
        if (todo.getTask() == null || todo.getTask().trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        demo newTodo = todoService.addTodo(todo.getTask());
        return ResponseEntity.ok(newTodo);
    }

    // Get all todos
    @GetMapping
    public ResponseEntity<List<demo>> getAllTodos() {
        List<demo> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    // Toggle completion status
    @PutMapping("/{id}")
    public ResponseEntity<demo> toggleTodo(@PathVariable int id) {
        demo updatedTodo = todoService.updateTodo(id);
        if (updatedTodo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedTodo);
    }

    // Delete todo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable int id) {
        boolean deleted = todoService.deleteTodo(id);
        if (!deleted) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}