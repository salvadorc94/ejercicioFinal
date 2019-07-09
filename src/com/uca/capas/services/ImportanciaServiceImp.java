package com.uca.capas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Importancia;
import com.uca.capas.repositories.ImportanciaRepository;

@Service
public class ImportanciaServiceImp implements ImportanciaService {
	@Autowired
	private ImportanciaRepository irepo;

	@Override
	public List<Importancia> listar() {
		return irepo.findAll();
	}

	@Override
	public Importancia getOne(int id) {
		return irepo.getOne(id);
	}

}
