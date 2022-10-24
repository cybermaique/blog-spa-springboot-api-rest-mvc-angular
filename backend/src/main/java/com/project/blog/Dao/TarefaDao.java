package com.project.blog.Dao;
import org.springframework.data.repository.CrudRepository;

import com.project.blog.Model.Tarefa;

public interface TarefaDao extends CrudRepository<Tarefa, Integer>{
	
}
