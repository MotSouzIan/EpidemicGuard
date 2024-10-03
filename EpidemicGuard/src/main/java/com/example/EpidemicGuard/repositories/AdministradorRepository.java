package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.interfaces.IAdministrador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class AdministradorRepository implements IAdministrador {
    private EntityManager entityManager;


    @Autowired
    public AdministradorRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Administrador buscarPorId(int id) {
        return this.entityManager.find(Administrador.class, id);
    }

    @Override
    public List<Administrador> buscarTodos() {
        return entityManager
                .createQuery("select s from Administrador s ORDER BY s.nome", Administrador.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(Administrador administrador) {
        this.entityManager.persist(administrador);
    }

    @Override
    @Transactional
    public void atualizar(int id, Administrador administrador) {
        Administrador administradorInDb =  this.entityManager.find(Administrador.class, id);

        administradorInDb.setNome(administrador.getNome());
        administradorInDb.setCpf(administrador.getCpf());
        administradorInDb.setSenha(administrador.getSenha());

        this.entityManager.merge(administradorInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from Administrador s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
