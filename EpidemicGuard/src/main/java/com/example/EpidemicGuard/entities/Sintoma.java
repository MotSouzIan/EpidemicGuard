package com.example.EpidemicGuard.entities;

public class Sintoma {
    private int id;
    private String descricao;

    public Sintoma(int id, String descricao) {
        this.id = id;
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
