package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.facade.AdministradorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    private final AdministradorFacade administradorFacade;

    @Autowired
    public AdministradorController(AdministradorFacade administradorFacade) {
        this.administradorFacade = administradorFacade;
    }

    @GetMapping({"/buscarAdministradores"})
    public ResponseEntity<List<Administrador>> buscarTodos() {
        List<Administrador> administradores = this.administradorFacade.buscarTodos();

        return ResponseEntity.ok(administradores);
    }

    @GetMapping({"/buscarAdministrador/{id}"})
    public ResponseEntity<Administrador> buscar(@PathVariable int id) {
        Administrador administrador = this.administradorFacade.buscarPorId(id);

        return ResponseEntity.ok(administrador);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody Administrador administrador) {
        this.administradorFacade.salvar(administrador);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<Administrador> atualizar(@PathVariable int id, @RequestBody Administrador administrador) {
        this.administradorFacade.atualizar(id, administrador);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<Administrador>> remover(@PathVariable int id) {
        this.administradorFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
