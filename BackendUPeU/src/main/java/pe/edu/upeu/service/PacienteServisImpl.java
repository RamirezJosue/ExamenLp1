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
import pe.edu.upeu.dao.PacienteDao;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author Alumnos
 */
@Service("pacienteServis")
@Transactional
public class PacienteServisImpl implements PacienteServis{
 
    @Autowired
    public PacienteDao dao;
 
    @Override
    public List<Paciente> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Paciente buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Paciente paciente) {dao.guardarEntidad(paciente); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Paciente paciente) {dao.modificarEntidadId(paciente);}   
    @Override
    public List<Paciente> listarPorNombre(String nombre) {return dao.listarPorNombre(nombre);}   
 
 
 
}
