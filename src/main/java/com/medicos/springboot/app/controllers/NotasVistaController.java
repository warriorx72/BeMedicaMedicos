package com.medicos.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.medicos.springboot.app.models.dao.INotasVistaDao;

@Controller
@SessionAttributes("notas_vista")
public class NotasVistaController {
	
	@Autowired
	private INotasVistaDao notasVistaDao;
	
//	@RequestMapping(value="/notas", method=RequestMethod.GET)
//	
//    public String listar(Model model) {
//		model.addAttribute("titulo1","historialDaoes");
//		model.addAttribute("notas",notasVistaDao.findAll());
//		
//		
//		return "notas";
//	   }
	
	@RequestMapping(value="/notas/{Id}", method=RequestMethod.GET)

	public String listar2(Model model,@PathVariable (value="Id")Long Id) {
		model.addAttribute("id",Id);
		model.addAttribute("titulo1","historiales");
		model.addAttribute("notas_vista",notasVistaDao.findAll());
		
		return "notas";
	  }



	
	

}
