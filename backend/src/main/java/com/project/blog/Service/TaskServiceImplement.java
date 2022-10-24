package com.project.blog.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.blog.Dao.TaskDao;
import com.project.blog.Model.Task;

@Service
public class TaskServiceImplement  implements TaskService{
    @Autowired
    private TaskDao TaskDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Task> findAll()
    {
        return (List<Task>) TaskDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Task save(Task Task)
    {
        return TaskDao.save(Task);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Task findById(Integer id)
    {
        return TaskDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        TaskDao.deleteById(id);
    }
    
}