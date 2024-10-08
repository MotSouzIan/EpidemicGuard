package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Endereco;


import java.util.List;



public interface IEndereco {

    public Endereco buscarPorId(int id);

    public List<Endereco> buscarTodos();

    public void salvar(Endereco endereco);

    public void atualizar(int id, Endereco endereco);

    public void remover(int id);
}