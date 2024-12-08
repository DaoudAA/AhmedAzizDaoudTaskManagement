package com.instadeep.Taskmanagement.repository;

import org.springframework.stereotype.Repository;

import com.instadeep.Taskmanagement.model.Task;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskRepository extends JpaRepository<Task , UUID> , TaskRepositoryCustom{
    
    
    

}
