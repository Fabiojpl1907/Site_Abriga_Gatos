package com.br.senai.pi.abrigagatos.controller;

import com.br.senai.pi.abrigagatos.entity.Parceiro;
import com.br.senai.pi.abrigagatos.service.ParceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * Project : Abriga Gatos - Projeto Integrador - SENAI
 * Curso : Técnico de Informatica em Internet
 * User: Fábio José
 * Date: 31/03/2022
 */

@Controller
public class AbrigaController {

    @Autowired
    private ParceiroService parceiroService;

    // criar action que que o Spring mapeie  e
    // processa uma requisição do usuário
    // e retorna uma view ( html )
    //  Get para index

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/adm")
    public String adm() {
        return "adm";
    }


    @GetMapping("/construcao")
    public String construcao() {
        return "construcao";
    }

    @GetMapping("/parceiros")
    public String parceiros() {
        return "parceiros";
    }

    @GetMapping("/doacao")
    public String doacao() {
        return "doacao";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }


    // listar parceiros
    @GetMapping("/listaParceiros")
    public String viewHomePage(Model model) {
        return findPaginated(1, "nomeCompleto", "asc", model);
    }


//save parceiros
    @GetMapping("/cadastroParceiros")
    public String showNewParceiroForm(Model model) {
    // cria atributo de modelo para vincular dados de formulário
    Parceiro parceiro = new Parceiro();
    model.addAttribute("parceiro", parceiro);
    return "cadastroParceiros";
}

    @PostMapping("/saveParceiro")
    public String saveParceiro(@ModelAttribute("parceiro") Parceiro parceiro) {
        // salva parceiro no banco de dados
        parceiroService.saveParceiro(parceiro);
        return "redirect:/parceiros";
    }

    // salvar na area de administração
    // retornando para lista
    @PostMapping("/saveParceiroAdm")
    public String saveParceiroAdm(@ModelAttribute("parceiro") Parceiro parceiro) {
        // salva parceiro no banco de dados
        parceiroService.saveParceiro(parceiro);
        return "redirect:/listaParceiros";
    }

    @GetMapping("/atualizarParceiro/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // pega parceiro do serviço
        Parceiro parceiro = parceiroService.getParceiroById(id);

        // ajusta parceiro como atributo modelo  para preencher formulario
        model.addAttribute("parceiro", parceiro);
        return "update_parceiros";
    }

    @GetMapping("/deleteParceiro/{id}")
    public String deleteParceiro(@PathVariable(value = "id") long id) {

        // chama metodo de deleção de parceiro
        this.parceiroService.deleteParceiroById(id);
        return "redirect:/listaParceiros";
    }

    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam("sortField") String sortField,
                                @RequestParam("sortDir") String sortDir,
                                Model model) {
        int pageSize = 5;

        Page<Parceiro> page = parceiroService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<Parceiro> listParceiros = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());

        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");

        model.addAttribute("listParceiros", listParceiros);
        return "listaParceiros";
    }





}

