package com.uca.capas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uca.capas.domain.Contribuyente;;

@Repository
public interface ContribuyenteRepository extends JpaRepository<Contribuyente,Integer> {

}
