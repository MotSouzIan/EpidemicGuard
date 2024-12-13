package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.PandemiaSintoma;
import com.example.EpidemicGuard.facade.PandemiaSintomaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PandemiaSintoma")
public class PandemiaSintomaController {
    private final PandemiaSintomaFacade pandemia_sintomaFacade;

    @Autowired
    public PandemiaSintomaController(PandemiaSintomaFacade pandemia_sintomaFacade) {
        this.pandemia_sintomaFacade = pandemia_sintomaFacade;
    }

    @GetMapping()
    public ResponseEntity<List<PandemiaSintoma>> buscarTodos() {
        List<PandemiaSintoma> pandemiaSintomas = this.pandemia_sintomaFacade.buscarTodos();

        return ResponseEntity.ok(pandemiaSintomas);
    }

    @GetMapping({"/buscarPandemiaSintoma/{id}"})
    public ResponseEntity<PandemiaSintoma> buscar(@PathVariable int id) {
        PandemiaSintoma pandemiaSintoma = this.pandemia_sintomaFacade.buscarPorId(id);

        return ResponseEntity.ok(pandemiaSintoma);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody PandemiaSintoma pandemiaSintoma) {
        this.pandemia_sintomaFacade.salvar(pandemiaSintoma);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<PandemiaSintoma> atualizar(@PathVariable int id, @RequestBody PandemiaSintoma pandemiaSintoma) {
        this.pandemia_sintomaFacade.atualizar(id, pandemiaSintoma);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<PandemiaSintoma>> remover(@PathVariable int id) {
        this.pandemia_sintomaFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
