package com.example.EpidemicGuard.interfaces;

import com.example.EpidemicGuard.entities.Cidadao;

import java.util.ArrayList;
import java.util.Date;

public interface Icidadao {

    public Cidadao buscarPorId(int id);

    public ArrayList<Cidadao> buscarTodas();

    public void salvar(int id, String nome, String cpf, Date dataNascimento, String genero, String senha);

    public void atualizar(int id, Cidadao cidadao);

    public void remover(int id);

    public void adicionar(Cidadao cidadao);
}
