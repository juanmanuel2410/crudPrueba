package com.cornejo.crudspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cornejo.crudspring.interfaceService.IPersonaService;
import com.cornejo.crudspring.interfaces.IPersona;
import com.cornejo.crudspring.modelo.Persona;
@Service
public class PersonaService implements IPersonaService{
    @Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res=0;
		Persona persona=data.save(p);
		if(persona.equals(null)) {
			res=1;
		}
		return 0;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
		
	}

}
