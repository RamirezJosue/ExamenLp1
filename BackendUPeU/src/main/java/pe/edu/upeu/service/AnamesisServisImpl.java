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
import pe.edu.upeu.dao.AnamesisDao;
import pe.edu.upeu.model.Anamesis;

/**
 *
 * @author Alumnos
 */
@Service("anamesisServis")
@Transactional
public class AnamesisServisImpl implements AnamesisServis{
 
    @Autowired
    public AnamesisDao dao;

    @Override
    public List<Anamesis> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public Anamesis guardarEntidad(Anamesis entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(Anamesis entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public Anamesis buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
