package com.medicos.springboot.app.controllers;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import com.medicos.springboot.app.models.entity.PaquetesCultivos;
import com.medicos.springboot.app.models.entity.PaquetesEstudiosApp;
import com.medicos.springboot.app.models.entity.PaquetesPerfiles;
import com.medicos.springboot.app.models.entity.Perfiles;
import com.medicos.springboot.app.models.entity.Paquetes;
import com.medicos.springboot.app.models.dao.IMedEstudiosDao;
import com.medicos.springboot.app.models.dao.IMedPaquetesDao;
import com.medicos.springboot.app.models.dao.IMedPerfilesDao;
import com.medicos.springboot.app.models.dao.IMedicosPerfilAppDao;
import com.medicos.springboot.app.models.dao.IPaquetesCultivosDao;
import com.medicos.springboot.app.models.dao.IPaquetesDao;

import com.medicos.springboot.app.models.dao.IEstudiosDao;
import com.medicos.springboot.app.models.dao.IPaquetesEstudiosAppDao;
import com.medicos.springboot.app.models.dao.IPaquetesPerfilesDao;
import com.medicos.springboot.app.models.dao.IPerfilesAppDao;
import com.medicos.springboot.app.models.dao.IPerfilesDao;
import com.medicos.springboot.app.models.entity.MedicosPerfilApp;
import com.medicos.springboot.app.models.entity.MedEstudios;
import com.medicos.springboot.app.models.entity.MedPaquetes;
import com.medicos.springboot.app.models.entity.MedPerfiles;
import com.medicos.springboot.app.models.entity.PerfilesApp;
import com.medicos.springboot.app.models.entity.Estudios;


@Controller

public class MedicosPerfilAppController1 {

	


	@Autowired
	private IMedicosPerfilAppDao medicosperfilappDao;
	
	@Autowired
	private IPerfilesAppDao perfilesappDao;

	
	@Autowired
	private IPaquetesEstudiosAppDao paquetesEstudiosAppDao;

	@Autowired
	private IMedPaquetesDao medpaquetesDao;
	

	@Autowired
	private IPaquetesPerfilesDao paquetesPerfilesDao;
	
	@Autowired
	private IPaquetesCultivosDao paquetesCultivosDao;
	
	@Autowired
	private IMedPerfilesDao medperfilesDao;

	@Autowired
	private IPaquetesDao paquetesDao;
	
	@Autowired
	private IEstudiosDao estudiosDao;

	@Autowired
	private IPerfilesDao perfilesDao;
	
	@Autowired
	private IMedEstudiosDao medestudiosDao;


	@RequestMapping(value="/listar_perfiles", method=RequestMethod.GET)
	
	public String listar(Model model, Map<String, Object> m) {
		
		MedicosPerfilApp medicosperfilapp = new MedicosPerfilApp();
		
		model.addAttribute("titulo","Condiciones paciente");
		
		model.addAttribute("titulo1","Formulario medicos");
		model.addAttribute("crear", medicosperfilappDao.findAll());
		m.put("medicosperfilapp", medicosperfilapp);
		medicosperfilappDao.findLastMedicosPerfilAppId();
		return "listar_perfiles";
	   }
/*--------------------------------------------------------------------------------------------------------------------------------------------*/

	@RequestMapping(value="/perfiles", method=RequestMethod.GET)
	
	public String listado(Model model, Map<String, Object> m) {
		
		PerfilesApp perfilesapp = new PerfilesApp();
		MedPerfiles medperfiles = new MedPerfiles();
		 MedPaquetes medpaquetes = new MedPaquetes();
		 MedEstudios medestudios = new MedEstudios();

		model.addAttribute("titulo1","Condiciones paciente");
		////model.addAttribute("estudios", paquetesEstudiosAppDao.findEstudios(4l));
		model.addAttribute("titulo2","Formulario medicos");
		model.addAttribute("titulo3","guardar perfiles");
		model.addAttribute("estudios");
		model.addAttribute("perfiles");
		model.addAttribute("paquetes");

	m.put("medpestudios", medestudios);
	m.put("medperfiles", medperfiles);
	m.put("medpaquetes", medpaquetes);
	m.put("medestudios", medestudios);
		////model.addAttribute("perfiles", perfilesappDao.findAll());
	///model.addAttribute("estudios", estudiosDao.findAll());
		///PaquetesCultivos paquetesCultivos=new PaquetesCultivos();
		//7PaquetesEstudiosApp paquetesEstudiosApp = new PaquetesEstudiosApp();
		///PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
	/////	m.put("paquetesCultivos",paquetesCultivos);
	///	m.put("paquetesEstudiosApp",paquetesEstudiosApp);
	////	m.put("paquetesPerfiles",paquetesPerfiles);
		m.put("perfilesapp", perfilesapp);
		///model.addAttribute("perfiles", perfilesDao.findAll());///////77BIEN
		///model.addAttribute("estudios",estudiosDao.findAll());
		//model.addAttribute("paquetes", paquetesDao.findAll());
		perfilesappDao.findLastPerfilesAppId();
		return "perfiles";
	   }
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/perfil/{medicos_perfiles_id}")
	public String detalles(@PathVariable(value="medicos_perfiles_id") Long id, Map<String, Object> model,Model m) {
		PerfilesApp perfilesapp = null;
		if(id > 0) {
			perfilesapp = perfilesappDao.findOne(id);
		}else {
			return "redirect:/listar_perfiles";
		}
		model.put("perfilesapp", perfilesapp);
		model.put("titulo", "Editar estudio");
		m.addAttribute("titulo1","Condiciones paciente");
		
		m.addAttribute("titulo2","Formulario medicos");
		m.addAttribute("perfiles", perfilesappDao.findAll());
		return "perfiles";
		
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/

	@RequestMapping(value = "/estudios_perfiles")
	public String crear(Map<String, Object> model,  Model m) {
		// m.addAttribute("estudios", estudiosDao.findAll());
		PaquetesEstudiosApp paquetesEstudiosApp = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		model.put("paquetesEstudiosApp", paquetesEstudiosApp);
		model.put("paquetesCultivos", paquetesCultivos);
		model.put("titulo3", "Guardar Perfil");
		return "perfiles";
	}

	
/*--------------------------------------------------------------------------------------------------------------------------------------------*/	
	
	@RequestMapping(value = "/perfilessapp", method = RequestMethod.POST)
	public String guardarPerfiles(Map<String, Object> m,PerfilesApp perfilesapp, MedEstudios medestudios, BindingResult result, Model model,
			SessionStatus status) {
		
		if (result.hasErrors()) {
			return "perfiles";
		}
		perfilesapp.setPerfilEstatus(true);
		perfilesappDao.save(perfilesapp);
		///MedEstudios medestudios=new MedEstudios();
		///m.put("medestudios", medestudios);
		//PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		///PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		///PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		/////////////////////////////77
		///7MedEstudios medestudios=new MedEstudios();
		PerfilesApp aux=null;
		aux=perfilesappDao.findOne(perfilesapp.getMedicos_Perfil_Id());
		///System.out.println(aux.getMedicos_perfiles_id());
	    model.addAttribute("medestudios",aux);
		m.put("medestudios",aux);
		model.addAttribute("medpaquetes",aux);
		m.put("medpaquetes",aux);
		model.addAttribute("medperfiles",aux);
		m.put("medperfiles",aux);
		///model.addAttribute("medestudios",medestudios);
		////m.put("medestudios",medestudios);
		System.out.println(aux.getMedicos_Perfil_Id());
		////////////////////
MedicosPerfilApp medicosperfilapp = new MedicosPerfilApp();
		
		model.addAttribute("titulo","Condiciones paciente");
		
		model.addAttribute("titulo1","Formulario medicos");
		model.addAttribute("crear", medicosperfilappDao.findAll());
		m.put("medicosperfilapp", medicosperfilapp);
	
		/////////////////////////////
	///	paquetesEstudios.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
	///	paquetesPerfiles.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
	///	paquetesCultivos.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
		///m.put("paquetesEstudios",paquetesEstudios);
		///m.put("paquetesPerfiles", paquetesPerfiles);
		m.put("perfilesapp", perfilesapp);
		///m.put("paquetesCultivos", paquetesCultivos);
		
		m.put("titulo4", "Guardar Perfil");
	
		model.addAttribute("perfiles", perfilesDao.findAll());///////77BIEN
		model.addAttribute("estudios",estudiosDao.findAll());
		model.addAttribute("paquetes", paquetesDao.findAll());
	///	model.addAttribute("paquetes", paquetesappDao.findAll());
	///	model.addAttribute("estudios", estudiosappDao.findAll());
	///	model.addAttribute("cultivos", cultivosappDao.findAll());
		///model.addAttribute("p", paquetesPerfilesDao.findAllById(perfilesapp.getMedicos_Perfil_Id()));
		///model.addAttribute("cultivos", paquetesCultivosDao.findAllById(perfilesapp.getMedicos_Perfil_Id()));
		return "perfiles";
	}

/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping(value="/estudios_paquetes", method=RequestMethod.POST)
	public String guardarPaquete (Map<String, Object> m, MedPaquetes medpaquetes,MedPerfiles medperfiles,MedEstudios medestudios, PerfilesApp perfilesapp,BindingResult result , Model model,SessionStatus status)
	{		
		
		perfilesapp=perfilesappDao.findOne(perfilesapp.getMedicos_Perfil_Id());///importante para editar
		//model.addAttribute("catalogos", catalogoDao.findAll());
		
		m.put("titulo","Guardar Paquete");
		m.put("perfilesapp",perfilesapp);
		model.addAttribute("perfiles", perfilesappDao.findAll());
		//model.addAttribute("estudioss", perfilesEstudiosDao.findAllById(perfiles.getPerfilId()));
		if(result.hasErrors()) {
			return "perfiles";
		}
		////MedPaquetes medpaquetes=new MedPaquetes();
		medpaquetesDao.save(medpaquetes);;
		model.addAttribute("estudioss", medestudiosDao.findAll2(medestudios.getMedicos_Perfil_Id()));
		model.addAttribute("perfiless", medperfilesDao.findAll2(medperfiles.getMedicos_Perfil_Id()));
		model.addAttribute("paquetess", medpaquetesDao.findAll2(medpaquetes.getMedicos_Perfil_Id()));

		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
	///	paquetesEstudios.setPaqueteId(paquetes.getPaqueteId());
		///paquetesPerfiles.setPaqueteId(paquetes.getPaqueteId());
	///	paquetesCultivos.setPaqueteId(paquetes.getPaqueteId());
		m.put("perfilesapp", perfilesapp);
		 ////  medestudiosDao.save(medestudios);
		 
		   
		   m.put("medestudios", medestudios);
		   m.put("medperfiles", medperfiles);
		   m.put("medpaquetes", medpaquetes);
		   model.addAttribute("paquetes",paquetesDao.findAll());
		   model.addAttribute("perfiles",perfilesDao.findAll());
		   model.addAttribute("estudios",estudiosDao.findAll());
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetesPerfiles", paquetesPerfiles);
		m.put("paquetesCultivos", paquetesCultivos);
		///model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(paquetes.getPaqueteId()));
		///model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(paquetes.getPaqueteId()));
		//model.addAttribute("cultivos", paquetesCultivosDao.findAllById(paquetes.getPaqueteId()));
		return "perfiles";
	}
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesEstudios13", method=RequestMethod.POST) //////////PERFILES
	public String guardarPaqueteEstudiosApp (Map<String, Object> m,PerfilesApp perfilesapp,MedPerfiles medperfiles,MedPaquetes medpaquetes, MedEstudios medestudios,BindingResult result , Model model,SessionStatus status)
	{	
		//model.addAttribute("catalogos", catalogoDao.findAll());
		///PaquetesEstudiosApp aux=null;
		///aux=paquetesEstudiosAppDao.findOne(paquetesEstudiosApp.getPaqueteId());
		if(result.hasErrors()) {
			return "perfiles";
		}
		medperfilesDao.save(medperfiles);
		
		//paquetesEstudiosAppDao.save(paquetesEstudiosApp);
		//m.put("paquetesEstudiosApp",paquetesEstudiosApp);
		m.put("perfilesapp", perfilesapp);
		 ////  medestudiosDao.save(medestudios);
		 
		   
		   m.put("medestudios", medestudios);
		   m.put("medperfiles", medperfiles);
		   m.put("medpaquetes", medpaquetes);
			model.addAttribute("estudioss", medestudiosDao.findAll2(medestudios.getMedicos_Perfil_Id()));
			model.addAttribute("perfiless", medperfilesDao.findAll2(medperfiles.getMedicos_Perfil_Id()));
			model.addAttribute("paquetess", medpaquetesDao.findAll2(medpaquetes.getMedicos_Perfil_Id()));

		   model.addAttribute("paquetes",paquetesDao.findAll());
		   model.addAttribute("perfiles",perfilesDao.findAll());
		   model.addAttribute("estudios",estudiosDao.findAll());
		
		
		return "perfiles";
	}

/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesPerfiles12", method=RequestMethod.POST)
	public String guardarPaquetePerfiles (Map<String, Object> m,PerfilesApp perfilesapp,MedEstudios medestudios,MedPerfiles medperfiles,MedPaquetes medpaquetes, BindingResult result , Model model,SessionStatus status)
	{	
		

		
		perfilesapp=perfilesappDao.findOne(perfilesapp.getMedicos_Perfil_Id());
	
		
		System.out.println(perfilesapp.getCosto());
		////////////////////
MedicosPerfilApp medicosperfilapp = new MedicosPerfilApp();
		
		model.addAttribute("titulo","Condiciones paciente");
		
		model.addAttribute("titulo1","Formulario medicos");
		model.addAttribute("crear", medicosperfilappDao.findAll());
		m.put("medicosperfilapp", medicosperfilapp);
	
	
		m.put("perfilesapp", perfilesapp);
		
		///////////////////////////////////////////77
		if(result.hasErrors()) {
			return "estudios_perfiles";
		}
		//medestudios.setMedicos_perfiles_id(aux.getMedicos_Perfil_Id());
	   //medperfiles.setMedicos_perfiles_id(1000720L);
	   //medperfiles.setPerfil_id(13L);
		m.put("perfilesapp", perfilesapp);
	   medestudiosDao.save(medestudios);
	 
	   
	   m.put("medestudios", medestudios);
	   m.put("medperfiles", medperfiles);
	   m.put("medpaquetes", medpaquetes);
	   model.addAttribute("paquetes",paquetesDao.findAll());
	   model.addAttribute("perfiles",perfilesDao.findAll());
	   model.addAttribute("estudios",estudiosDao.findAll());
		model.addAttribute("estudioss", medestudiosDao.findAll2(medestudios.getMedicos_Perfil_Id()));
		model.addAttribute("perfiless", medperfilesDao.findAll2(medperfiles.getMedicos_Perfil_Id()));
		model.addAttribute("paquetess", medpaquetesDao.findAll2(medpaquetes.getMedicos_Perfil_Id()));

	
		
		
		
		return "perfiles";
	}
	
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesCultivos21", method=RequestMethod.POST)
	public String guardarPaquetesCultivos (Map<String, Object> m,PaquetesCultivos paquetesCultivos,BindingResult result , Model model,SessionStatus status)
	{	
		//model.addAttribute("catalogos", catalogoDao.findAll());
		PaquetesCultivos aux=null;
		aux=paquetesCultivosDao.findOne(paquetesCultivos.getPaqueteId());
		if(result.hasErrors()) {
			return "perfiles";
		}
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		paquetesCultivos.setPaqueteId(aux.getPaqueteId());
		paquetesPerfiles.setPaqueteId(aux.getPaqueteId());
		paquetesEstudios.setPaqueteId(aux.getPaqueteId());
		paquetesCultivosDao.save(paquetesCultivos);
		m.put("titulo","Guardar Paquete");	
		m.put("paquetesCultivos", paquetesCultivos);
		m.put("paquetesPerfiles",paquetesPerfiles);
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetes",aux);
		model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("cultivos", paquetesCultivosDao.findAllById(aux.getPaqueteId()));

		return "perfiles";
	}
	
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping(value="/estudios_paquete/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model,Model m) {
		Paquetes paquetes = null;
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		if(id>0) {
			System.out.print("i´m here"+id);
			paquetes=paquetesDao.findOne(id);
		}
		else {
			return "redirect:estudios_listar/";
		}
		model.put("paquetes",paquetes);
		paquetesEstudios.setPaqueteId(id);
		paquetesCultivos.setPaqueteId(id);
		paquetesPerfiles.setPaqueteId(id);
		paquetesEstudios.setPaqueteId(id);
		model.put("paquetesCultivos", paquetesCultivos);
		model.put("paquetesPerfiles",paquetesPerfiles);
		model.put("paquetesEstudios",paquetesEstudios);
		model.put("titulo","Guardar Paquete");	
		m.addAttribute("cultivos", paquetesCultivosDao.findAllById(id));
		m.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(id));
		m.addAttribute("perfiles", paquetesPerfilesDao.findAllById(id));
		m.addAttribute("cultivos", paquetesCultivosDao.findAllById(id));
		return "perfiles";		
	}
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value = "/EliminarRecurso/{id}/{id_e}/{t}")
	public String eliminar(@PathVariable(value = "id") Long id, @PathVariable(value = "id_e") Long id_e,
			@PathVariable(value = "t") int t, Model model, Map<String, Object> m, Perfiles perfil,PerfilesApp perfilesapp) {
		
		PerfilesApp aux = null;
		aux = perfilesappDao.findOne(id_e);
		MedEstudios medestudios=new MedEstudios();
		MedPerfiles medperfiles =new MedPerfiles();
		MedPaquetes medpaquetes = new MedPaquetes();
		medperfiles.setMedicos_Perfil_Id(aux.getMedicos_Perfil_Id());
		medestudios.setMedicos_Perfil_Id(aux.getMedicos_Perfil_Id());
		medpaquetes.setMedicos_Perfil_Id(aux.getMedicos_Perfil_Id());
		m.put("perfilesapp", aux);
		System.out.println(perfilesapp.getCosto());
		System.out.println(aux.getCosto());
		if (t == 1 && id > 0 && id!=null) {

			medestudiosDao.delete(id);

		}
		if(t == 3 && id > 0 && id!=null){
			medpaquetesDao.delete(id);
		}
		if(t == 4 && id > 0 && id!=null){
			medperfilesDao.delete(id);
		}
		m.put("perfilesapp", perfilesapp);
		model.addAttribute("perfilesapp",perfilesapp);
		model.addAttribute("medperfiles",medperfiles);
		model.addAttribute("medpaquetes",medpaquetes);
		model.addAttribute("medestudios",medestudios);
		model.addAttribute("estudioss", medestudiosDao.findAll2(medestudios.getMedicos_Perfil_Id()));
		model.addAttribute("perfiless", medperfilesDao.findAll2(medperfiles.getMedicos_Perfil_Id()));
		model.addAttribute("paquetess", medpaquetesDao.findAll2(medpaquetes.getMedicos_Perfil_Id()));

	   model.addAttribute("paquetes",paquetesDao.findAll());
	   model.addAttribute("perfiles",perfilesDao.findAll());
	   model.addAttribute("estudios",estudiosDao.findAll());

		return "perfiles";
	}
	
	
	
}
