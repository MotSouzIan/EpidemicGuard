package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.AdministradorApplication;
import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdministradorFacade {

    private final AdministradorApplication administradorApplication;

    public AdministradorFacade(AdministradorApplication administradorApplication) {
        this.administradorApplication = administradorApplication;
    }

    public Administrador buscarPorId(int id) {
        return this.administradorApplication.buscarPorId(id);
    }

    public List<Administrador> buscarTodos() {
        return this.administradorApplication.buscarTodos();
    }

    public void salvar(Administrador administrador) {
        this.administradorApplication.salvar(administrador);
    }

    public void atualizar(int id, Administrador admin) {
        this.administradorApplication.atualizar(id, admin);
    }

    public void remover(int id) {
        this.administradorApplication.remover(id);
    }
}
