package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uca.capas.domain.Importancia;


@Repository
public interface ImportanciaRepository extends JpaRepository<Importancia,Integer> {

}
