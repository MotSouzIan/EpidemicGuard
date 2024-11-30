package com.example.EpidemicGuard.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cidadao")

public class Cidadao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dataNascimento")
    private Date dataNascimento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "senha")
    private String senha;

    @OneToMany(mappedBy = "cidadao", cascade = CascadeType.ALL)
    private List<CidadaoTerceiro> cidadaoTerceiros = new ArrayList<>();

    @OneToMany(mappedBy = "cidadao", cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToMany(mappedBy = "cidadao", cascade = CascadeType.ALL)
    private List<OcorrenciaUsuario>ocorrenciaUsuarios = new ArrayList<>();

    public Cidadao(String nome, String cpf, Date dataNascimento, String genero, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.senha = senha;
    }


    public Cidadao(){

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
