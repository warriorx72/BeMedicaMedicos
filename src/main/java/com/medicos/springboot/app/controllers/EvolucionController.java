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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.medicos.springboot.app.models.dao.IEvolucionDao;
import com.medicos.springboot.app.models.dao.IPacienteAppDao;
import com.medicos.springboot.app.models.entity.Evolucion;
import com.medicos.springboot.app.models.entity.PacienteApp;


@Controller
@SessionAttributes("evolucion")
public class EvolucionController {
	
	@Autowired
	private IEvolucionDao evolucionDao;
	
	@Autowired
	private IPacienteAppDao pacienteMedicoApDao;
	

	
//	@RequestMapping(value="/nota_evolucion", method=RequestMethod.GET)
//	
//    public String listar(Model model) {
//		model.addAttribute("titulo2","Notas");
//		model.addAttribute("evo",evolucionDao.findAll());
//		
//		
//		return "nota_evolucion";
//	   }
	
	
	@RequestMapping(value="/nota_evolucion/{Id}")
	
    public String editar(@PathVariable (value="Id")Long Id,Long aux, Map<String, Object> model) {
//		Long aux = evolucion.getPacienteId();
//	    pma=pacienteMedicoApDao.findOne(aux);
		
		PacienteApp pma = null;
		
		Evolucion evolucion = null;
		
	
		
		if(Id > 0) {
			evolucion = evolucionDao.findOne(Id);
		
		    pma=pacienteMedicoApDao.findOne(evolucion.getPacienteId());
		   
			
		}else {
			return "redirect:/notas";
		}
		aux =evolucion.getPacienteId();
    	model.put("evo", evolucion);
		model.put("titulo", "notas de evolucion");
		model.put("evo2", pma);
		model.put("id",aux);
		model.put("title2", "info paciente");
		return "nota_evolucion";
		
		
	}
	
	@RequestMapping(value="/nota_evolucion", method=RequestMethod.POST)
	public String guardar(Map<String, Object> m, @Valid Evolucion evolucion,@Valid PacienteApp pma ,BindingResult result, Model model, SessionStatus status) {
	
		
		
		if(result.hasErrors()) {
			model.addAttribute("title","notas");
			model.addAttribute("titles","altas paciente");
			
			return "nota_evolucion";
		}
		m.put("evo", evolucion);
		m.put("evo2", pma);
		evolucionDao.save(evolucion);
		pacienteMedicoApDao.save(pma);
		status.setComplete();
		return "redirect:/notas/"+ evolucion.getPacienteId();		
		
	}
	
	
	@RequestMapping(value="/nota_evolucion_nueva/{Id}")
	public String crear(@PathVariable (value="Id")Long Id,Map<String, Object> model) {
		
		Evolucion evolucion = new Evolucion();
		PacienteApp pma ;
	
			//Long aux = pma.getAltaPacienteId();
			pma=pacienteMedicoApDao.findOne(Id);
		
		
		model.put("evo",evolucion);
		model.put("titulo","Formulario de paciente");
		model.put("evo2",pma);
		model.put("id",Id);
		model.put("title2","info paciente");
		return "nota_evolucion";
	}
	
	


}
