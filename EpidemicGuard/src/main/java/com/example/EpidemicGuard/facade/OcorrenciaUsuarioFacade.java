package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.OcorrenciaUsuarioApplication;
import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.repositories.OcorrenciaUsuarioRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class OcorrenciaUsuarioFacade {

    private OcorrenciaUsuarioApplication ocorrenciaUsuarioApplication;
    public OcorrenciaUsuario buscarPorId(int id) {
        return ocorrenciaUsuarioApplication.buscarPorId(id);
    }

    public ArrayList<OcorrenciaUsuario> buscarTodos() {
        return ocorrenciaUsuarioApplication.buscarTodos();
    }

    public void salvar(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {
        ocorrenciaUsuarioApplication.salvar(id, enderecoOcorrencia, moderado, logradouro, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {
        ocorrenciaUsuarioApplication.atualizar(id, ocorrenciaUsuario);
    }

    public void remover(int id) {
        ocorrenciaUsuarioApplication.remover(id);
    }

    public void adicionar(OcorrenciaUsuario ocorrenciaUsuario) {
        ocorrenciaUsuarioApplication.adicionar(ocorrenciaUsuario);
    }
}
