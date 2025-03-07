package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Module {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idModule;
    private String nameModule;
    private long idSemestre;
    private int nbrSeance;
    private long idUser;

    public Module() {
    }

    public Module(String nameModule, long idSemestre, int nbrSeance, long idUser) {
        this.nameModule = nameModule;
        this.idSemestre = idSemestre;
        this.nbrSeance = nbrSeance;
        this.idUser = idUser;
    }

    public Module(long idModule, String nameModule, long idSemestre, int nbrSeance, long idUser) {
        this.idModule = idModule;
        this.nameModule = nameModule;
        this.idSemestre = idSemestre;
        this.nbrSeance = nbrSeance;
        this.idUser = idUser;
    }

    public long getIdModule() {
        return idModule;
    }

    public void setIdModule(long idModule) {
        this.idModule = idModule;
    }

    public String getNameModule() {
        return nameModule;
    }

    public void setNameModule(String nameModule) {
        this.nameModule = nameModule;
    }

    public long getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(long idSemestre) {
        this.idSemestre = idSemestre;
    }

    public int getNbrSeance() {
        return nbrSeance;
    }

    public void setNbrSeance(int nbrSeance) {
        this.nbrSeance = nbrSeance;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Module{" +
                "idModule=" + idModule +
                ", nameModule='" + nameModule + '\'' +
                ", idSemestre=" + idSemestre +
                ", nbrSeance=" + nbrSeance +
                ", idUser=" + idUser +
                '}';
    }
}

