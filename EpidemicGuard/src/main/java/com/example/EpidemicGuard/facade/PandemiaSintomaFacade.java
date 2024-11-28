package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.PandemiaSintomaApplication;
import com.example.EpidemicGuard.entities.PandemiaSintoma;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PandemiaSintomaFacade {

    private final PandemiaSintomaApplication pandemia_sintomaApplication;

    public PandemiaSintomaFacade(PandemiaSintomaApplication pandemia_sintomaApplication) {
        this.pandemia_sintomaApplication = pandemia_sintomaApplication;
    }

    public PandemiaSintoma buscarPorId(int id) {
        return pandemia_sintomaApplication.buscarPorId(id);
    }

    public List<PandemiaSintoma> buscarTodos() {
        return pandemia_sintomaApplication.buscarTodos();
    }

    public void salvar(PandemiaSintoma pandemia_sintoma) {
        pandemia_sintomaApplication.salvar(pandemia_sintoma);
    }

    public void atualizar(int id, PandemiaSintoma pandemia_sintoma) {
        pandemia_sintomaApplication.atualizar(id, pandemia_sintoma);
    }

    public void remover(int id) {
        pandemia_sintomaApplication.remover(id);
    }

}
