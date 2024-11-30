package com.example.EpidemicGuard.controllers;


import com.example.EpidemicGuard.entities.PandemiaSintoma;
import com.example.EpidemicGuard.facade.PandemiaSintomaFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Pandemia_sintoma")
public class PandemiaSintomaController {
    private final PandemiaSintomaFacade pandemia_sintomaFacade;

    @Autowired
    public PandemiaSintomaController(PandemiaSintomaFacade pandemia_sintomaFacade) {
        this.pandemia_sintomaFacade = pandemia_sintomaFacade;
    }

    @GetMapping()
    public ResponseEntity<List<PandemiaSintoma>> buscarTodos() {
        List<PandemiaSintoma> pandemias_sintomas = this.pandemia_sintomaFacade.buscarTodos();

        return ResponseEntity.ok(pandemias_sintomas);
    }

    @GetMapping({"/buscarPandemiaSintoma/{id}"})
    public ResponseEntity<PandemiaSintoma> buscar(@PathVariable int id) {
        PandemiaSintoma pandemia_sintoma = this.pandemia_sintomaFacade.buscarPorId(id);

        return ResponseEntity.ok(pandemia_sintoma);
    }

    @PostMapping()
    public ResponseEntity<Void> salvar(@RequestBody PandemiaSintoma pandemia_sintoma) {
        this.pandemia_sintomaFacade.salvar(pandemia_sintoma);

        return ResponseEntity.ok(null);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<PandemiaSintoma> atualizar(@PathVariable int id, @RequestBody PandemiaSintoma pandemia_sintoma) {
        this.pandemia_sintomaFacade.atualizar(id, pandemia_sintoma);

        return ResponseEntity.ok(null);
    }

    @DeleteMapping({"{id}"})
    public ResponseEntity<List<PandemiaSintoma>> remover(@PathVariable int id) {
        this.pandemia_sintomaFacade.remover(id);

        return ResponseEntity.ok(null);
    }
}
