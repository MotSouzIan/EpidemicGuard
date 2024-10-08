package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.repositories.CidadaoTerceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CidadaoTerceiroApplication {

    private CidadaoTerceiroRepository cidadaoTerceiroRepository;

    @Autowired
    public CidadaoTerceiroApplication(CidadaoTerceiroRepository cidadaoTerceiroRepository){
        this.cidadaoTerceiroRepository = cidadaoTerceiroRepository;
    }


    public CidadaoTerceiro buscarPorId(int id){
        return this.cidadaoTerceiroRepository.buscarPorId(id);
    }

    public List<CidadaoTerceiro> buscarTodos() {
        return this.cidadaoTerceiroRepository.buscarTodos();
    }

    public void salvar(CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroRepository.salvar(cidadaoTerceiro);
    }

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroRepository.atualizar(id, cidadaoTerceiro);
    }

    public void remover(int id) {
        this.cidadaoTerceiroRepository.remover(id);
    }
}
