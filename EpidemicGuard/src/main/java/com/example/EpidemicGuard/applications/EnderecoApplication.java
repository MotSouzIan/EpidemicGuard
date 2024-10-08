package com.example.EpidemicGuard.applications;

import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoApplication {

    private final EnderecoRepository enderecoRepository;

    @Autowired
    public EnderecoApplication(EnderecoRepository enderecoRepository){
        this.enderecoRepository = enderecoRepository;
    }

    public Endereco buscarPorId(int id){
        return this.enderecoRepository.buscarPorId(id);
    }

    public List<Endereco> buscarTodos() {
        return this.enderecoRepository.buscarTodos();
    }

    public void salvar(Endereco endereco) {
        this.enderecoRepository.salvar(endereco);
    }

    public void atualizar(int id, Endereco endereco) {
        this.enderecoRepository.atualizar(id, endereco);
    }

    public void remover(int id) {
        this.enderecoRepository.remover(id);
    }
}
