package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.repositories.OcorrenciaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OcorrenciaUsuarioApplication {

    private final OcorrenciaUsuarioRepository ocorrenciaUsuarioRepository;

    @Autowired
    public OcorrenciaUsuarioApplication(OcorrenciaUsuarioRepository ocorrenciaUsuarioRepository){
        this.ocorrenciaUsuarioRepository = ocorrenciaUsuarioRepository;
    }

    public OcorrenciaUsuario buscarPorId(int id){
        return this.ocorrenciaUsuarioRepository.buscarPorId(id);
    }

    public List<OcorrenciaUsuario> buscarTodos() {
        return this.ocorrenciaUsuarioRepository.buscarTodos();
    }

    public void salvar(OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioRepository.salvar(ocorrenciaUsuario);
    }

    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioRepository.atualizar(id, ocorrenciaUsuario);
    }

    public void remover(int id) {
        this.ocorrenciaUsuarioRepository.remover(id);
    }

    public List<Object[]> relatorio() {
        return this.ocorrenciaUsuarioRepository.relatorio();
    }

}

