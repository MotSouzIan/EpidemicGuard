package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.interfaces.Iadministrador;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class AdministradorRepository implements Iadministrador {

    ArrayList<Administrador> administrador = new ArrayList<>();

    @Override
    public Administrador buscarPorId(int id) {
        Administrador adminInDb = administrador.stream().filter(admin -> admin.getId() == id).findFirst().get();

        return adminInDb;
    }

    @Override
    public ArrayList<Administrador> buscarTodos() {

        return administrador;
    }

    @Override
    public void salvar(int id, String nome, String senha, String cpf) {

        Administrador admin = new Administrador(id, nome, senha, cpf);
        administrador.add(admin);
    }

    @Override
    public void atualizar(int id, Administrador administrador) {
        Administrador adminInDb = buscarPorId(id);

        adminInDb.setNome(administrador.getNome());
        adminInDb.setSenha(administrador.getSenha());
        adminInDb.setCpf(administrador.getCpf());

    }

    @Override
    public void remover(int id) {
        administrador.removeIf(admin -> admin.getId() == id);
    }

    @Override
    public void adicionar(Administrador administrador) {
        this.administrador.add(administrador);
    }
}
