package com.example.EpidemicGuard.entites;

public class pandemia {
    private String nome;
    private String guia;

    public pandemia(String nome, String guia) {
        this.nome = nome;
        this.guia = guia;
    }
    public pandemia(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }
}
