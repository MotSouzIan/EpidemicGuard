package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Pandemia;

import java.util.ArrayList;

public interface Ipandemia {

    public Pandemia buscarPorId(int id);

    public ArrayList<Pandemia> buscarTodos();

    public void salvar(int id, String nome, String guia);

    public void atualizar(int id, Pandemia pandemia);

    public void remover(int id);

    public void adicionar(Pandemia pandemia);
}
