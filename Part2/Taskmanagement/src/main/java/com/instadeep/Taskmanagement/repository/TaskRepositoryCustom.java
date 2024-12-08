package com.instadeep.Taskmanagement.repository;

import java.util.List;

import com.instadeep.Taskmanagement.model.Task;

import jakarta.transaction.Transactional;

public interface TaskRepositoryCustom {
    
    
    @Transactional
    List<Task> sortTaks();
    List<Task> filterTaks(String prio);

}