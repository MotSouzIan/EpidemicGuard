package com.example.EpidemicGuard.controllers;

import com.example.EpidemicGuard.entities.OcorrenciaUsuario;
import com.example.EpidemicGuard.facade.OcorrenciaUsuarioFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/ocorrenciaUsuario")
public class OcorrenciaUsuarioController {
    private final OcorrenciaUsuarioFacade ocorrenciaUsuarioFacade;

    @Autowired
    public OcorrenciaUsuarioController(OcorrenciaUsuarioFacade ocorrenciaUsuarioFacade) {
        this.ocorrenciaUsuarioFacade = ocorrenciaUsuarioFacade;
    }

    @GetMapping()
    public ResponseEntity<List<OcorrenciaUsuario>> buscarTodos() {
        List<OcorrenciaUsuario> ocorrenciaUsuarios = this.ocorrenciaUsuarioFacade.buscarTodos();

        return ResponseEntity.ok(ocorrenciaUsuarios);
    }

    @GetMapping({"/buscarOcorrenciaUsuario/{id}"})
    public ResponseEntity<OcorrenciaUsuario> buscar(@PathVariable int id) {
        OcorrenciaUsuario ocorrenciaUsuario = this.ocorrenciaUsuarioFacade.buscarPorId(id);

        return ResponseEntity.ok(ocorrenciaUsuario);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioFacade.salvar(ocorrenciaUsuario);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<OcorrenciaUsuario> atualizar(@PathVariable int id, @RequestBody OcorrenciaUsuario ocorrenciaUsuario) {
        this.ocorrenciaUsuarioFacade.atualizar(id, ocorrenciaUsuario);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<OcorrenciaUsuario>> remover(@PathVariable int id) {
        this.ocorrenciaUsuarioFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}