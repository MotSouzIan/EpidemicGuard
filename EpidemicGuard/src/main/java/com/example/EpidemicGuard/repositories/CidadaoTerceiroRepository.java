package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.interfaces.IcidadaoTerceiro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;

@Repository
public class CidadaoTerceiroRepository implements IcidadaoTerceiro {

    ArrayList<CidadaoTerceiro> cidadaoTerceiro = new ArrayList<>();

    @Override
    public CidadaoTerceiro buscarPorId(int id) {
        CidadaoTerceiro cidadaoTerceiroInDb = cidadaoTerceiro.stream().filter(c -> c.getId() == id).findFirst().get();

        return cidadaoTerceiroInDb;
    }

    @Override
    public ArrayList<CidadaoTerceiro> buscarTodos() {
        return cidadaoTerceiro;
    }

    @Override
    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero) {
        CidadaoTerceiro cidadaoTerceiroInDb = new CidadaoTerceiro(id, nome, cpf, dataNascimento, genero);
        cidadaoTerceiro.add(cidadaoTerceiroInDb);
    }

    @Override
    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        CidadaoTerceiro cidadaoTerceiroInDb = buscarPorId(id);

        cidadaoTerceiroInDb.setNome(cidadaoTerceiro.getNome());
        cidadaoTerceiroInDb.setCpf(cidadaoTerceiro.getCpf());
        cidadaoTerceiroInDb.setDataNascimento(cidadaoTerceiro.getDataNascimento());
        cidadaoTerceiroInDb.setGenero(cidadaoTerceiro.getGenero());
    }

    @Override
    public void remover(int id) {

        cidadaoTerceiro.removeIf(c -> c.getId() == id);

    }

    @Override
    public void adicionar(CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiro.add(cidadaoTerceiro);
    }
}
