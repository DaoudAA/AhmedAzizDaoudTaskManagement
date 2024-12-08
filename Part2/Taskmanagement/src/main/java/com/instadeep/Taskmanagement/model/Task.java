package com.instadeep.Taskmanagement.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String description;
    
    @OneToMany(mappedBy = "tasks")
    private Set<TaskCategory> categories = new HashSet<>();
    private TaskPriority priority;
    private Date dueDate;
    
    public Task() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    
    public Task(UUID id, String title, String description, Set<TaskCategory> categories, TaskPriority priority,
            Date dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.categories = categories;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public Task(String title, String description, Set<TaskCategory> categories, TaskPriority priority, Date dueDate) {
        this.title = title;
        this.description = description;
        this.categories = categories;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<TaskCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<TaskCategory> categories) {
        this.categories = categories;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((categories == null) ? 0 : categories.hashCode());
        result = prime * result + ((priority == null) ? 0 : priority.hashCode());
        result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
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
        Task other = (Task) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (categories == null) {
            if (other.categories != null)
                return false;
        } else if (!categories.equals(other.categories))
            return false;
        if (priority != other.priority)
            return false;
        if (dueDate == null) {
            if (other.dueDate != null)
                return false;
        } else if (!dueDate.equals(other.dueDate))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", title=" + title + ", description=" + description + ", categories=" + categories
                + ", priority=" + priority + ", dueDate=" + dueDate + "]";
    }
    
    
}
