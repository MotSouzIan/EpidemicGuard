package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.repositories.CidadaoTerceiroRepository;

import java.util.ArrayList;
import java.util.Date;

public class CidadaoTerceiroFacade {

    private final CidadaoTerceiroRepository cidadaoTerceiroRepository = new CidadaoTerceiroRepository();

    public CidadaoTerceiro buscarPorId(int id) {
        return cidadaoTerceiroRepository.buscarPorId(id);
    }

    public ArrayList<CidadaoTerceiro> buscarTodos() {
        return cidadaoTerceiroRepository.buscarTodos();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero) {
        cidadaoTerceiroRepository.salvar(id, nome, cpf, dataNascimento, genero);
    }

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        cidadaoTerceiroRepository.atualizar(id, cidadaoTerceiro);
    }

    public void remover(int id) {
        cidadaoTerceiroRepository.remover(id);
    }
}
