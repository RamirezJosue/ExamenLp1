/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.PersonaDao;
import pe.edu.upeu.model.Persona;

/**
 *
 * @author David
 */
@Service("personaServis")
@Transactional
public class PersonaServisImpl implements PersonaServis{
    
    @Autowired
    public PersonaDao dao;
 
    @Override
    public List<Persona> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Persona buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Persona entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Persona entidad) {dao.modificarEntidadId(entidad);}      
}
