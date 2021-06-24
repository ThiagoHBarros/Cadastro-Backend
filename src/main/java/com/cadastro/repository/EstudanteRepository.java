package com.cadastro.repository;

import com.cadastro.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante,Long> {
    

}