package com.cornejo.crudspring.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cornejo.crudspring.modelo.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
}
