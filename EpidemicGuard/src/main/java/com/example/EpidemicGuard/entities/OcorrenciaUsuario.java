package com.example.EpidemicGuard.entities;

public class OcorrenciaUsuario {
    private int id;
    private String enderecoOcorrencia;
    private boolean moderado;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public OcorrenciaUsuario(int id, String enderecoOcorrencia, boolean moderado, String logradouro, String bairro, String cidade, String estado, String cep) {
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

    public boolean isModerado() {
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
}
