
// File: src/main/java/com/example/pomodoro/controller/TaskController.java
package com.example.pomodoro.controller;

import com.example.pomodoro.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final Map<Long, Task> tasks = new LinkedHashMap<>();
    private final AtomicLong idCounter = new AtomicLong();

    @GetMapping
    public Collection<Task> getTasks() {
        return tasks.values();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        long id = idCounter.incrementAndGet();
        task.setId(id);
        tasks.put(id, task);
        return task;
    }

    @PutMapping("/{id}/toggle")
    public Task toggleTask(@PathVariable Long id) {
        Task task = tasks.get(id);
        if (task != null) {
            task.setCompleted(!task.isCompleted());
        }
        return task;
    }
}