package com.uca.capas.controller;

import java.util.Calendar;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Contribuyente;
import com.uca.capas.services.ContribuyenteService;
import com.uca.capas.services.ImportanciaService;
import com.uca.capas.domain.Importancia;

@Controller
public class MainController {
	
	@Autowired
	private ImportanciaService iservice;
	@Autowired
	private ContribuyenteService cservice;
	
	@RequestMapping("/")
	public ModelAndView main() {
		ModelAndView mav = new ModelAndView();
		Contribuyente contribuyente = new Contribuyente();
		mav.addObject("contribuyente",contribuyente);
		List<Importancia> importancias = null;
		try {
			importancias = iservice.listar();
		}catch(Exception e) {}
		mav.addObject("list",importancias);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/ver")
	public ModelAndView ver() {
		ModelAndView mav = new ModelAndView();
		List<Contribuyente> contribuyentes = null;
		try {
			contribuyentes = cservice.listar();
		}catch(Exception e) {}
		mav.addObject("contribuyentes",contribuyentes);
		mav.setViewName("contribuyentes");
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@Valid @ModelAttribute Contribuyente contribuyente, BindingResult result, @RequestParam("escoger") int c_importancia) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			List<Importancia> importancias = null;
			try {
				importancias = iservice.listar();
			}catch(Exception e) {}
			mav.addObject("list",importancias);
			mav.addObject("contribuyente",contribuyente);
			mav.setViewName("main");
			return mav;
		}else {
			Importancia importancia = null;
			try {
				importancia = iservice.getOne(c_importancia);
			}catch(Exception e) {}
			contribuyente.setImportancia(importancia);
			Calendar c = Calendar.getInstance();
			contribuyente.setF_fecha_ingreso(c.getTime());
			
			try {
				cservice.insert(contribuyente);
			}catch(Exception e) {}
			
		}
		List<Importancia> importancias = null;
		try {
			importancias = iservice.listar();
		}catch(Exception e) {}
		mav.addObject("contribuyente",new Contribuyente());
		mav.addObject("list",importancias);
		mav.setViewName("main");
		return mav;
	}
}
