package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.interfaces.IPandemia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PandemiaRepository implements IPandemia {
    private EntityManager entityManager;


    @Autowired
    public PandemiaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Pandemia buscarPorId(int id) {
        return this.entityManager.find(Pandemia.class, id);
    }

    @Override
    public List<Pandemia> buscarTodos() {
        return entityManager
                .createQuery("select s from Pandemia s ORDER BY s.nome", Pandemia.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(Pandemia pandemia) {
        this.entityManager.persist(pandemia);
    }

    @Override
    @Transactional
    public void atualizar(int id, Pandemia pandemia) {
        Pandemia pandemiaInDb =  this.entityManager.find(Pandemia.class, id);

        pandemiaInDb.setNome(pandemia.getNome());
        pandemiaInDb.setGuia(pandemia.getGuia());

        this.entityManager.merge(pandemiaInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from Pandemia s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
