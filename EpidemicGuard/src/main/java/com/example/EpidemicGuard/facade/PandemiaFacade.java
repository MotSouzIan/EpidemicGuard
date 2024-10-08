package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.PandemiaApplication;
import com.example.EpidemicGuard.entities.Pandemia;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PandemiaFacade {

    private final PandemiaApplication pandemiaApplication;

    public PandemiaFacade(PandemiaApplication pandemiaApplication) {
        this.pandemiaApplication = pandemiaApplication;
    }

    public Pandemia buscarPorId(int id) {
        return pandemiaApplication.buscarPorId(id);
    }

    public List<Pandemia> buscarTodos() {
        return pandemiaApplication.buscarTodos();
    }

    public void salvar(Pandemia pandemia) {
        pandemiaApplication.salvar(pandemia);
    }

    public void atualizar(int id, Pandemia pandemia) {
        pandemiaApplication.atualizar(id, pandemia);
    }

    public void remover(int id) {
        pandemiaApplication.remover(id);
    }

}
