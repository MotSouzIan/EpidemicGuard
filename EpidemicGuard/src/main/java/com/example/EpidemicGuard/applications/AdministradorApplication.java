package com.example.EpidemicGuard.applications;


import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;

import java.util.ArrayList;

public class AdministradorApplication {

    private AdministradorRepository administradorRepository;

    public AdministradorApplication(AdministradorRepository administradorRepository){

        this.administradorRepository = administradorRepository;
    }

    public Administrador buscarPorId(int id){

        return this.administradorRepository.buscarPorId(id);

    }

    public ArrayList<Administrador> buscarTodos() {

        return this.administradorRepository.buscarTodos();
    }

    public void salvar(int id, String nome, String senha, String cpf) {

        this.administradorRepository.salvar(id, nome, senha, cpf);
    }

    public void atualizar(int id, Administrador administrador) {
        this.administradorRepository.atualizar(id, administrador);

    }

    public void remover(int id) {
        this.administradorRepository.remover(id);

    }
}



