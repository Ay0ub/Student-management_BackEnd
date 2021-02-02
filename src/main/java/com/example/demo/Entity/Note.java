package com.example.demo.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Note {

    @Id

    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long idNote;
    private double Note;
    private long idUser;
    private long idModule;

    public Note() {
    }

    public Note(double note, long idUser, long idModule) {
        Note = note;
        this.idUser = idUser;
        this.idModule = idModule;
    }

    public Note(long idNote, double note, long idUser, long idModule) {
        this.idNote = idNote;
        Note = note;
        this.idUser = idUser;
        this.idModule = idModule;
    }

    public long getIdNote() {
        return idNote;
    }

    public void setIdNote(long idNote) {
        this.idNote = idNote;
    }

    public double getNote() {
        return Note;
    }

    public void setNote(double note) {
        Note = note;
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
        return "Note{" +
                "idNote=" + idNote +
                ", Note=" + Note +
                ", idUser=" + idUser +
                ", idModule=" + idModule +
                '}';
    }
}

