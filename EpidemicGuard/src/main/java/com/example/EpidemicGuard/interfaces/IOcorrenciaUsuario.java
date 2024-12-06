package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;


import java.util.List;



public interface IOcorrenciaUsuario {

    OcorrenciaUsuario buscarPorId(int id);

    List<OcorrenciaUsuario> buscarTodos();

    void salvar(OcorrenciaUsuario ocorrenciaUsuario);

    void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario);

    void remover(int id);

    List<Object[]> relatorio();
}