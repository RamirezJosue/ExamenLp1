/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Dientes;

/**
 *
 * @author Alumnos
 */
@Repository("dientesDao")
public class DientesDaoImpl extends SysDataAccess<Integer, Dientes> implements DientesDao{
    
    @SuppressWarnings("unchecked")
    public List<Dientes> listarEntidad(){ return getListAll();}
    public Dientes buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Dientes diente) {savev(diente); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Dientes diente) {update(diente);}
    
    public List<Dientes> listarPorNombre(String nombre){
    return (List<Dientes>)sessionFactory.getCurrentSession()
            .createQuery("select a from Dientes a where a.nombre like ? ")        
            .setString(0, "%"+nombre+"%")
            .list();
    }    
    
    
}
