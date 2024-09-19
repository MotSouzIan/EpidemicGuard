package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.repositories.CidadaoRepository;

import java.util.ArrayList;
import java.util.Date;

public class CidadaoFacade {

    private final CidadaoRepository cidadaoRepository = new CidadaoRepository();

    public Cidadao buscarPorId(int id) {
        return cidadaoRepository.buscarPorId(id);
    }

    public ArrayList<Cidadao> buscarTodos() {
        return cidadaoRepository.buscarTodas();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero, String senha) {
        cidadaoRepository.salvar(id, nome, cpf, dataNascimento, genero, senha);
    }

    public void atualizar(int id, Cidadao cidadao) {
        cidadaoRepository.atualizar(id, cidadao);
    }

    public void remover(int id) {
        cidadaoRepository.remover(id);
    }
}
