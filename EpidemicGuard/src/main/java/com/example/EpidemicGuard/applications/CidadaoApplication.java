package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.repositories.AdministradorRepository;
import com.example.EpidemicGuard.repositories.CidadaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CidadaoApplication {

    private CidadaoRepository cidadaoRepository;

    @Autowired
    public CidadaoApplication(AdministradorRepository administradorRepository){
        this.cidadaoRepository = cidadaoRepository;
    }


    public Cidadao buscarPorId(int id){
        return this.cidadaoRepository.buscarPorId(id);
    }

    public List<Cidadao> buscarTodos() {
        return this.cidadaoRepository.buscarTodos();
    }

    public void salvar(Cidadao cidadao) {
        this.cidadaoRepository.salvar(cidadao);
    }

    public void atualizar(int id, Cidadao cidadao) {
        this.cidadaoRepository.atualizar(id, cidadao);
    }

    public void remover(int id) {
        this.cidadaoRepository.remover(id);
    }
}
