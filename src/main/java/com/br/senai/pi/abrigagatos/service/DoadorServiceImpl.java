package com.br.senai.pi.abrigagatos.service;


// Importing required classes
import java.util.List;
import java.util.Objects;

import com.br.senai.pi.abrigagatos.entity.Doador;
import com.br.senai.pi.abrigagatos.repository.DoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class DoadorServiceImpl  implements DoadorService {
 
    @Autowired
    private DoadorRepository doadorRepository;
 
    // Save operation
    @Override
    public Doador saveDoador(Doador doador)
    {
        return doadorRepository.save(doador);
    }
 
    // Read operation
    @Override public List<Doador> fetchDoadorList()
    {
        return (List<Doador>)
            doadorRepository.findAll();
    }

    @Override
    public Doador updateDoador(Doador Doador, Long Id) {
        return null;
    }

    // Update operation
    @Override
    public Doador
    updateDepartment(Doador doador,
                     Long Id)
    {
       Doador depDB
            = doadorRepository.findById(Id).get();
 
        if (Objects.nonNull(doador.getNome())
            && !"".equalsIgnoreCase(
                doador.getNome())) {
            depDB.setNome(
                doador.getNome());
        }
 
        if (Objects.nonNull(
                doador.getCpf())
            && !"".equalsIgnoreCase(
                doador.getCpf())) {
            depDB.setCpf(
                doador.getCpf());
        }
 
        if (Objects.nonNull(doador.getEndereco())
            && !"".equalsIgnoreCase(
                doador.getEndereco())) {
            depDB.setEndereco(
                doador.getEndereco());
        }

        if (Objects.nonNull(doador.getEmail())
                && !"".equalsIgnoreCase(
                doador.getEmail())) {
            depDB.setEmail(
                    doador.getEmail());
        }
        if (Objects.nonNull(doador.getTelefone())
                && !"".equalsIgnoreCase(
                doador.getTelefone())) {
            depDB.setEmail(
                    doador.getTelefone());
        }

        if (Objects.nonNull(doador.getDoacaoMaterial())
                && !"".equalsIgnoreCase(
                doador.getDoacaoMaterial())) {
            depDB.setEmail(
                    doador.getDoacaoMaterial());
        }

        if (Objects.nonNull(doador.getDoacaoValor())
                && !"".equalsIgnoreCase(
                doador.getDoacaoValor())) {
            depDB.setEmail(
                    doador.getDoacaoValor());
        }



        return doadorRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteDoadorById(Long departmentId)
    {
        doadorRepository.deleteById(departmentId);
    }
}


 