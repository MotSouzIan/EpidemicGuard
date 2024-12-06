package com.example.EpidemicGuard.entities;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ocorrenciaUsuario")

public class OcorrenciaUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "enderecoOcorrencia")
    private String enderecoOcorrencia;
    @Column(name = "moderado")
    private boolean moderado;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "estado")
    private String estado;
    @Column(name = "cep")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cidadao_id", referencedColumnName = "id")
    private Cidadao cidadao;

    @ManyToOne
    @JoinColumn(name = "pandemia_id", referencedColumnName = "id")
    private Pandemia pandemia;

    @ManyToOne
    @JoinColumn(name = "administrador_id", referencedColumnName = "id")
    private Administrador administrador;


    public OcorrenciaUsuario(String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {
        this.enderecoOcorrencia = enderecoOcorrencia;
        this.moderado = moderado;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    public OcorrenciaUsuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnderecoOcorrencia() {
        return enderecoOcorrencia;
    }

    public void setEnderecoOcorrencia(String enderecoOcorrencia) {
        this.enderecoOcorrencia = enderecoOcorrencia;
    }

    public boolean getModerado() {
        return moderado;
    }

    public void setModerado(boolean moderado) {
        this.moderado = moderado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isModerado() {
        return moderado;
    }

    public Cidadao getCidadao() {
        return cidadao;
    }

    public void setCidadao(Cidadao cidadao) {
        this.cidadao = cidadao;
    }

    public Pandemia getPandemia() {
        return pandemia;
    }

    public void setPandemia(Pandemia pandemia) {
        this.pandemia = pandemia;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
