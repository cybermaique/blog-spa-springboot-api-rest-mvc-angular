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

import com.project.blog.Model.Tarefa;
import com.project.blog.Service.TarefaService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class TarefaController {
    @Autowired
    private TarefaService TarefaService;
    
    @GetMapping("/tarefas")
    public List<Tarefa> listar()
    {
        return TarefaService.findAll();
    }
    
    @PostMapping("/tarefas")
    public  Tarefa salvar(@RequestBody Tarefa Tarefa)
    {
        return TarefaService.save(Tarefa);
    }
    
    @GetMapping("/tarefas/{id}")
    public Tarefa getUnaTarefa(@PathVariable Integer id)
    {
        return TarefaService.findById(id);
    }
    
    @PutMapping("/tarefas/{id}")
    public Tarefa modifecar(@RequestBody Tarefa Tarefa,@PathVariable Integer id)
    {
        Tarefa TarefaActual= TarefaService.findById(id);
        TarefaActual.setTarefa(Tarefa.getTarefa());
        TarefaActual.setConcluida(Tarefa.getConcluida());
        
        return TarefaService.save(TarefaActual);
    }
    
    @DeleteMapping("/tarefas/{id}")
    public void eliminar(@PathVariable Integer id)
    {
        TarefaService.delete(id);
    }
    
}