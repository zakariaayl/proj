package com.example.demo7;

import jakarta.persistence.*;

@Entity
public class adresse {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public adresse( String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "adresse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", st=" + st +
                '}';
    }

    private String name;
    @OneToOne(mappedBy = "a",cascade = CascadeType.ALL)
    private student st;

    public adresse() {

    }
}
