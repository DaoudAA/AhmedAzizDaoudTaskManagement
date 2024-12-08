package com.instadeep.Taskmanagement.Infrastructure;

import com.instadeep.Taskmanagement.repository.TaskRepository;
import com.instadeep.Taskmanagement.repository.TaskRepositoryCustom;

import org.springframework.stereotype.Repository;

import com.instadeep.Taskmanagement.model.Task;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;


public class TaskRepositoryImpl  implements TaskRepositoryCustom {

    @PersistenceContext
    private EntityManager em;
    
    @Autowired
    @Lazy
    TaskRepository taskRepository;

    @Override
    public List<Task> filterTaks(String prio){
            try {
                return em.createQuery("SELECT t FROM Task t WHERE t.priority = ':prio'", Task.class)
                .setParameter("prio", prio)         
                .getResultList();
            } catch (NoResultException e) {
                return Collections.emptyList();
            }
        }

    @Override
    public List<Task> sortTaks() {
        try {
            return em.createQuery("SELECT t FROM Task t ORDER BY t.priority", Task.class)         
            .getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    };
}
