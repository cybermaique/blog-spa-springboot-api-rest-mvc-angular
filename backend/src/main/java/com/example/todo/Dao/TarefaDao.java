package com.example.todo.Dao;
import org.springframework.data.repository.CrudRepository;

import com.example.todo.Model.Tarefa;

public interface TarefaDao extends CrudRepository<Tarefa, Integer>{
	
}
