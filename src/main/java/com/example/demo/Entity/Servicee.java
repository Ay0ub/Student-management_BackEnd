package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Servicee {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idService;
    private String nameService;
    private String etatService;
    LocalDate dateService;
    private long idUser;

    public Servicee() {
    }

    public Servicee(String nameService, String etatService, LocalDate dateService, long idUser) {
        this.nameService = nameService;
        this.etatService = etatService;
        this.dateService = dateService;
        this.idUser = idUser;
    }

    public Servicee(long idService, String nameService, String etatService, LocalDate dateService, long idUser) {
        this.idService = idService;
        this.nameService = nameService;
        this.etatService = etatService;
        this.dateService = dateService;
        this.idUser = idUser;
    }

    public long getIdService() {
        return idService;
    }

    public void setIdService(long idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getEtatService() {
        return etatService;
    }

    public void setEtatService(String etatService) {
        this.etatService = etatService;
    }

    public LocalDate getDateService() {
        return dateService;
    }

    public void setDateService(LocalDate dateService) {
        this.dateService = dateService;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Servicee{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", etatService='" + etatService + '\'' +
                ", dateService=" + dateService +
                ", idUser=" + idUser +
                '}';
    }
}

