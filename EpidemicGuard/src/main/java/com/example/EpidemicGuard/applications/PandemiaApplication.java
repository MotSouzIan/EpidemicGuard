package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Pandemia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PandemiaApplication {

    private PandemiaApplication pandemiaApplication;

    public Pandemia buscarPorId(int id) {
        return this.pandemiaApplication.buscarPorId(id);
    }

    public ArrayList<Pandemia> buscarTodos() {

        return this.pandemiaApplication.buscarTodos();
    }

    public void salvar(int id, String nome, String guia) {

        this.pandemiaApplication.salvar(id, nome, guia);
    }

    public void atualizar(int id, Pandemia pandemia) {

        this.pandemiaApplication.atualizar(id, pandemia);
    }

    public void remover(int id) {

       this.pandemiaApplication.remover(id);
    }

    public void adicionar(Pandemia pandemia) {
        this.pandemiaApplication.adicionar(pandemia);
    }
}
