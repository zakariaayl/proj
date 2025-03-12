package com.example.demo7;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class mainn {
    public static void main(String[] args){
        EntityManagerFactory amf= Persistence.createEntityManagerFactory("o");
        EntityManager em= amf.createEntityManager();
        em.getTransaction().begin();
        adresse ad1=new adresse("ana");
        adresse ad2=new adresse("ana");
        adresse ad3=new adresse("ana");
        adresse ad4=new adresse("ana");

        List<COUR> crs=List.of(
                new COUR("web"),
                new COUR("data"),
                new COUR("uml")
        );
        student student1=new student(ad1,crs);
        em.persist(student1);
        em.persist(ad1);
        em.persist(ad2);
        em.persist(ad3);
        List<student> std=List.of(
                new student(ad2,crs),
                new student(ad3,crs)
        );
        COUR jee=new COUR(std);
        em.persist(jee);
        em.remove(ad1);
        em.remove(student1);
        em.remove(jee);
        em.getTransaction().commit();

        em.close();
        amf.close();
    }
}

