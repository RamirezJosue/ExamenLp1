/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.ExamenEstomatologico;

/**
 *
 * @author Alumnos
 */

@Repository("ExamenEstomatologico")
public class ExamenEstomatologicoImpl extends SysDataAccess<Integer, ExamenEstomatologico> implements ExamenEstomatologicoDao{
    
    @SuppressWarnings("unchecked")
    public List<ExamenEstomatologico> listarEntidad(){return getListAll();}
    public ExamenEstomatologico guardarEntidad(ExamenEstomatologico entidad){ return save(entidad);}
    public void modificarEntidad(ExamenEstomatologico entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public ExamenEstomatologico buscarEntidadId(int id){return getById(id);}
        
}
