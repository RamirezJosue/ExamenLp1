/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.DetalleTratamiento;

/**
 *
 * @author Alumnos
 */
@Repository("detalle_tratamientoDao")
public class DetalleTratamientoDaoImpl extends SysDataAccess<Integer, DetalleTratamiento> implements DetalleTratamientoDao{
    
    @SuppressWarnings("unchecked")
    public List<DetalleTratamiento> listarEntidad(){ return getListAll(); }
    public DetalleTratamiento guardarEntidad(DetalleTratamiento entidad){return save(entidad);}
    public void modificarEntidad(DetalleTratamiento entidad){update(entidad);}
    public void eliminarEntidad(int id){delete(id);}
    public DetalleTratamiento buscarEntidadId(int id){return getById(id);}
    
    
}
