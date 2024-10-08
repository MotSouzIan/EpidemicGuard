package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Cidadao;

import java.util.List;



public interface ICidadao {

        public Cidadao buscarPorId(int id);

        public List<Cidadao> buscarTodos();

        public void salvar(Cidadao cidadao);

        public void atualizar(int id, Cidadao cidadao);

        public void remover(int id);
    }

