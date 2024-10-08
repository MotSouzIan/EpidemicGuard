package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.CidadaoApplication;
import com.example.EpidemicGuard.entities.Cidadao;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadaoFacade {

    private final CidadaoApplication cidadaoApplication;

    public CidadaoFacade(CidadaoApplication cidadaoApplication) {
        this.cidadaoApplication = cidadaoApplication;
    }

    public Cidadao buscarPorId(int id) {
        return this.cidadaoApplication.buscarPorId(id);
    }

    public List<Cidadao> buscarTodos() {
        return this.cidadaoApplication.buscarTodos();
    }

    public void salvar(Cidadao cidadao) {
        this.cidadaoApplication.salvar(cidadao);
    }

    public void atualizar(int id, Cidadao cidadao) {
        this.cidadaoApplication.atualizar(id, cidadao);
    }

    public void remover(int id) {
        this.cidadaoApplication.remover(id);
    }
}
