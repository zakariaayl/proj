package com.example.demo7;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class COUR {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "courList",cascade = CascadeType.ALL)
    private List<student> stds=new ArrayList<>();
    private String name;

    public COUR(String name) {
        this.name = name;
    }

    public COUR() {
    }

    public COUR(List<student> stds) {
        this.stds = stds;
    }

    public COUR(long id) {
        this.id=id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
