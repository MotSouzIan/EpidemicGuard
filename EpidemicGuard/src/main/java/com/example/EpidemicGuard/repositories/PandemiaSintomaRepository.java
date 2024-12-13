package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.PandemiaSintoma;
import com.example.EpidemicGuard.interfaces.IPandemiaSintoma;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PandemiaSintomaRepository implements IPandemiaSintoma {
    private EntityManager entityManager;


    @Autowired
    public PandemiaSintomaRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public PandemiaSintoma buscarPorId(int id) {
        return this.entityManager.find(PandemiaSintoma.class, id);
    }

    @Override
    public List<PandemiaSintoma> buscarTodos() {
        return entityManager
                .createQuery("select s from PandemiaSintoma s ORDER BY s.nome", PandemiaSintoma.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(PandemiaSintoma pandemia_pandemia) {
        this.entityManager.persist(pandemia_pandemia);
    }

    @Override
    @Transactional
    public void atualizar(int id, PandemiaSintoma pandemiaSintoma) {
        PandemiaSintoma pandemiaSintomaInDb =  this.entityManager.find(PandemiaSintoma.class, id);

        pandemiaSintomaInDb.setPandemia(pandemiaSintoma.getPandemia());
        pandemiaSintomaInDb.setSintoma(pandemiaSintoma.getSintoma());

        this.entityManager.merge(pandemiaSintomaInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from PandemiaSintoma s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
