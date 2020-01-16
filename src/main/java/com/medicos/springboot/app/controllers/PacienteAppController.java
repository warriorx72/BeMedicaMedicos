package com.medicos.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.medicos.springboot.app.models.dao.IPacienteAppDao;
import com.medicos.springboot.app.models.entity.PacienteApp;

@Controller
public class PacienteAppController {
	
	@Autowired
	private IPacienteAppDao pacienteAppDao;
	
	
	@RequestMapping(value="/solicitud_archivo", method=RequestMethod.GET)

	public String listar(Model model) {
//		model.addAttribute("id",Id);
		model.addAttribute("titulo","Solicitudes");
		model.addAttribute("solicitud",pacienteAppDao.findAll());
		
		return "solicitud_archivo";
	  }

	
    @RequestMapping(value="/{id}")
	public String edita(@PathVariable (value="id")Long id, Map<String, Object> model) {

    	PacienteApp pma = null;
    	
		if(id > 0) {
			pma = pacienteAppDao.findOne(id);
		}else {
			return "redirect:/notas";
		}
		model.put("evo2", pma);
		model.put("title2", "info paciente");
		return "nota_evolucion";
		
	}

    @RequestMapping(value="/", method=RequestMethod.POST)
	public String guarda(Map<String, Object> m,@Valid PacienteApp pma ,BindingResult result, Model model, SessionStatus status) {
		
		if(result.hasErrors()) {
			model.addAttribute("titles","altas paciente");
			return "nota_evolucion";
		}
		
		m.put("evo2", pma);
		pacienteAppDao.save(pma);
		status.setComplete();
		return "nota_evolucion";
		
	}
   

}
