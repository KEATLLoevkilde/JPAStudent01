package com.example.jpastudent01.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Skole {
    @Id
    private String navn;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "skole")
    @JsonBackReference
    private Set<Student> studenter = new HashSet<>();



    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Set<Student> getStudenter() {
        return studenter;
    }

    public void setStudenter(Set<Student> studenter) {
        this.studenter = studenter;
    }
}
