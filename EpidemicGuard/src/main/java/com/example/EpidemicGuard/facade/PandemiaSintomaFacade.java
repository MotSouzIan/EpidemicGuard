package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.PandemiaSintomaApplication;
import com.example.EpidemicGuard.entities.PandemiaSintoma;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PandemiaSintomaFacade {

    private final PandemiaSintomaApplication pandemiaSintomaApplication;

    public PandemiaSintomaFacade(PandemiaSintomaApplication pandemia_sintomaApplication) {
        this.pandemiaSintomaApplication = pandemia_sintomaApplication;
    }

    public PandemiaSintoma buscarPorId(int id) {
        return pandemiaSintomaApplication.buscarPorId(id);
    }

    public List<PandemiaSintoma> buscarTodos() {
        return pandemiaSintomaApplication.buscarTodos();
    }

    public void salvar(PandemiaSintoma pandemia_sintoma) {
        pandemiaSintomaApplication.salvar(pandemia_sintoma);
    }

    public void atualizar(int id, PandemiaSintoma pandemia_sintoma) {
        pandemiaSintomaApplication.atualizar(id, pandemia_sintoma);
    }

    public void remover(int id) {
        pandemiaSintomaApplication.remover(id);
    }

}
