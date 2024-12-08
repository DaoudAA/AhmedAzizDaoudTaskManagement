package com.instadeep.Taskmanagement.repository;

import org.springframework.stereotype.Repository;

import com.instadeep.Taskmanagement.model.TaskCategory;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskCategoryRepository extends JpaRepository<TaskCategory, UUID>{

}
