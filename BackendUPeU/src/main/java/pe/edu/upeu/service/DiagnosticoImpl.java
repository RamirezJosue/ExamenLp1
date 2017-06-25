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
import pe.edu.upeu.dao.DiagnosticoDao;
import pe.edu.upeu.model.Diagnostico;

/**
 *
 * @author David
 */
@Service("diagnosticoServis")
@Transactional
public class DiagnosticoImpl implements DiagnosticoServis{
    @Autowired
    public DiagnosticoDao dao;
 
    @Override
    public List<Diagnostico> listarEntidad(){return dao.listarEntidad();}
    @Override
    public Diagnostico buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Diagnostico entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(Diagnostico entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<Diagnostico> listarPorNombre(String nombre){return dao.listarPorNombre(nombre);}    
}
