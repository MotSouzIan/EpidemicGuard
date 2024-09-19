package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.AdministradorApplication;
import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;

import java.util.ArrayList;

public class AdministradorFacade {

    private AdministradorApplication administradorApplication;

    public Administrador buscarPorId(int id) {
        return administradorApplication.buscarPorId(id);
    }

    public ArrayList<Administrador> buscarTodos() {
        return administradorApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String senha, String cpf) {
        administradorApplication.salvar(id, nome, senha, cpf);
    }

    public void atualizar(int id, Administrador admin) {
        administradorApplication.atualizar(id, admin);
    }

    public void remover(int id) {
        administradorApplication.remover(id);
    }
}
