package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class CidadaoTerceiroApplication {

    private CidadaoTerceiroApplication cidadaoTerceiroApplication;

    public CidadaoTerceiro buscarPorId(int id) {

       return this.cidadaoTerceiroApplication.buscarPorId(id);
    }

    public ArrayList<CidadaoTerceiro> buscarTodos() {

        return this.cidadaoTerceiroApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero) {

       this.cidadaoTerceiroApplication.salvar(id, nome, cpf, dataNascimento, genero);
    }

    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {

        this.cidadaoTerceiroApplication.atualizar(id, cidadaoTerceiro);
    }

    public void remover(int id) {

        this.cidadaoTerceiroApplication.remover(id);
    }

    public void adicionar(CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroApplication.adicionar(cidadaoTerceiro);
    }
}
