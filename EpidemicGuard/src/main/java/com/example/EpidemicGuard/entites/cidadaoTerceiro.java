package com.example.EpidemicGuard.entites;

import java.util.Date;

public class cidadaoTerceiro {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String genero;

    public cidadaoTerceiro(String nome, String cpf, Date dataNascimento, String genero) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    public cidadaoTerceiro(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
