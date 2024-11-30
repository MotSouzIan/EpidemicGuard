package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.Pandemia;
import com.example.EpidemicGuard.facade.PandemiaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pandemia")
public class PandemiaController {
    private final PandemiaFacade pandemiaFacade;

    @Autowired
    public PandemiaController(PandemiaFacade pandemiaFacade) {
        this.pandemiaFacade = pandemiaFacade;
    }

    @GetMapping()
    public ResponseEntity<List<Pandemia>> buscarTodos() {
        List<Pandemia> pandemias = this.pandemiaFacade.buscarTodos();

        return ResponseEntity.ok(pandemias);
    }

    @GetMapping({"/buscarPandemia/{id}"})
    public ResponseEntity<Pandemia> buscar(@PathVariable int id) {
        Pandemia pandemia = this.pandemiaFacade.buscarPorId(id);

        return ResponseEntity.ok(pandemia);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody Pandemia pandemia) {
        this.pandemiaFacade.salvar(pandemia);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<Pandemia> atualizar(@PathVariable int id, @RequestBody Pandemia pandemia) {
        this.pandemiaFacade.atualizar(id, pandemia);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<Pandemia>> remover(@PathVariable int id) {
        this.pandemiaFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
