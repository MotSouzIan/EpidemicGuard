package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Endereco;

import java.util.ArrayList;

public interface Iendereco {

    public Endereco buscarPorId(int id);

    public ArrayList<Endereco> buscarTodos();

    public void salvar(int id, String rua, String bairro, String cidade, String estado, String cep);

    public void atualizar(int id, Endereco endereco);

    public void remover(int id);
}
