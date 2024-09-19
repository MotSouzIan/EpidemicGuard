package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.SintomaApplication;
import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.repositories.SintomaRepository;

import java.util.ArrayList;

public class SintomaFacade {

    private SintomaApplication sintomaApplication;

    public Sintoma buscarPorId(int id) {
        return sintomaApplication.buscarPorId(id);
    }

    public ArrayList<Sintoma> buscarTodos() {
        return sintomaApplication.buscarTodos();
    }

    public void salvar(int id, String descricao) {
        sintomaApplication.salvar(id, descricao);
    }

    public void atualizar(int id, Sintoma sintoma) {
        sintomaApplication.atualizar(id, sintoma);
    }

    public void remover(int id) {
        sintomaApplication.remover(id);
    }
}
