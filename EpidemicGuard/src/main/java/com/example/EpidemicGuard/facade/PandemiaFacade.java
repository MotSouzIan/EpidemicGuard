package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.repositories.PandemiaRepository;

import java.util.ArrayList;

public class PandemiaFacade {

    private final PandemiaRepository pandemiaRepository = new PandemiaRepository();

    public Pandemia buscarPorId(int id) {
        return pandemiaRepository.buscarPorId(id);
    }

    public ArrayList<Pandemia> buscarTodos() {
        return pandemiaRepository.buscarTodos();
    }

    public void salvar(int id, String nome, String guia) {
        pandemiaRepository.salvar(id, nome, guia);
    }

    public void atualizar(int id, Pandemia pandemia) {
        pandemiaRepository.atualizar(id, pandemia);
    }

    public void remover(int id) {
        pandemiaRepository.remover(id);
    }
}
