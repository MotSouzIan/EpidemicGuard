package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Pandemia;


import java.util.List;



public interface IPandemia {

    public Pandemia buscarPorId(int id);

    public List<Pandemia> buscarTodos();

    public void salvar(Pandemia pandemia);

    public void atualizar(int id, Pandemia pandemia);

    public void remover(int id);
}