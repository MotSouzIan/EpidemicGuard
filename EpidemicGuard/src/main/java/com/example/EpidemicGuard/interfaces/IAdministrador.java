package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Administrador;


import java.util.List;

public interface IAdministrador {

    public Administrador buscarPorId(int id);

    public List<Administrador> buscarTodos();

    public void salvar(Administrador administrador);

    public void atualizar(int id, Administrador administrador);

    public void remover(int id);
}
