package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.repositories.CidadaoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class CidadaoApplication {

    private CidadaoRepository cidadaoRepository;

    public Cidadao buscarPorId(int id) {
        return this.cidadaoRepository.buscarPorId(id);
    }

    public ArrayList<Cidadao> buscarTodos() {
        return this.cidadaoRepository.buscarTodas();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero, String senha) {

        this.cidadaoRepository.salvar(id, nome, cpf, dataNascimento, genero, senha);
    }

    public void atualizar(int id, Cidadao cidadao) {

        this.cidadaoRepository.atualizar(id, cidadao);
    }

    public void remover(int id) {
        this.cidadaoRepository.remover(id);
    }

    public void adicionar(Cidadao cidadao) {
        this.cidadaoRepository.adicionar(cidadao);
    }
}
