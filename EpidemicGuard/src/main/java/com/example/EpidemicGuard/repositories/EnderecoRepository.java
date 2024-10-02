package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.interfaces.Iendereco;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EnderecoRepository implements Iendereco {

    ArrayList<Endereco> endereco = new ArrayList<>();

    @Override
    public Endereco buscarPorId(int id) {
        Endereco enderecoInDb = endereco.stream().filter(e -> e.getId() == id).findFirst().get();

        return enderecoInDb;
    }

    @Override
    public ArrayList<Endereco> buscarTodos() {
        return endereco;
    }

    @Override
    public void salvar(int id, String rua, String bairro, String cidade, String estado, String cep) {

        Endereco enderecoInDb = new Endereco(id, rua, bairro, cidade, estado, cep);
        endereco.add(enderecoInDb);
    }

    @Override
    public void atualizar(int id, Endereco endereco) {
        Endereco enderecoInDb = buscarPorId(id);

        enderecoInDb.setRua(endereco.getRua());
        enderecoInDb.setBairro(endereco.getBairro());
        enderecoInDb.setCidade(endereco.getCidade());
        enderecoInDb.setEstado(endereco.getEstado());
        enderecoInDb.setCep(endereco.getCep());
    }

    @Override
    public void remover(int id) {
        endereco.removeIf(e -> e.getId() == id);
    }

    @Override
    public void adicionar(Endereco endereco) {
        this.endereco.add(endereco);
    }
}
