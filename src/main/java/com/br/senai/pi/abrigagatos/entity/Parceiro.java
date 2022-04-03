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

    @Column(name = "nome")
    private String nomeCompleto;

    @Column(name = "cpfcnpj")
    private String cpfcnpj;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "tipo")
    private String tipoParceria;

    @Column(name = "cep")
    private String cep;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;


}
