package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.repositories.PandemiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PandemiaApplication {

    private final PandemiaRepository pandemiaRepository;

    @Autowired
    public PandemiaApplication(PandemiaRepository administradorRepository){
        this.pandemiaRepository = administradorRepository;
    }

    public Pandemia buscarPorId(int id){
        return this.pandemiaRepository.buscarPorId(id);
    }

    public List<Pandemia> buscarTodos() {
        return this.pandemiaRepository.buscarTodos();
    }

    public void salvar(Pandemia pandemia) {
        this.pandemiaRepository.salvar(pandemia);
    }

    public void atualizar(int id, Pandemia pandemia) {
        this.pandemiaRepository.atualizar(id, pandemia);
    }

    public void remover(int id) {
        this.pandemiaRepository.remover(id);
    }
}
