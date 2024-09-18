package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.interfaces.Ipandemia;

import java.util.ArrayList;

public class PandemiaRepository implements Ipandemia {

    ArrayList<Pandemia> pandemia = new ArrayList<>();

    @Override
    public Pandemia buscarPorId(int id) {
        Pandemia pandemiaInDb = pandemia.stream().filter(p -> p.getId() == id).findFirst().get();

        return pandemiaInDb;
    }

    @Override
    public ArrayList<Pandemia> buscarTodos() {
        return pandemia;
    }

    @Override
    public void salvar(int id, String nome, String guia) {
        Pandemia pandemiaInDb = new Pandemia(id, nome, guia);
        pandemia.add(pandemiaInDb);
    }

    @Override
    public void atualizar(int id, Pandemia pandemia) {
        Pandemia pandemiaInDb = buscarPorId(id);

        pandemiaInDb.setNome(pandemia.getNome());
        pandemiaInDb.setGuia(pandemia.getGuia());

    }

    @Override
    public void remover(int id) {

        pandemia.removeIf(p -> p.getId() == id);

    }
}
