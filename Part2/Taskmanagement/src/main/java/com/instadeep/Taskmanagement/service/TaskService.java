package com.instadeep.Taskmanagement.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.instadeep.Taskmanagement.model.Task;
import com.instadeep.Taskmanagement.repository.TaskRepository;

public class TaskService {

    @Autowired
    private TaskRepository taskRepo; 

    public Optional<Task> getDetailsTask(UUID id){
        return taskRepo.findById(id);
        
    }
    public List<Task> getAllTasks() {
        return taskRepo.findAll();
    }
    public Task saveTask(Task Task) {
        return taskRepo.save(Task);
    }

    public void deleteTask(UUID id) {
        taskRepo.deleteById(id);
    }

    public Task updateTask(UUID id, Task TaskDetails) {
        Task Task = taskRepo.findById(id).orElseThrow();
        Task.setCategories(TaskDetails.getCategories());
        Task.setTitle(TaskDetails.getTitle());
        Task.setDescription(TaskDetails.getDescription());
        Task.setDueDate(TaskDetails.getDueDate());
        Task.setPriority(TaskDetails.getPriority());
        
        return taskRepo.save(Task);
    }

    public List<Task> sortTasks(){
        return taskRepo.sortTaks();
    }
    public List<Task> filterTasks(String Prio){
        return taskRepo.filterTaks(Prio);
    }
}
