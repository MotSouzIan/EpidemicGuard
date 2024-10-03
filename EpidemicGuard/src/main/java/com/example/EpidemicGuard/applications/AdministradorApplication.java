package com.example.EpidemicGuard.applications;


import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdministradorApplication {

    private final AdministradorRepository administradorRepository;

    @Autowired
    public AdministradorApplication(AdministradorRepository administradorRepository){
        this.administradorRepository = administradorRepository;
    }

    public Administrador buscarPorId(int id){
        return this.administradorRepository.buscarPorId(id);
    }

    public List<Administrador> buscarTodos() {
        return this.administradorRepository.buscarTodos();
    }

    public void salvar(Administrador administrador) {
        this.administradorRepository.salvar(administrador);
    }

    public void atualizar(int id, Administrador administrador) {
        this.administradorRepository.atualizar(id, administrador);
    }

    public void remover(int id) {
        this.administradorRepository.remover(id);
    }
}



