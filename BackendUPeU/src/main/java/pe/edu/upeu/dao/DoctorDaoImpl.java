/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Doctor;

/**
 *
 * @author David
 */
@Repository("doctorDao")
public class DoctorDaoImpl extends SysDataAccess<Integer, Doctor> implements DoctorDao{
    @SuppressWarnings("unchecked")
    public List<Doctor> listarEntidad(){ return getListAll();}
    public Doctor buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Doctor entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Doctor entidad) {update(entidad);}         
    public List<Doctor> listarPorNombre(String dato){
    return (List<Doctor>)sessionFactory.getCurrentSession()
            .createQuery("select a from Doctor a where a.idPersona.dni like ? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}
