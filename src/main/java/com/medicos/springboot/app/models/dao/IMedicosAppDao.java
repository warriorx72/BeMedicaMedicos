package com.medicos.springboot.app.models.dao;

import java.util.List;
import com.medicos.springboot.app.models.entity.MedicosApp;

public interface IMedicosAppDao {
	
	public List<MedicosApp> findAll();
	
	public MedicosApp findOne(Long MedicosId);
	
	public void save(MedicosApp medicosApp);

}
