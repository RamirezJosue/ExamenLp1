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
import pe.edu.upeu.dao.DientesDao;
import pe.edu.upeu.model.Dientes;

/**
 *
 * @author Alumnos
 */
@Service("dientesServis")
@Transactional
public class DientesServisImpl implements DientesServis{
 
    @Autowired
    public DientesDao dao;
 
    @Override
    public List<Dientes> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Dientes buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Dientes diente) {dao.guardarEntidad(diente); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Dientes diente) {dao.modificarEntidadId(diente);}   
    @Override
    public List<Dientes> listarPorNombre(String nombre) {return dao.listarPorNombre(nombre);}   
 
 
 
}
