package com.example.EpidemicGuard.entities;

public class Pandemia {
    private int id;
    private String nome;
    private String guia;

    public Pandemia(int id, String nome, String guia) {
        this.id = id;
        this.nome = nome;
        this.guia = guia;
    }
    public Pandemia(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
