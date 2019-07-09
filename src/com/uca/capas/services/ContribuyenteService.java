package com.uca.capas.services;
import java.util.List;

import com.uca.capas.domain.Contribuyente;


public interface ContribuyenteService {
	public List<Contribuyente> listar();
	
	public void insert(Contribuyente c);
}

