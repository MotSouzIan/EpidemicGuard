package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.repositories.SintomaRepository;

import java.util.ArrayList;

public class SintomaFacade {

    private final SintomaRepository sintomaRepository = new SintomaRepository();

    public Sintoma buscarPorId(int id) {
        return sintomaRepository.buscarPorId(id);
    }

    public ArrayList<Sintoma> buscarTodos() {
        return sintomaRepository.buscarTodos();
    }

    public void salvar(int id, String descricao) {
        sintomaRepository.salvar(id, descricao);
    }

    public void atualizar(int id, Sintoma sintoma) {
        sintomaRepository.atualizar(id, sintoma);
    }

    public void remover(int id) {
        sintomaRepository.remover(id);
    }
}
