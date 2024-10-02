package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Sintoma;

import java.util.ArrayList;

public interface Isintoma {

    public Sintoma buscarPorId(int id);

    public ArrayList<Sintoma> buscarTodos();

    public void salvar(int id, String descricao);

    public void atualizar(int id, Sintoma sintoma);

    public void remover(int id);

    public void adicionar(Sintoma sintoma);
}
