package com.instadeep.Taskmanagement.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.instadeep.Taskmanagement.model.Task;
import com.instadeep.Taskmanagement.service.TaskService;

@RestController
@RequestMapping("/Tasks")
public class TaskController {
    
    @Autowired
    private TaskService TaskService;

    @GetMapping("/")
    public List<Task> getTasks(){
        return TaskService.getAllTasks();
    }

    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable UUID id){
        return TaskService.getDetailsTask(id);
    }

    @PostMapping
    public Task addTask(Task Task){
        return TaskService.saveTask(Task);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable UUID id, @RequestBody Task taskDetails) {
        return TaskService.updateTask(id, taskDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable UUID id) {
        TaskService.deleteTask(id);
    }
    
}