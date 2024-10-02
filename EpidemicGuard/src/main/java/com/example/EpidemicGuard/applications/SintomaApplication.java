package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Sintoma;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SintomaApplication {

    private SintomaApplication sintomaApplication;

    public Sintoma buscarPorId(int id) {

        return this.sintomaApplication.buscarPorId(id);
    }

    public ArrayList<Sintoma> buscarTodos() {

        return this.sintomaApplication.buscarTodos();
    }

    public void salvar(int id, String descricao) {

        this.sintomaApplication.salvar(id, descricao);
    }

    public void atualizar(int id, Sintoma sintoma) {

        this.sintomaApplication.atualizar(id, sintoma);
    }

    public void remover(int id) {

        this.sintomaApplication.remover(id);
    }

    public void adicionar(Sintoma sintoma) {
        this.sintomaApplication.adicionar(sintoma);
    }
}
