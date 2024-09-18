package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Administrador;

import java.util.ArrayList;

public interface Iadministrador {

    public Administrador buscarAdministrador(int id);

    public ArrayList<Administrador> buscarTodos();

    public void salvar(int id, String nome, String senha, String cpf);

    public void atualizar(int id, Administrador administrador);

    public void remover(int id);
}
