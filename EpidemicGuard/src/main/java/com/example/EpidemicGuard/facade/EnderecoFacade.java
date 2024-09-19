package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.EnderecoApplication;
import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.repositories.EnderecoRepository;

import java.util.ArrayList;

public class EnderecoFacade {

    private EnderecoApplication enderecoApplication;

    public Endereco buscarPorId(int id) {
        return enderecoApplication.buscarPorId(id);
    }

    public ArrayList<Endereco> buscarTodos() {
        return enderecoApplication.buscarTodos();
    }

    public void salvar(int id, String rua, String bairro, String cidade, String estado, String cep) {
        enderecoApplication.salvar(id, rua, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, Endereco endereco) {
        enderecoApplication.atualizar(id, endereco);
    }

    public void remover(int id) {
        enderecoApplication.remover(id);
    }
}
