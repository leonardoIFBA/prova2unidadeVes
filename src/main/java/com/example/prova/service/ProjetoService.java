package com.example.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prova.Repository.ProjetoRepository;
import com.example.prova.model.Projeto;
import com.example.prova.model.Tarefa;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository repository;

    public List<Projeto> buscarTodos() {
        return null;
    }

    public Projeto buscarPorId(Long id) {
        return repository.;
    }

    public Projeto salvar(Projeto projeto) {
        
    }

    public void excluir(Long id) {
        
    }
}
