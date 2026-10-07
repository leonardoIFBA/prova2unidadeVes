package com.example.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.Repository.TarefaRepository;
import com.example.prova.model.Tarefa;

public class TarefaService {
    @Autowired
    private TarefaRepository repository;

    public List<Tarefa> buscarTodos() {
        return null;
    }

    public Tarefa buscarPorId(Long id) {
        return repository.findById(id).get();
    }

    public Tarefa salvar(Tarefa tarefa) {
        
    }

    public void excluir(Long id) {
        
    }
}
