package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.PandemiaApplication;
import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.repositories.PandemiaRepository;

import java.util.ArrayList;

public class PandemiaFacade {

    private PandemiaApplication pandemiaApplication;

    public Pandemia buscarPorId(int id) {
        return pandemiaApplication.buscarPorId(id);
    }

    public ArrayList<Pandemia> buscarTodos() {
        return pandemiaApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String guia) {
        pandemiaApplication.salvar(id, nome, guia);
    }

    public void atualizar(int id, Pandemia pandemia) {
        pandemiaApplication.atualizar(id, pandemia);
    }

    public void remover(int id) {
        pandemiaApplication.remover(id);
    }
}
