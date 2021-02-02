package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class EmpTemp {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idEmptemp;
    private String docEmptemp;
    private long idSemestre;

    public EmpTemp() {
    }

    public EmpTemp(String docEmptemp, long idSemestre) {
        this.docEmptemp = docEmptemp;
        this.idSemestre = idSemestre;
    }

    public EmpTemp(long idEmptemp, String docEmptemp, long idSemestre) {
        this.idEmptemp = idEmptemp;
        this.docEmptemp = docEmptemp;
        this.idSemestre = idSemestre;
    }

    public long getIdEmptemp() {
        return idEmptemp;
    }

    public void setIdEmptemp(long idEmptemp) {
        this.idEmptemp = idEmptemp;
    }

    public String getDocEmptemp() {
        return docEmptemp;
    }

    public void setDocEmptemp(String docEmptemp) {
        this.docEmptemp = docEmptemp;
    }

    public long getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(long idSemestre) {
        this.idSemestre = idSemestre;
    }

    @Override
    public String toString() {
        return "EmpTemp{" +
                "idEmptemp=" + idEmptemp +
                ", docEmptemp='" + docEmptemp + '\'' +
                ", idSemestre=" + idSemestre +
                '}';
    }
}

