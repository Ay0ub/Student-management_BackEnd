package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Cours {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idCours;
    private String nameCours;
    private String docCours;
    private String motcleCours;
    private long idModule;

    public Cours() {
    }

    public Cours(String nameCours, String docCours, String motcleCours, long idModule) {
        this.nameCours = nameCours;
        this.docCours = docCours;
        this.motcleCours = motcleCours;
        this.idModule = idModule;
    }

    public Cours(long idCours, String nameCours, String docCours, String motcleCours, long idModule) {
        this.idCours = idCours;
        this.nameCours = nameCours;
        this.docCours = docCours;
        this.motcleCours = motcleCours;
        this.idModule = idModule;
    }

    public long getIdCours() {
        return idCours;
    }

    public void setIdCours(long idCours) {
        this.idCours = idCours;
    }

    public String getNameCours() {
        return nameCours;
    }

    public void setNameCours(String nameCours) {
        this.nameCours = nameCours;
    }

    public String getDocCours() {
        return docCours;
    }

    public void setDocCours(String docCours) {
        this.docCours = docCours;
    }

    public String getMotcleCours() {
        return motcleCours;
    }

    public void setMotcleCours(String motcleCours) {
        this.motcleCours = motcleCours;
    }

    public long getIdModule() {
        return idModule;
    }

    public void setIdModule(long idModule) {
        this.idModule = idModule;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "idCours=" + idCours +
                ", nameCours='" + nameCours + '\'' +
                ", docCours='" + docCours + '\'' +
                ", motcleCours='" + motcleCours + '\'' +
                ", idModule=" + idModule +
                '}';
    }
}

