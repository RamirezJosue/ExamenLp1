/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Diagnostico;

/**
 *
 * @author David
 */
@Repository("diagnosticoDao")
public class DiagnosticoDaoImpl extends SysDataAccess<Integer, Diagnostico> implements DiagnosticoDao{
    @SuppressWarnings("unchecked")
    public List<Diagnostico> listarEntidad(){ return getListAll();}
    public Diagnostico buscarEntidadId(int id) {return getByKey(id);}
    public void guardarEntidad(Diagnostico entidad) {savev(entidad); }  
    public void eliminarEntidadId(int id) {delete(id);}    
    public void modificarEntidadId(Diagnostico entidad) {update(entidad);}         
    public List<Diagnostico> listarPorNombre(String dato){
    return (List<Diagnostico>)sessionFactory.getCurrentSession()
            .createQuery("select a from Diagnostico a where a.idDiagnostico.dni fechaAlta ? ")        
            .setString(0, "%"+dato+"%")
            .list();
    }     
}
