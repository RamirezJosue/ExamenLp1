/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Anamesis;

/**
 *
 * @author Alumnos
 */
@Repository("anamesisDao")
public class AnamesisDaoImpl extends SysDataAccess<Integer, Anamesis> implements AnamesisDao{
    
    @SuppressWarnings("unchecked")
    public List<Anamesis> listarEntidad(){return getListAll();}
    public Anamesis guardarEntidad(Anamesis entidad){ return save(entidad);}
    public void modificarEntidad(Anamesis entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public Anamesis buscarEntidadId(int id){return getById(id);}
        
}
