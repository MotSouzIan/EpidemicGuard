package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.SintomaApplication;
import com.example.EpidemicGuard.entities.Sintoma;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SintomaFacade {

    private final SintomaApplication sintomaApplication;

    public SintomaFacade(SintomaApplication sintomaApplication) {
        this.sintomaApplication = sintomaApplication;
    }

    public Sintoma buscarPorId(int id) {
        return this.sintomaApplication.buscarPorId(id);
    }

    public List<Sintoma> buscarTodos() {
        return this.sintomaApplication.buscarTodos();
    }

    public void salvar(Sintoma sintoma) {
        this.sintomaApplication.salvar(sintoma);
    }

    public void atualizar(int id, Sintoma sintoma) {
        this.sintomaApplication.atualizar(id, sintoma);
    }

    public void remover(int id) {
        this.sintomaApplication.remover(id);
    }
}
