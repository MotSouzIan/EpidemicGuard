package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.repositories.OcorrenciaUsuarioRepository;

import java.util.ArrayList;

public class OcorrenciaUsuarioFacade {

    private final OcorrenciaUsuarioRepository ocorrenciaUsuarioRepository = new OcorrenciaUsuarioRepository();

    public OcorrenciaUsuario buscarPorId(int id) {
        return ocorrenciaUsuarioRepository.buscarPorId(id);
    }

    public ArrayList<OcorrenciaUsuario> buscarTodos() {
        return ocorrenciaUsuarioRepository.buscarTodos();
    }

    public void salvar(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {
        ocorrenciaUsuarioRepository.salvar(id, enderecoOcorrencia, moderado, logradouro, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {
        ocorrenciaUsuarioRepository.atualizar(id, ocorrenciaUsuario);
    }

    public void remover(int id) {
        ocorrenciaUsuarioRepository.remover(id);
    }
}
