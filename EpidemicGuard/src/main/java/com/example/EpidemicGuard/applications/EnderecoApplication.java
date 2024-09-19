package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Endereco;

import java.util.ArrayList;

public class EnderecoApplication {

    private EnderecoApplication enderecoApplication;

    public Endereco buscarPorId(int id) {

        return this.enderecoApplication.buscarPorId(id);
    }

    public ArrayList<Endereco> buscarTodos() {

        return this.enderecoApplication.buscarTodos();
    }

    public void salvar(int id, String rua, String bairro, String cidade, String estado, String cep) {

       this.enderecoApplication.salvar(id, rua, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, Endereco endereco) {

        this.enderecoApplication.atualizar(id, endereco);
    }

    public void remover(int id) {

        this.enderecoApplication.remover(id);
    }
}
