package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OcorrenciaUsuarioApplication {

    private OcorrenciaUsuarioApplication ocorrenciaUsuarioApplication;

    public OcorrenciaUsuario buscarPorId(int id) {
       return this.ocorrenciaUsuarioApplication.buscarPorId(id);
    }

    public ArrayList<OcorrenciaUsuario> buscarTodos() {
        return this.ocorrenciaUsuarioApplication.buscarTodos();
    }

    public void salvar(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {

        this.ocorrenciaUsuarioApplication.salvar(id, enderecoOcorrencia, moderado, logradouro, bairro, cidade, estado, cep);
    }

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {

        this.ocorrenciaUsuarioApplication.atualizar(id, ocorrenciaUsuario);
    }

    public void remover(int id) {

       this.ocorrenciaUsuarioApplication.remover(id);
    }

    public void adicionar(OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioApplication.adicionar(ocorrenciaUsuario);
    }
}
