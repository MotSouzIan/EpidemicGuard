package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.CidadaoApplication;
import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.repositories.CidadaoRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
public class CidadaoFacade {

    private CidadaoApplication cidadaoApplication;

    public Cidadao buscarPorId(int id) {
        return cidadaoApplication.buscarPorId(id);
    }

    public ArrayList<Cidadao> buscarTodos() {
        return cidadaoApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero, String senha) {
        cidadaoApplication.salvar(id, nome, cpf, dataNascimento, genero, senha);
    }

    public void atualizar(int id, Cidadao cidadao) {
        cidadaoApplication.atualizar(id, cidadao);
    }

    public void remover(int id) {
        cidadaoApplication.remover(id);
    }

    public void adicionar(Cidadao cidadao) {
        cidadaoApplication.adicionar(cidadao);
    }
}
