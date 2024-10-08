package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Sintoma;


import java.util.List;

public interface ISintoma {

    public Sintoma buscarPorId(int id);

    public List<Sintoma> buscarTodos();

    public void salvar(Sintoma sintoma);

    public void atualizar(int id, Sintoma sintoma);

    public void remover(int id);
}