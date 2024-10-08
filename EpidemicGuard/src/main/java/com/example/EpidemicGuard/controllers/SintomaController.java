package com.example.EpidemicGuard.controllers;

import com.example.EpidemicGuard.entities.Sintoma;
import com.example.EpidemicGuard.facade.SintomaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sintoma")
public class SintomaController {
    private final SintomaFacade sintomaFacade;

    @Autowired
    public SintomaController(SintomaFacade sintomaFacade) {
        this.sintomaFacade = sintomaFacade;
    }

    @GetMapping({"/buscarSintomas"})
    public ResponseEntity<List<Sintoma>> buscarTodos() {
        List<Sintoma> sintomas = this.sintomaFacade.buscarTodos();

        return ResponseEntity.ok(sintomas);
    }

    @GetMapping({"/buscarSintoma/{id}"})
    public ResponseEntity<Sintoma> buscar(@PathVariable int id) {
        Sintoma sintoma = this.sintomaFacade.buscarPorId(id);

        return ResponseEntity.ok(sintoma);
    }

    @PostMapping({"/"})
    public ResponseEntity<Void> salvar(@RequestBody Sintoma sintoma) {
        this.sintomaFacade.salvar(sintoma);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<Sintoma> atualizar(@PathVariable int id, @RequestBody Sintoma sintoma) {
        this.sintomaFacade.atualizar(id, sintoma);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"/{id}"})
    public ResponseEntity<List<Sintoma>> remover(@PathVariable int id) {
        this.sintomaFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
