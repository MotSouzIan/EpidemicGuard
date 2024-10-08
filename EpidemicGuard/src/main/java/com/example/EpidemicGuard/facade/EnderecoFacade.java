package com.example.EpidemicGuard.facade;

import com.example.EpidemicGuard.applications.CidadaoTerceiroApplication;
import com.example.EpidemicGuard.applications.EnderecoApplication;
import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.repositories.EnderecoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoFacade {

    private final EnderecoApplication enderecoApplication;

    public EnderecoFacade(EnderecoApplication enderecoApplication) {
        this.enderecoApplication = enderecoApplication;
    }

    public Endereco buscarPorId(int id) {
        return enderecoApplication.buscarPorId(id);
    }

    public List<Endereco> buscarTodos() {
        return enderecoApplication.buscarTodos();
    }

    public void salvar(Endereco endereco) {
        enderecoApplication.salvar(endereco);
    }

    public void atualizar(int id, Endereco endereco) {
        enderecoApplication.atualizar(id, endereco);
    }

    public void remover(int id) {
        enderecoApplication.remover(id);
    }
}
