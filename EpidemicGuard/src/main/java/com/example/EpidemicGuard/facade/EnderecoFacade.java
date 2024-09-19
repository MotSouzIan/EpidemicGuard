package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.repositories.EnderecoRepository;

import java.util.ArrayList;

public class EnderecoFacade {

    private final EnderecoRepository enderecoRepository = new EnderecoRepository();

    public Endereco buscarPorId(int id) {
        return enderecoRepository.buscarPorId(id);
    }

    public ArrayList<Endereco> buscarTodos() {
        return enderecoRepository.buscarTodos();
    }

    public void salvar(int id, String rua, String bairro, String cidade, String estado, String cep) {
        enderecoRepository.salvar(id, rua, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, Endereco endereco) {
        enderecoRepository.atualizar(id, endereco);
    }

    public void remover(int id) {
        enderecoRepository.remover(id);
    }
}
