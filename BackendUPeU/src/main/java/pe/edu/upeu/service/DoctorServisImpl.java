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
import pe.edu.upeu.dao.DoctorDao;
import pe.edu.upeu.model.Doctor;

/**
 *
 * @author David
 */
@Service("doctorServis")
@Transactional
public class DoctorServisImpl implements DoctorServis{
    @Autowired
    public DoctorDao dao;
 
    @Override
    public List<Doctor> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Doctor buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Doctor entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Doctor entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<Doctor> listarEntidadNombre(String dato){return dao.listarPorNombre(dato);}    
}
