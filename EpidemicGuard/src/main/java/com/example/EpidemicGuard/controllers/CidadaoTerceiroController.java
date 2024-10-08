package com.example.EpidemicGuard.controllers;

import com.example.EpidemicGuard.entities.CidadaoTerceiro;
import com.example.EpidemicGuard.facade.CidadaoTerceiroFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidadaoTerceiro")

public class CidadaoTerceiroController {
    private final CidadaoTerceiroFacade cidadaoTerceiroFacade;

    @Autowired
    public CidadaoTerceiroController(CidadaoTerceiroFacade cidadaoTerceiroFacade) {
        this.cidadaoTerceiroFacade = cidadaoTerceiroFacade;
    }

    @GetMapping({"/buscarCidadaosTerceiros"})
    public ResponseEntity<List<CidadaoTerceiro>> buscarTodos() {
        List<CidadaoTerceiro> cidadaoTerceiros = this.cidadaoTerceiroFacade.buscarTodos();

        return ResponseEntity.ok(cidadaoTerceiros);
    }

    @GetMapping({"/buscarCidadaoTerceiro/{id}"})
    public ResponseEntity<CidadaoTerceiro> buscar(@PathVariable int id) {
        CidadaoTerceiro cidadaoTerceiro = this.cidadaoTerceiroFacade.buscarPorId(id);

        return ResponseEntity.ok(cidadaoTerceiro);
    }

    @PostMapping({"/"})
    public ResponseEntity<Void> salvar(@RequestBody CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroFacade.salvar(cidadaoTerceiro);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<CidadaoTerceiro> atualizar(@PathVariable int id, @RequestBody CidadaoTerceiro cidadaoTerceiro) {
        this.cidadaoTerceiroFacade.atualizar(id, cidadaoTerceiro);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<List<CidadaoTerceiro>> remover(@PathVariable int id) {
        this.cidadaoTerceiroFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}