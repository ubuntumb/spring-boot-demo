package uca.edu.py.prueba.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import uca.edu.py.prueba.model.Persona;
import uca.edu.py.prueba.repository.PersonaRepository;

@Controller
@RequestMapping("/")
public class Home {

	@Autowired
	private PersonaRepository personaService;

	@RequestMapping(value = "/")
	@Transactional(readOnly = true)
	public String helloWorld(Model model) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfhora = new SimpleDateFormat("HH:mm:ss");
		model.addAttribute("fecha", sdf.format(new Date()));
		model.addAttribute("hora", sdf.format(new Date()));
		model.addAttribute("mensaje","<h1>Proyecto Demo Spring boot con Freemarker!!!</h1>");
		return "index";
	}
	
	@RequestMapping(value="/persona")
	@Transactional
	@ResponseBody
	public Object createPerson(){
		Persona p = new Persona();
		p.setNombre("Marcos");
		p.setApellido("Benitez");
		p.setCedula("4795523");
		p.setSexo(1);
		personaService.save(p);
		
		return p;
	}
}
