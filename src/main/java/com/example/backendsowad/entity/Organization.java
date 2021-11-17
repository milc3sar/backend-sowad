package com.example.backendsowad.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="organization")
public class Organization implements Serializable {

    private static final long serialVersionUID = 152955265074111113L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
}