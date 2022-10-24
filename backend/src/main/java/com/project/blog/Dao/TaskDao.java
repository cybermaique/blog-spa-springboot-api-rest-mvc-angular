package com.project.blog.Dao;
import org.springframework.data.repository.CrudRepository;

import com.project.blog.Model.Task;

public interface TaskDao extends CrudRepository<Task, Integer>{
	
}
