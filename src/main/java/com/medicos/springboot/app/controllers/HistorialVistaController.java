package com.medicos.springboot.app.controllers;
import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.medicos.springboot.app.models.dao.IHistorialVistaDao;
import com.medicos.springboot.app.repository.UserRepository;
import com.medicos.springboot.app.service.UserService;

@Controller
@SessionAttributes("historial_vista")
public class HistorialVistaController {
	
	@Autowired
	private IHistorialVistaDao historialVistaDao;
	
	@Autowired
	UserRepository repository;

	
@RequestMapping(value="/historial_clinico", method=RequestMethod.GET)

     public String listar(Model model,HttpServletRequest request,Long Id) {
	
	Id = (Long) request.getSession().getAttribute("id");
	    
      System.out.println(Id +"---------------por favor");
	    model.addAttribute("id",Id);
	    model.addAttribute("titulo1","historiales");
		model.addAttribute("vista",historialVistaDao.findAll());
		
		
		return "historial_clinico";
	   }



}