package com.br.senai.pi.abrigagatos.repository;



import java.util.List;
import com.br.senai.pi.abrigagatos.entity.Doador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DoadorRepository extends JpaRepository<Doador, Long> {


}
