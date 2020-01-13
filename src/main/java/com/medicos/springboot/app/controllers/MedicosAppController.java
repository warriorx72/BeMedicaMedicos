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

import com.medicos.springboot.app.models.dao.IMedicosAppDao;
import com.medicos.springboot.app.models.entity.MedicosApp;

@Controller
@SessionAttributes("MedicosApp")
public class MedicosAppController {
	
	@Autowired
	private IMedicosAppDao medicosDao;
	
	@RequestMapping(value="/perfil_ver/{ID}")
	public String editar(@PathVariable(value="ID") Long ID,Map<String, Object> model) {
		
		MedicosApp medicosApp = null;
	
	    medicosApp = medicosDao.findOne(ID);
			
		model.put("perfiles",medicosApp);
		model.put("ID",ID);
		model.put("titulo", "Editar doctor");
		return "perfil";
		
	}
	
	@RequestMapping(value="/editar_perfil/{id}")
	public String editar1(@PathVariable(value="id") Long id, Map<String, Object> model) {
		MedicosApp medicosApp = null;
		if(id > 0) {
			medicosApp = medicosDao.findOne(id);
		}else {
			return "redirect:/perfil";
		}
		model.put("perfiles", medicosApp);
		model.put("titulo", "Editar doctor");
		return "editar_perfil";
		
	}
	@RequestMapping(value="/editar_perfil", method=RequestMethod.POST)
	public String guardar(@Valid MedicosApp medicosApp ,BindingResult result, Model model, SessionStatus status) {
		
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de medicos");
			return "editar_pefil";
		}
		medicosDao.save(medicosApp);
		status.setComplete();
		return "redirect:/perfil_ver/"+medicosApp.getMedicosId();
		
	}

}
