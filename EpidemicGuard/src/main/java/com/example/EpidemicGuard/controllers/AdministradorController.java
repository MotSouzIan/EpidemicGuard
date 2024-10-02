package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.Administrador;
import com.example.EpidemicGuard.facade.AdministradorFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AdministradorController {
    private AdministradorFacade administradorFacade;


    public void inicializarProdutos(){
        this.administradorFacade.adicionar(new Administrador(1, "David da Silva Oliveira", "123456", "092.998.785.36"));
    }


    @Autowired
    public AdministradorController(AdministradorFacade administradorFacade) {
        this.administradorFacade = administradorFacade;
        this.inicializarProdutos();
    }

    @GetMapping({"/buscarAdministradores"})
    public ResponseEntity<List<Administrador>> buscarTodos() {
        ArrayList<Administrador> administradors = this.administradorFacade.buscarTodos();
        return ResponseEntity.ok(administradors);
    }

    @GetMapping({"buscarAdministrador/{id}"})
    public ResponseEntity<Administrador> buscar(@PathVariable int id) {
        Administrador administrador = this.administradorFacade.buscarPorId(id);
        return ResponseEntity.ok(administrador);
    }
}
