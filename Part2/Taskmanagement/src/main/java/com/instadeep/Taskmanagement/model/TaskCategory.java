package com.instadeep.Taskmanagement.model;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TaskCategory  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String categoryName;

    
    public TaskCategory() {
    }

    
    public TaskCategory(UUID id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    @Override
    public String toString() {
        return "TaskCategory [id=" + id + ", categoryName=" + categoryName + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((categoryName == null) ? 0 : categoryName.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TaskCategory other = (TaskCategory) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (categoryName == null) {
            if (other.categoryName != null)
                return false;
        } else if (!categoryName.equals(other.categoryName))
            return false;
        return true;
    }
    

    
    
}
