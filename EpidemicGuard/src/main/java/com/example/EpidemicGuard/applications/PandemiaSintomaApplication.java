package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.PandemiaSintoma;
import com.example.EpidemicGuard.repositories.PandemiaSintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PandemiaSintomaApplication {

    private final PandemiaSintomaRepository pandemiaSintomaRepository;

    @Autowired
    public PandemiaSintomaApplication(PandemiaSintomaRepository administradorRepository){
        this.pandemiaSintomaRepository = administradorRepository;
    }

    public PandemiaSintoma buscarPorId(int id){
        return this.pandemiaSintomaRepository.buscarPorId(id);
    }

    public List<PandemiaSintoma> buscarTodos() {
        return this.pandemiaSintomaRepository.buscarTodos();
    }

    public void salvar(PandemiaSintoma pandemiaSintoma) {
        this.pandemiaSintomaRepository.salvar(pandemiaSintoma);
    }

    public void atualizar(int id, PandemiaSintoma pandemiaSintoma) {
        this.pandemiaSintomaRepository.atualizar(id, pandemiaSintoma);
    }

    public void remover(int id) {
        this.pandemiaSintomaRepository.remover(id);
    }
}