package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.interfaces.ICidadaoTerceiro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CidadaoTerceiroRepository implements ICidadaoTerceiro {
    private EntityManager entityManager;


    @Autowired
    public CidadaoTerceiroRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public CidadaoTerceiro buscarPorId(int id) {
        return this.entityManager.find(CidadaoTerceiro.class, id);
    }

    @Override
    public List<CidadaoTerceiro> buscarTodos() {
        return entityManager
                .createQuery("select s from CidadaoTerceiro s ORDER BY s.nome", CidadaoTerceiro.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(CidadaoTerceiro cidadaoTerceiro) {
        this.entityManager.persist(cidadaoTerceiro);
    }

    @Override
    @Transactional
    public void atualizar(int id, CidadaoTerceiro cidadaoTerceiro) {
        CidadaoTerceiro cidadaoTerceiroInDb =  this.entityManager.find(CidadaoTerceiro.class, id);

        cidadaoTerceiroInDb.setNome(cidadaoTerceiro.getNome());
        cidadaoTerceiroInDb.setCpf(cidadaoTerceiro.getCpf());
        cidadaoTerceiroInDb.setDataNascimento(cidadaoTerceiro.getDataNascimento());
        cidadaoTerceiroInDb.setGenero(cidadaoTerceiro.getGenero());

        this.entityManager.merge(cidadaoTerceiroInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from CidadaoTerceiro s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
