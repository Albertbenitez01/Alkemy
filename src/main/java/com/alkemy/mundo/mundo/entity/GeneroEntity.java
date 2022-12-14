package com.alkemy.mundo.mundo.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "genero")
@Getter
@Setter

public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //aca digo como genero nuestros id
    private Long id;

    private String nombre;

    private String imagen;

}
