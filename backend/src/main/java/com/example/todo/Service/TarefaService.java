package com.example.todo.Service;

import java.util.List;

import com.example.todo.Model.Tarefa;

public interface TarefaService {
    public List<Tarefa> findAll();
    public Tarefa save(Tarefa tarea);
    public Tarefa findById(Integer id);
    public void delete(Integer id);
    
}
