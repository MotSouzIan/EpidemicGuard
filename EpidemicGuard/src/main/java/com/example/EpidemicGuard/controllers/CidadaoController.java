package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.Cidadao;
import com.example.EpidemicGuard.facade.CidadaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cidadao")

public class CidadaoController {
    private final CidadaoFacade cidadaoFacade;

    @Autowired
    public CidadaoController(CidadaoFacade cidadaoFacade) {
        this.cidadaoFacade = cidadaoFacade;
    }

    @GetMapping({"/buscarCidadaos"})
    public ResponseEntity<List<Cidadao>> buscarTodos() {
        List<Cidadao> administradores = this.cidadaoFacade.buscarTodos();

        return ResponseEntity.ok(administradores);
    }

    @GetMapping({"/buscarCidadao/{id}"})
    public ResponseEntity<Cidadao> buscar(@PathVariable int id) {
        Cidadao cidadao = this.cidadaoFacade.buscarPorId(id);

        return ResponseEntity.ok(cidadao);
    }

    @PostMapping({"/"})
    public ResponseEntity<Void> salvar(@RequestBody Cidadao cidadao) {
        this.cidadaoFacade.salvar(cidadao);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Cidadao> atualizar(@PathVariable int id, @RequestBody Cidadao cidadao) {
        this.cidadaoFacade.atualizar(id, cidadao);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<List<Cidadao>> remover(@PathVariable int id) {
        this.cidadaoFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}