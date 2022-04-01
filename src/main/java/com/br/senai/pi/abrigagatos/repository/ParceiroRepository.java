package com.br.senai.pi.abrigagatos.repository;


import com.br.senai.pi.abrigagatos.entity.Parceiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ParceiroRepository extends JpaRepository<Parceiro, Long> {
}
