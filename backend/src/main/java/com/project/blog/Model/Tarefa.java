package com.project.blog.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_tarefa")
public class Tarefa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer Id;
    
    @Column(name="Tarefa")
    private String Tarefa;
    
    @Column(name="Concluida")
    private Boolean Concluida;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTarefa() {
        return Tarefa;
    }

    public void setTarefa(String Tarefa) {
        this.Tarefa = Tarefa;
    }

    public Boolean getConcluida() {
        return Concluida;
    }

    public void setConcluida(Boolean Concluida) {
        this.Concluida = Concluida;
    }
    
}