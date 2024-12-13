package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.PandemiaSintoma;


import java.util.List;



public interface IPandemiaSintoma {

    public PandemiaSintoma buscarPorId(int id);

    public List<PandemiaSintoma> buscarTodos();

    public void salvar(PandemiaSintoma pandemiaSintoma);

    public void atualizar(int id, PandemiaSintoma pandemiaSintoma);

    public void remover(int id);
}
