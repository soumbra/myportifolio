package com.myportfolio.service;

import com.myportfolio.repository.ProjetoRepository;
import com.myportfolio.model.Projeto;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProjetoService {
    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public List<Projeto> listarTodos() {
        return repository.findAll();
    }

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }
}

