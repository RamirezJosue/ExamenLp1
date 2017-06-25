/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.AntQuirurgico;

/**
 *
 * @author jeanpaul
 */
@Repository("ant_quirurgicoDao")
public class AntQuirurgicoDaoImpl extends SysDataAccess<Integer, AntQuirurgico> implements AntQuirurgicoDao{
    
    @SuppressWarnings("unchecked")
    public List<AntQuirurgico> listarEntidad(){return getListAll();}
    public AntQuirurgico guardarEntidad(AntQuirurgico entidad){ return save(entidad);}
    public void modificarEntidad(AntQuirurgico entidad){update(entidad);}
    public void eliminarEntidad(Integer id){delete(id);}
    public AntQuirurgico buscarEntidadId(int id){return getById(id);}
}
