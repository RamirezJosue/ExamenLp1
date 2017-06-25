/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author Alumnos
 */
@Repository("pacienteDao")
public class PacienteDaoImpl extends SysDataAccess<Integer, Paciente> implements PacienteDao{
    
    @SuppressWarnings("unchecked")
    public List<Paciente> listarEntidad(){ return getListAll();}
    public Paciente buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Paciente paciente) {savev(paciente); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Paciente paciente) {update(paciente);}
    
    public List<Paciente> listarPorNombre(String nombre){
    return (List<Paciente>)sessionFactory.getCurrentSession()
            .createQuery("select a from Dientes a where a.nombre like ? ")        
            .setString(0, "%"+nombre+"%")
            .list();
    }    
    
    
}
