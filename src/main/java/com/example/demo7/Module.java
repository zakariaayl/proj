package com.example.demo7;

import jakarta.persistence.*;

@Entity
public class Module {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  private String name;
  @ManyToOne(cascade = CascadeType.ALL)
  private student std;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
