package com.example.EpidemicGuard.entities;

public class Administrador {
    private int id;
    private String nome;
    private String senha;
    private String cpf;

    public Administrador(int id, String nome, String senha, String cpf) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
    }

    public Administrador(){

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
