package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.repositories.AdministradorRepository;

import java.util.ArrayList;

public class AdministradorFacade {

    private final AdministradorRepository administradorRepository = new AdministradorRepository();

    public Administrador buscarPorId(int id) {
        return administradorRepository.buscarPorId(id);
    }

    public ArrayList<Administrador> buscarTodos() {
        return administradorRepository.buscarTodos();
    }

    public void salvar(int id, String nome, String senha, String cpf) {
        administradorRepository.salvar(id, nome, senha, cpf);
    }

    public void atualizar(int id, Administrador admin) {
        administradorRepository.atualizar(id, admin);
    }

    public void remover(int id) {
        administradorRepository.remover(id);
    }
}
