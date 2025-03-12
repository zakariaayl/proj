package com.example.demo7;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private adresse a;
    @OneToMany(mappedBy = "std",cascade = CascadeType.ALL)
    private List<Module> moduleList=new ArrayList<>();

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", a=" + a +
                ", moduleList=" + moduleList +
                ", courList=" + courList +
                '}';
    }

    @ManyToMany(cascade = CascadeType.ALL)
    private  List<COUR> courList =new ArrayList<>();
    public student() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public student( adresse a,List<COUR> crs) {
       this.courList=crs;
        this.a = a;
    }

    public Long getId() {
        return id;
    }
}

