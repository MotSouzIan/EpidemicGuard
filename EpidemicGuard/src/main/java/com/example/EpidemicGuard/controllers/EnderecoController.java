package com.example.EpidemicGuard.controllers;

import com.example.EpidemicGuard.entities.Endereco;
import com.example.EpidemicGuard.facade.EnderecoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco/")
public class EnderecoController {
    private final EnderecoFacade enderecoFacade;

    @Autowired
    public EnderecoController(EnderecoFacade enderecoFacade) {
        this.enderecoFacade = enderecoFacade;
    }

    @GetMapping()
    public ResponseEntity<List<Endereco>> buscarTodos() {
        List<Endereco> enderecos = this.enderecoFacade.buscarTodos();

        return ResponseEntity.ok(enderecos);
    }

    @GetMapping({"buscarEndereco/{id}"})
    public ResponseEntity<Endereco> buscar(@PathVariable int id) {
        Endereco endereco = this.enderecoFacade.buscarPorId(id);

        return ResponseEntity.ok(endereco);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody Endereco endereco) {
        this.enderecoFacade.salvar(endereco);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<Endereco> atualizar(@PathVariable int id, @RequestBody Endereco endereco) {
        this.enderecoFacade.atualizar(id, endereco);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<Endereco>> remover(@PathVariable int id) {
        this.enderecoFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
