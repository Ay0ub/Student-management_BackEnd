package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Absence {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idAbsence;
    LocalDate dateAbsence;
    private long idUser;
    private long idModule;

    public Absence() {
    }

    public Absence(LocalDate dateAbsence, long idUser, long idModule) {
        this.dateAbsence = dateAbsence;
        this.idUser = idUser;
        this.idModule = idModule;
    }

    public Absence(long idAbsence, LocalDate dateAbsence, long idUser, long idModule) {
        this.idAbsence = idAbsence;
        this.dateAbsence = dateAbsence;
        this.idUser = idUser;
        this.idModule = idModule;
    }

    public long getIdAbsence() {
        return idAbsence;
    }

    public void setIdAbsence(long idAbsence) {
        this.idAbsence = idAbsence;
    }

    public LocalDate getDateAbsence() {
        return dateAbsence;
    }

    public void setDateAbsence(LocalDate dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdModule() {
        return idModule;
    }

    public void setIdModule(long idModule) {
        this.idModule = idModule;
    }

    @Override
    public String toString() {
        return "Absence{" +
                "idAbsence=" + idAbsence +
                ", dateAbsence=" + dateAbsence +
                ", idUser=" + idUser +
                ", idModule=" + idModule +
                '}';
    }
}

