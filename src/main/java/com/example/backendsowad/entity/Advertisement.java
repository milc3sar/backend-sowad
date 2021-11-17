package com.example.backendsowad.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;


@Entity
@Table(name = "advertisement")
@Data
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 3151633504564554313L;

    public Advertisement() {
        date = LocalDate.now();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private LocalDate date;

    private String location;

    private String detail;

    private boolean status;

    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = true)
    private Organization organization;
}