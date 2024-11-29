package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.interfaces.ISintoma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class SintomaRepository implements ISintoma {
    private EntityManager entityManager;


    @Autowired
    public SintomaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Sintoma buscarPorId(int id) {
        return this.entityManager.find(Sintoma.class, id);
    }

    @Override
    public List<Sintoma> buscarTodos() {
        return entityManager
                .createQuery("select s from Sintoma s ORDER BY s.descricao", Sintoma.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(Sintoma sintoma) {
        this.entityManager.persist(sintoma);
    }

    @Override
    @Transactional
    public void atualizar(int id, Sintoma sintoma) {
        Sintoma sintomaInDb =  this.entityManager.find(Sintoma.class, id);

        sintomaInDb.setDescricao(sintoma.getDescricao());

        this.entityManager.merge(sintomaInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from sintoma s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
