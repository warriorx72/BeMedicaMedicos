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

import com.medicos.springboot.app.models.dao.IDoctoresPagoDao;
import com.medicos.springboot.app.models.entity.DoctoresPago;

@Controller
@SessionAttributes("DoctoresPago")
public class DoctoresPagoController {
	
	@Autowired
	private IDoctoresPagoDao doctoresPagoDao;
	
//	@RequestMapping(value="/mis_datos", method=RequestMethod.GET)
//
//	public String listar(Model model,@PathVariable (value="id")Long Id) {
//		model.addAttribute("id",Id);
//		model.addAttribute("titulo","historiales");
//		model.addAttribute("pagos",doctoresPagoDao.findAll());
//		
//		return "mis_datos";
//	  }
	
	@RequestMapping(value="/mis_datos/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model) {
		
		DoctoresPago doctoresPago = null;
		
		if(id > 0) {
			doctoresPago = doctoresPagoDao.findOne(id);
		}else {
			return "redirect:/mis datos";
		}
		model.put("pago", doctoresPago);
		model.put("titulo", "Editar doctor");
		return "mis_datos";
		
	}
	
	@RequestMapping(value="/mis_datos", method=RequestMethod.POST)
	public String guardar(@Valid DoctoresPago doctoresPago ,BindingResult result, Model model, SessionStatus status) {
		
		
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de doctores");
			return "mis_datos";
		}
		doctoresPagoDao.save(doctoresPago);
		status.setComplete();
		return "redirect:/mis_datos/"+doctoresPago.getPagoId();
		
	}

	

}
