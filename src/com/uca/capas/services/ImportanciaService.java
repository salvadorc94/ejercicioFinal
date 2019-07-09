package com.uca.capas.services;
import java.util.List;

import com.uca.capas.domain.Importancia;

public interface ImportanciaService {
	public List<Importancia> listar();
	
	public Importancia getOne(int id);
}
