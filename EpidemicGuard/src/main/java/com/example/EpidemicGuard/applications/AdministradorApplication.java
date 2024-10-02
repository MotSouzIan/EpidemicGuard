package com.example.EpidemicGuard.applications;


import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
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

    public void adicionar(Administrador administrador) {
        this.administradorRepository.adicionar(administrador);
    }
}



