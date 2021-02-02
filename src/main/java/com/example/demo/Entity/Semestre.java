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

    public Semestre() {
    }

    public Semestre(String nameSemestre) {
        this.nameSemestre = nameSemestre;
    }

    public Semestre(long idSemestre, String nameSemestre) {
        this.idSemestre = idSemestre;
        this.nameSemestre = nameSemestre;
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

    @Override
    public String toString() {
        return "Semestre{" +
                "idSemestre=" + idSemestre +
                ", nameSemestre='" + nameSemestre + '\'' +
                '}';
    }
}

