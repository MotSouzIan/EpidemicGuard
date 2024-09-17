package com.example.EpidemicGuard.entites;

public class sintoma {
    private String descricao;

    public sintoma(String descricao) {
        this.descricao = descricao;
    }
    public sintoma(){

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
