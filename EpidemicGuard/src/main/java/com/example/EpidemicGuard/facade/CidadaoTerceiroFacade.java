package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.CidadaoTerceiroApplication;
import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CidadaoTerceiroFacade {

    private final CidadaoTerceiroApplication cidadaoTerceiroApplication;

    public CidadaoTerceiroFacade(CidadaoTerceiroApplication cidadaoTerceiroApplication) {
        this.cidadaoTerceiroApplication = cidadaoTerceiroApplication;
    }

    public CidadaoTerceiro buscarPorId(int id) {
        return this.cidadaoTerceiroApplication.buscarPorId(id);
    }

    public List<CidadaoTerceiro> buscarTodos() {
        return this.cidadaoTerceiroApplication.buscarTodos();
    }

    public void salvar(CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroApplication.salvar(cidadaoTerceiro);
    }

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroApplication.atualizar(id, cidadaoTerceiro);
    }

    public void remover(int id) {
        this.cidadaoTerceiroApplication.remover(id);
    }
}
