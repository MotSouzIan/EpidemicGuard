package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.PandemiaSintoma;
import com.example.EpidemicGuard.repositories.PandemiaSintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PandemiaSintomaApplication {

    private final PandemiaSintomaRepository pandemia_sintomaRepository;

    @Autowired
    public PandemiaSintomaApplication(PandemiaSintomaRepository administradorRepository){
        this.pandemia_sintomaRepository = administradorRepository;
    }

    public PandemiaSintoma buscarPorId(int id){
        return this.pandemia_sintomaRepository.buscarPorId(id);
    }

    public List<PandemiaSintoma> buscarTodos() {
        return this.pandemia_sintomaRepository.buscarTodos();
    }

    public void salvar(PandemiaSintoma pandemia_sintoma) {
        this.pandemia_sintomaRepository.salvar(pandemia_sintoma);
    }

    public void atualizar(int id, PandemiaSintoma pandemia_sintoma) {
        this.pandemia_sintomaRepository.atualizar(id, pandemia_sintoma);
    }

    public void remover(int id) {
        this.pandemia_sintomaRepository.remover(id);
    }
}