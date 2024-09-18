package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;

import java.util.ArrayList;
import java.util.Date;

public interface IcidadaoTerceiro {

    public CidadaoTerceiro buscarPorId(int id);

    public ArrayList<CidadaoTerceiro> buscarTodos();

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero);

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro);

    public void remover(int id);
}
