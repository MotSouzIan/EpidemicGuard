package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.interfaces.Icidadao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public class CidadaoRepository implements Icidadao {

    ArrayList<Cidadao> cidadao = new ArrayList<>();

    @Override
    public Cidadao buscarPorId(int id) {
        Cidadao cidadaoInDb = cidadao.stream().filter(c -> c.getId() == id).findFirst().get();

        return cidadaoInDb;
    }

    @Override
    public ArrayList<Cidadao> buscarTodas() {

        return cidadao;
    }

    @Override
    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero, String senha) {

        Cidadao cidadaoIndDb = new Cidadao(id, nome, cpf, dataNascimento, genero, senha);
        cidadao.add(cidadaoIndDb);
    }

    @Override
    public void atualizar(int id, Cidadao cidadao) {

        Cidadao cidadaoInDb = buscarPorId(id);

        cidadaoInDb.setNome(cidadao.getNome());
        cidadaoInDb.setCpf(cidadao.getCpf());
        cidadaoInDb.setDataNascimento(cidadao.getDataNascimento());
        cidadaoInDb.setGenero(cidadao.getGenero());
        cidadaoInDb.setSenha(cidadao.getSenha());

    }

    @Override
    public void remover(int id) {
        cidadao.removeIf(c -> c.getId() == id);
    }

    @Override
    public void adicionar(Cidadao cidadao) {
        this.cidadao.add(cidadao);
    }
}
