package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.entities.Cidadao;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;


public interface ICidadao {

        public Cidadao buscarPorId(int id);

        public List<Cidadao> buscarTodos();

        public void salvar(Cidadao cidadao);

        public void atualizar(int id, Cidadao cidadao);

        public void remover(int id);
    }

