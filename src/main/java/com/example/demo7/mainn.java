package com.example.demo7;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class mainn {
    public static void main(String[] args){
        EntityManagerFactory amf= Persistence.createEntityManagerFactory("o");
        EntityManager em= amf.createEntityManager();
        em.getTransaction().begin();
        adresse ad1=new adresse("ana");
        student student1=new student(ad1);
        em.persist(student1);
        em.persist(ad1);
        em.getTransaction().commit();

        em.close();
        amf.close();
    }
}
{
}
