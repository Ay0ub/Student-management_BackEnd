package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Semestre {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idSemestre;
    private String nameSemestre;
    private long idModule;

    public Semestre() {
    }

    public Semestre(String nameSemestre, long idModule) {
        this.nameSemestre = nameSemestre;
        this.idModule = idModule;
    }

    public Semestre(long idSemestre, String nameSemestre, long idModule) {
        this.idSemestre = idSemestre;
        this.nameSemestre = nameSemestre;
        this.idModule = idModule;
    }

    public long getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(long idSemestre) {
        this.idSemestre = idSemestre;
    }

    public String getNameSemestre() {
        return nameSemestre;
    }

    public void setNameSemestre(String nameSemestre) {
        this.nameSemestre = nameSemestre;
    }

    public long getIdModule() {
        return idModule;
    }

    public void setIdModule(long idModule) {
        this.idModule = idModule;
    }

    @Override
    public String toString() {
        return "Semestre{" +
                "idSemestre=" + idSemestre +
                ", nameSemestre='" + nameSemestre + '\'' +
                ", idModule=" + idModule +
                '}';
    }
}

