package com.example.jpastudent01.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Student {
    //id, navn, bornDate, bornTime
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String navn;
    private LocalDate bornDate;
    private LocalTime bornTime;

    @ManyToOne
    @JoinColumn(name = "skole", referencedColumnName = "navn")
    Skole skole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Skole getSkole() {
        return skole;
    }

    public void setSkole(Skole skole) {
        this.skole = skole;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public LocalTime getBornTime() {
        return bornTime;
    }

    public void setBornTime(LocalTime bornTime) {
        this.bornTime = bornTime;
    }
}
