package com.example.EpidemicGuard.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sintoma")

public class Sintoma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "sintoma", cascade = CascadeType.ALL)
    private List<PandemiaSintoma> pandemiaSintomas = new ArrayList<>();

    public Sintoma(String descricao) {
        this.descricao = descricao;
    }
    public Sintoma(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
