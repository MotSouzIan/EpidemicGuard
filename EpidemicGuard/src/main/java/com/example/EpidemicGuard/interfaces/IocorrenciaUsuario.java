package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;

import java.util.ArrayList;

public interface IocorrenciaUsuario {

    public OcorrenciaUsuario buscarPorId(int id);

    public ArrayList<OcorrenciaUsuario> buscarTodos();

    public void salvar(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep);

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario);

    public void remover(int id);
}
