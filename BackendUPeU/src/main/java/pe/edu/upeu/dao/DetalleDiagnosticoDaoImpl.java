/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import pe.edu.upeu.model.DetalleDiagnostico;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.DetalleDiagnostico;

/**
 *
 * @author Alumnos
 */
@Repository("detalleDiagnosticoDao")
public class DetalleDiagnosticoDaoImpl extends SysDataAccess<Integer, DetalleDiagnostico> implements DetalleDiagnosticoDao{
    @SuppressWarnings("unchecked")
    public List<DetalleDiagnostico> listarEntidad(){ return getListAll();}
    public DetalleDiagnostico buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(DetalleDiagnostico entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(DetalleDiagnostico entidad) {update(entidad);}         
    public List<DetalleDiagnostico> listarPorNombre(String dato){
    return (List<DetalleDiagnostico>)sessionFactory.getCurrentSession()
            .createQuery("select a from DetalleDiagnostico a where a.idPersona.dni like ? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}
