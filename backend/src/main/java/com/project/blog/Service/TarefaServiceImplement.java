package com.project.blog.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.blog.Dao.TarefaDao;
import com.project.blog.Model.Tarefa;

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