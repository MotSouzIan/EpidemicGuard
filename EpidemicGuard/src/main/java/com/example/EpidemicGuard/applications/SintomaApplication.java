package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.repositories.SintomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SintomaApplication {

    private final SintomaRepository sintomaRepository;

    @Autowired
    public SintomaApplication(SintomaRepository sintomaRepository){
        this.sintomaRepository = sintomaRepository;
    }

    public Sintoma buscarPorId(int id){
        return this.sintomaRepository.buscarPorId(id);
    }

    public List<Sintoma> buscarTodos() {
        return this.sintomaRepository.buscarTodos();
    }

    public void salvar(Sintoma sintoma) {
        this.sintomaRepository.salvar(sintoma);
    }

    public void atualizar(int id, Sintoma sintoma) {
        this.sintomaRepository.atualizar(id, sintoma);
    }

    public void remover(int id) {
        this.sintomaRepository.remover(id);
    }
}
