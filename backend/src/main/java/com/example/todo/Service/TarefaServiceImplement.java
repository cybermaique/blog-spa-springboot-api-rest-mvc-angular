package com.example.todo.Service;

import com.example.todo.Dao.TarefaDao;
import com.example.todo.Model.Tarefa;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TarefaServiceImplement  implements TarefaService{
    @Autowired
    private TarefaDao TarefaDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Tarefa> findAll()
    {
        return (List<Tarefa>) TarefaDao.findAll();
    }
    
    @Override
     @Transactional(readOnly=false)
    public Tarefa save(Tarefa Tarefa)
    {
        return TarefaDao.save(Tarefa);
    }
    
    @Override
     @Transactional(readOnly=true)
    public Tarefa findById(Integer id)
    {
        return TarefaDao.findById(id).orElse(null);
    }
    
    @Override
     @Transactional(readOnly=false)
    public void delete(Integer id)
    {
        TarefaDao.deleteById(id);
    }
    
}