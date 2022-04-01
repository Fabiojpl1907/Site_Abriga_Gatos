package com.br.senai.pi.abrigagatos.service;

import com.br.senai.pi.abrigagatos.entity.Parceiro;
import com.br.senai.pi.abrigagatos.repository.ParceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ParceiroServiceImpl implements ParceiroService {

    @Autowired
    private ParceiroRepository parceiroRepository;

    @Override
    public List<Parceiro> getAllParceiros() {
        return parceiroRepository.findAll();
    }

    @Override
    public void saveParceiro(Parceiro parceiro) {
        this.parceiroRepository.save(parceiro);
    }

    @Override
    public Parceiro getParceiroById(long id) {
        Optional<Parceiro> optional = parceiroRepository.findById(id);
        Parceiro parceiro = null;
        if (optional.isPresent()) {
            parceiro = optional.get();
        } else {
            throw new RuntimeException(" Parceiro não encontrado :: " + id);
        }
        return parceiro;
    }

    @Override
    public void deleteParceiroById(long id) {
        this.parceiroRepository.deleteById(id);
    }

    @Override
    public Page<Parceiro> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
                Sort.by(sortField).descending();

        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.parceiroRepository.findAll(pageable);
    }

}
