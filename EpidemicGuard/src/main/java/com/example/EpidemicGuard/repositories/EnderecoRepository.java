package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.interfaces.IEndereco;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class EnderecoRepository implements IEndereco {
    private EntityManager entityManager;


    @Autowired
    public EnderecoRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Endereco buscarPorId(int id) {
        return this.entityManager.find(Endereco.class, id);
    }

    @Override
    public List<Endereco> buscarTodos() {
        return entityManager
                .createQuery("select s from Endereco s ORDER BY s.rua", Endereco.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(Endereco endereco) {
        this.entityManager.persist(endereco);
    }

    @Override
    @Transactional
    public void atualizar(int id, Endereco endereco) {
        Endereco enderecoInDb =  this.entityManager.find(Endereco.class, id);

        enderecoInDb.setRua(endereco.getRua());
        enderecoInDb.setBairro(endereco.getBairro());
        enderecoInDb.setCidade(endereco.getCidade());
        enderecoInDb.setEstado(endereco.getEstado());
        enderecoInDb.setCep(endereco.getCep());

        this.entityManager.merge(enderecoInDb);
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from Endereco s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }
}
