package com.example.demo7;

import jakarta.persistence.*;

@Entity
public class adresse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public adresse( String name) {
        this.name = name;

    }

    private String name;
    @OneToOne(mappedBy = "a")
    private student st;

    public adresse() {

    }
}
