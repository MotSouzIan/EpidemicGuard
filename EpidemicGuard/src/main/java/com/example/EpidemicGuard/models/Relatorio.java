package com.example.EpidemicGuard.models;

public class Relatorio {
    private String bairro;
    private int pandemiaId;
    private int total;
    private String grau;

    public Relatorio(String bairro, int pandemiaId, int total, String grau) {
        this.bairro = bairro;
        this.pandemiaId = pandemiaId;
        this.total = total;
        this.grau = grau;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getPandemiaId() {
        return pandemiaId;
    }

    public void setPandemiaId(int pandemiaId) {
        this.pandemiaId = pandemiaId;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }
}
