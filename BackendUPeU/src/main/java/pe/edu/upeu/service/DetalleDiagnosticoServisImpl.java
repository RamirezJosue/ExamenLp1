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
import pe.edu.upeu.dao.DetalleDiagnosticoDao;
import pe.edu.upeu.model.DetalleDiagnostico;

/**
 *
 * @author Alumnos
 */

@Service("detalleDiagnosticoServis")
@Transactional
public class DetalleDiagnosticoServisImpl implements DetalleDiagnosticoServis{
    @Autowired
    public DetalleDiagnosticoDao dao;
 
    @Override
    public List<DetalleDiagnostico> listarEntidad(){return dao.listarEntidad();}
    @Override
    public DetalleDiagnostico buscarEntidadId(int id) {return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(DetalleDiagnostico entidad) {dao.guardarEntidad(entidad); }  
    @Override
    public void eliminarEntidadId(int id) {dao.eliminarEntidadId(id);}    
    @Override
    public void modificarEntidadId(DetalleDiagnostico entidad) {dao.modificarEntidadId(entidad);}       
    @Override
    public List<DetalleDiagnostico> listarPorNombre(String dato){return dao.listarPorNombre(dato);}    
}
