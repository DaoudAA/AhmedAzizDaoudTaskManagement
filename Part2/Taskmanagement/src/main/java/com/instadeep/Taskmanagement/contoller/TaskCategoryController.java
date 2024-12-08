package com.instadeep.Taskmanagement.contoller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.instadeep.Taskmanagement.model.TaskCategory;
import com.instadeep.Taskmanagement.service.TaskCategoryService;

@RestController
@RequestMapping("/TaskCategories")
public class TaskCategoryController {
    
    @Autowired
    private TaskCategoryService TaskCategoryService;

    @GetMapping("/")
    public List<TaskCategory> getTaskCategories(){
        return TaskCategoryService.getAllTaskCategories();
    }

    @GetMapping("/{id}")
    public Optional<TaskCategory> getTaskCategory(@PathVariable UUID id){
        return TaskCategoryService.getDetailsTaskCategory(id);
    }

    @PostMapping
    public TaskCategory addTaskCategory(TaskCategory Task){
        return TaskCategoryService.saveTaskCategory(Task);
    }

    @PutMapping("/{id}")
    public TaskCategory updateTaskCategory(@PathVariable UUID id, @RequestBody TaskCategory taskDetails) {
        return TaskCategoryService.updateTaskCategory(id, taskDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTaskCategory(@PathVariable UUID id) {
        TaskCategoryService.deleteTaskCategory(id);
    }
    
}
