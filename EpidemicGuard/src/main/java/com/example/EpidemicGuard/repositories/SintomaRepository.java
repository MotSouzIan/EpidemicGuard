package com.example.EpidemicGuard.repositories;

import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.interfaces.Isintoma;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class SintomaRepository implements Isintoma {

    ArrayList<Sintoma> sintoma = new ArrayList<>();

    @Override
    public Sintoma buscarPorId(int id) {
        Sintoma sintomaInDb = sintoma.stream().filter(s -> s.getId() == 1).findFirst().get();

        return sintomaInDb;
    }

    @Override
    public ArrayList<Sintoma> buscarTodos() {
        return sintoma;
    }

    @Override
    public void salvar(int id, String descricao) {
        Sintoma sintomaInDb = new Sintoma(id, descricao);
        sintoma.add(sintomaInDb);
    }

    @Override
    public void atualizar(int id, Sintoma sintoma) {
        Sintoma sintomaInDb = buscarPorId(id);

        sintomaInDb.setDescricao(sintoma.getDescricao());
    }

    @Override
    public void remover(int id) {
        sintoma.removeIf(sintomaInDb -> sintomaInDb.getId() == id);
    }

    @Override
    public void adicionar(Sintoma sintoma) {
        this.sintoma.add(sintoma);
    }
}
