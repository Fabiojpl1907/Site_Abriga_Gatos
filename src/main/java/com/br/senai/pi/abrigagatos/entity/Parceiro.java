package com.br.senai.pi.abrigagatos.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Project : Abriga Gatos - Projeto Integrador - SENAI
 * Curso : Técnico de Informatica em Internet
 * User: Fábio José
 * Date: 31/03/2022
 */

@Entity
@Table(name = "parceiros")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Parceiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
}
