package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;


import java.util.List;



public interface IOcorrenciaUsuario {

    public OcorrenciaUsuario buscarPorId(int id);

    public List<OcorrenciaUsuario> buscarTodos();

    public void salvar(OcorrenciaUsuario ocorrenciaUsuario);

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario);

    public void remover(int id);
}