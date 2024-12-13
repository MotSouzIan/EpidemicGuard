package com.example.EpidemicGuard.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pandemiaSintoma")
public class PandemiaSintoma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pandemia_id", referencedColumnName = "id")
    private Pandemia pandemia;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sintoma_id", referencedColumnName = "id")
    private Sintoma sintoma;

    public PandemiaSintoma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pandemia getPandemia() {
        return pandemia;
    }

    public void setPandemia(Pandemia pandemia) {
        this.pandemia = pandemia;
    }

    public Sintoma getSintoma() {
        return sintoma;
    }

    public void setSintoma(Sintoma sintoma) {
        this.sintoma = sintoma;
    }
}
