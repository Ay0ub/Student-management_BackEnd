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
    private String etatService="refuser";
    private long idUser;

    public Servicee() {
    }

    public Servicee(String nameService, String etatService, long idUser) {
        this.nameService = nameService;
        this.etatService = etatService;
        this.idUser = idUser;
    }

    public Servicee(long idService, String nameService, String etatService, long idUser) {
        this.idService = idService;
        this.nameService = nameService;
        this.etatService = etatService;
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

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    @Override
    public String toString() {
        return "Service{" +
                "idService=" + idService +
                ", nameService='" + nameService + '\'' +
                ", etatService='" + etatService + '\'' +
                ", idUser=" + idUser +
                '}';
    }
}

