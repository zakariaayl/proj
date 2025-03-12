package com.example.demo7;


import jakarta.persistence.*;

@Entity
public class student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private adresse a;

    public student() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public student( adresse a) {

        this.a = a;
    }

    public Long getId() {
        return id;
    }
}

