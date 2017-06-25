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
import pe.edu.upeu.dao.DetalleTratamientoDaoImpl;
import pe.edu.upeu.model.DetalleTratamiento;

/**
 *
 * @author Alumnos
 */
@Service("detalleTratamientoServis")
@Transactional
public class DetalleTratamientoServisImpl implements DetalleTratamientoServis{
 
 @Autowired
 public DetalleTratamientoDaoImpl dao;
 
 @Override
 public List<DetalleTratamiento> listarEntidad(){return dao.listarEntidad();}
    @Override
    public DetalleTratamiento guardarEntidad(DetalleTratamiento entidad){return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(DetalleTratamiento entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}
    @Override
    public DetalleTratamiento buscarEntidadId(int id){return dao.buscarEntidadId(id);}
 
 
 
}
