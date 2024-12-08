package com.instadeep.Taskmanagement.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.instadeep.Taskmanagement.model.TaskCategory;
import com.instadeep.Taskmanagement.repository.TaskCategoryRepository;

public class TaskCategoryService {
    @Autowired
    private TaskCategoryRepository taskCategoryRepo; 

    public Optional<TaskCategory> getDetailsTaskCategory(UUID id){
        return taskCategoryRepo.findById(id);
        
    }
    public List<TaskCategory> getAllTaskCategories() {
        return taskCategoryRepo.findAll();
    }
    public TaskCategory saveTaskCategory(TaskCategory taskCategory) {
        return taskCategoryRepo.save(taskCategory);
    }

    public void deleteTaskCategory(UUID id) {
        taskCategoryRepo.deleteById(id);
    }

    public TaskCategory updateTaskCategory(UUID id, TaskCategory TaskCategoryDetails) {
        TaskCategory TaskCategory = taskCategoryRepo.findById(id).orElseThrow();
        TaskCategory.setCategoryName(TaskCategoryDetails.getCategoryName());
        
        return taskCategoryRepo.save(TaskCategory);
    }
}
