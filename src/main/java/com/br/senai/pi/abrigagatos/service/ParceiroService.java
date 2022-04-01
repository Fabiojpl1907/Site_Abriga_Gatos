package com.br.senai.pi.abrigagatos.service;


import com.br.senai.pi.abrigagatos.entity.Parceiro;
import org.springframework.data.domain.Page;

import java.util.List;


public interface ParceiroService {

    List<Parceiro> getAllParceiros();

    void saveParceiro(Parceiro parceiro);

    Parceiro getParceiroById(long id);

    void deleteParceiroById(long id);

    Page<Parceiro> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}