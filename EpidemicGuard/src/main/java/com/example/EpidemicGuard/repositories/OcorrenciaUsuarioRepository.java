package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.interfaces.IOcorrenciaUsuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OcorrenciaUsuarioRepository implements IOcorrenciaUsuario {
    private EntityManager entityManager;


    @Autowired
    public OcorrenciaUsuarioRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public OcorrenciaUsuario buscarPorId(int id) {
        return this.entityManager.find(OcorrenciaUsuario.class, id);
    }

    @Override
    public List<OcorrenciaUsuario> buscarTodos() {
        return entityManager
                .createQuery("select s from OcorrenciaUsuario s", OcorrenciaUsuario.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void salvar(OcorrenciaUsuario ocorrenciaUsuario) {
        this.entityManager.persist(ocorrenciaUsuario);
    }

    @Override
    @Transactional
    public void atualizar(int id, OcorrenciaUsuario ocorrenciaUsuario) {
        OcorrenciaUsuario ocorrenciaUsuarioInDb =  this.entityManager.find(OcorrenciaUsuario.class, id);

        ocorrenciaUsuarioInDb.setModerado(ocorrenciaUsuario.getModerado());
        ocorrenciaUsuarioInDb.setLogradouro(ocorrenciaUsuario.getLogradouro());
        ocorrenciaUsuarioInDb.setBairro(ocorrenciaUsuario.getBairro());
        ocorrenciaUsuarioInDb.setCidade(ocorrenciaUsuario.getCidade());
        ocorrenciaUsuarioInDb.setEstado(ocorrenciaUsuario.getEstado());
        ocorrenciaUsuarioInDb.setCep(ocorrenciaUsuario.getCep());
    }

    @Override
    @Transactional
    public void remover(int id) {
        Query query = entityManager
                .createQuery("delete from OcorrenciaUsuario s WHERE s.id = :id");

        query.setParameter("id", id);

        query.executeUpdate();
    }

    public List<Object[]> relatorio() {
        String sql = """
            SELECT 
                bairro, 
                pandemia_id, 
                COUNT(*) AS total,
                CASE 
                    WHEN COUNT(*) > 20 THEN 'Surto'
                    WHEN COUNT(*) > 5 THEN 'Epidemia'
                    WHEN COUNT(*) > 2 THEN 'Endemia'
                    ELSE 'Normal'
                END AS grau
            FROM
                ocorrencia_usuario
            WHERE
                moderado = TRUE
            GROUP BY 
                pandemia_id,
                bairro;
        """;

        Query query = entityManager.createNativeQuery(sql);

        return query.getResultList();
    }
}
