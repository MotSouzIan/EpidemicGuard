package com.example.EpidemicGuard.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "sintoma")

public class Sintoma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "descricao")
    private String descricao;

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
