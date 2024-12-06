package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.OcorrenciaUsuarioApplication;
import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.models.Relatorio;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OcorrenciaUsuarioFacade {

    private final OcorrenciaUsuarioApplication ocorrenciaUsuarioApplication;

    public OcorrenciaUsuarioFacade(OcorrenciaUsuarioApplication ocorrenciaUsuarioApplication) {
        this.ocorrenciaUsuarioApplication = ocorrenciaUsuarioApplication;
    }

    public OcorrenciaUsuario buscarPorId(int id) {
        return this.ocorrenciaUsuarioApplication.buscarPorId(id);
    }

    public List<OcorrenciaUsuario> buscarTodos() {
        return this.ocorrenciaUsuarioApplication.buscarTodos();
    }

    public void salvar(OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioApplication.salvar(ocorrenciaUsuario);
    }

    public void atualizar(int id, OcorrenciaUsuario ocorrencia) {
        this.ocorrenciaUsuarioApplication.atualizar(id, ocorrencia);
    }

    public void remover(int id) {
        this.ocorrenciaUsuarioApplication.remover(id);
    }

    public List<Object[]> relatorio() {
        return this.ocorrenciaUsuarioApplication.relatorio();
    }

}
