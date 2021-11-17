package com.example.backendsowad.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}