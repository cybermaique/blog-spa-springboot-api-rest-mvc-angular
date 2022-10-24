package com.project.blog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.Model.Task;
import com.project.blog.Service.TaskService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService TaskService;
    
    @GetMapping("/tasks")
    public List<Task> list()
    {
        return TaskService.findAll();
    }
    
    @PostMapping("/tasks")
    public  Task save(@RequestBody Task Task)
    {
        return TaskService.save(Task);
    }
    
    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable Integer id)
    {
        return TaskService.findById(id);
    }
    
    @PutMapping("/tasks/{id}")
    public Task edit(@RequestBody Task Task,@PathVariable Integer id)
    {
        Task currentTask= TaskService.findById(id);
        currentTask.setTask(Task.getTask());
        currentTask.setDone(Task.getDone());
        
        return TaskService.save(currentTask);
    }
    
    @DeleteMapping("/tasks/{id}")
    public void delete(@PathVariable Integer id)
    {
        TaskService.delete(id);
    }
    
}