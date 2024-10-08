package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.interfaces.ICidadao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Date;

@Repository
public class CidadaoRepository implements ICidadao {
    private EntityManager entityManager;


    @Autowired
    public CidadaoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Cidadao buscarPorId(int id) {
        return this.entityManager.find(Cidadao.class, id);
    }

    @Override
    public List<Cidadao> buscarTodos() {
        return entityManager
                .createQuery("select s from Cidadao s ORDER BY s.nome", Cidadao.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(Cidadao cidadao) {
        this.entityManager.persist(cidadao);
    }

    @Override
    @Transactional
    public void atualizar(int id, Cidadao cidadao) {
        Cidadao cidadaoInDb =  this.entityManager.find(Cidadao.class, id);

        cidadaoInDb.setNome(cidadao.getNome());
        cidadaoInDb.setCpf(cidadao.getCpf());
        cidadaoInDb.setDataNascimento(cidadao.getDataNascimento());
        cidadaoInDb.setGenero(cidadao.getGenero());
        cidadaoInDb.setSenha(cidadao.getSenha());

        this.entityManager.merge(cidadaoInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from Cidadao s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
