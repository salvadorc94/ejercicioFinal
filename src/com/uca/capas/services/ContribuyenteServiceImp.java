package com.uca.capas.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.repositories.ContribuyenteRepository;

@Service
public class ContribuyenteServiceImp implements ContribuyenteService {

	@Autowired
	private ContribuyenteRepository crepo;

	@Override
	public List<Contribuyente> listar() {
		return crepo.findAll();
	}

	@Transactional
	@Override
	public void insert(Contribuyente c) {
		crepo.save(c);
	}
}
