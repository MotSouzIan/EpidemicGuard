package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.CidadaoTerceiroApplication;
import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.repositories.CidadaoTerceiroRepository;

import java.util.ArrayList;
import java.util.Date;

public class CidadaoTerceiroFacade {

    private CidadaoTerceiroApplication cidadaoTerceiroApplication;

    public CidadaoTerceiro buscarPorId(int id) {
        return cidadaoTerceiroApplication.buscarPorId(id);
    }

    public ArrayList<CidadaoTerceiro> buscarTodos() {
        return cidadaoTerceiroApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero) {
        cidadaoTerceiroApplication.salvar(id, nome, cpf, dataNascimento, genero);
    }

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        cidadaoTerceiroApplication.atualizar(id, cidadaoTerceiro);
    }

    public void remover(int id) {
        cidadaoTerceiroApplication.remover(id);
    }
}
