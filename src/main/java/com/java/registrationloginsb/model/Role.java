package com.java.registrationloginsb.model;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {

    }
}
