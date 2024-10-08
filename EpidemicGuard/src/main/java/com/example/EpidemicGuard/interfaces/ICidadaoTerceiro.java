package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;


import java.util.List;



public interface ICidadaoTerceiro {

    public CidadaoTerceiro buscarPorId(int id);

    public List<CidadaoTerceiro> buscarTodos();

    public void salvar(CidadaoTerceiro cidadaoTerceiro);

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro);

    public void remover(int id);
}