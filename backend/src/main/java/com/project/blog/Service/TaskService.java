package com.project.blog.Service;

import java.util.List;

import com.project.blog.Model.Task;

public interface TaskService {
    public List<Task> findAll();
    public Task save(Task task);
    public Task findById(Integer id);
    public void delete(Integer id);
    
}
