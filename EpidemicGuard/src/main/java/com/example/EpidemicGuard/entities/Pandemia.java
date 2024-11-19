package com.example.EpidemicGuard.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pandemia")

public class Pandemia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "guia")
    private String guia;

    @OneToMany(mappedBy = "pandemia", cascade = CascadeType.ALL)
    private List<OcorrenciaUsuario> ocorrenciaUsuarios = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "sintoma_id", referencedColumnName = "id")
    private Sintoma sintoma;

    public Pandemia(String nome, String guia) {
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
