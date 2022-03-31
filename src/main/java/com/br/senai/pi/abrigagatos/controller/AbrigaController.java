package com.br.senai.pi.abrigagatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : Abriga Gatos - Projeto Integrador - SENAI
 * Curso : Técnico de Informatica em Internet
 * User: Fábio José
 * Date: 31/03/2022
 */

@Controller
public class AbrigaController {


    // criar action que que o Spring mapeie  e
    // processa uma requisição do usuário
    // e retorna uma view ( html )
    //  Get para index

    @GetMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/construcao")
    public String construcao() {
        return "construcao";
    }
}

