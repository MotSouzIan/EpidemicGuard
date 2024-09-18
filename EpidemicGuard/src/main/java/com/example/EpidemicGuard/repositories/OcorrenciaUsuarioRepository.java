package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.interfaces.IocorrenciaUsuario;

import java.util.ArrayList;

public class OcorrenciaUsuarioRepository implements IocorrenciaUsuario {

    ArrayList<OcorrenciaUsuario> ocorrenciaUsuario = new ArrayList<>();

    @Override
    public OcorrenciaUsuario buscarPorId(int id) {
        OcorrenciaUsuario ocoorrenciaInDb = ocorrenciaUsuario.stream().filter(x -> x.getId() == id).findFirst().get();

        return ocoorrenciaInDb;
    }

    @Override
    public ArrayList<OcorrenciaUsuario> buscarTodos() {
        return ocorrenciaUsuario;
    }

    @Override
    public void salvar(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {

        OcorrenciaUsuario ocorrenciaInDb = new OcorrenciaUsuario(id, enderecoOcorrencia, moderado, logradouro, bairro, cidade, estado, cep);
        ocorrenciaUsuario.add(ocorrenciaInDb);
    }

    @Override
    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {
        OcorrenciaUsuario ocorrenciaUsuarioInDb = buscarPorId(id);

        ocorrenciaUsuarioInDb.setEnderecoOcorrencia(ocorrenciaUsuario.getEnderecoOcorrencia());
        ocorrenciaUsuarioInDb.setModerado(ocorrenciaUsuario.getModerado());
        ocorrenciaUsuarioInDb.setLogradouro(ocorrenciaUsuario.getLogradouro());
        ocorrenciaUsuarioInDb.setBairro(ocorrenciaUsuario.getBairro());
        ocorrenciaUsuarioInDb.setCidade(ocorrenciaUsuario.getCidade());
        ocorrenciaUsuarioInDb.setEstado(ocorrenciaUsuario.getEstado());
        ocorrenciaUsuarioInDb.setCep(ocorrenciaUsuario.getCep());
    }

    @Override
    public void remover(int id) {
        ocorrenciaUsuario.removeIf(x -> x.getId() == id);
    }
}
