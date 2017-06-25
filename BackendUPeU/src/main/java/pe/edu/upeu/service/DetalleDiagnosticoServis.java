/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.DetalleDiagnostico;
        
/**
 *
 * @author Alumnos
 */
public interface DetalleDiagnosticoServis {
    public List<DetalleDiagnostico> listarEntidad();
    public DetalleDiagnostico buscarEntidadId(int id);
    public void guardarEntidad(DetalleDiagnostico entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(DetalleDiagnostico entidad);  
    public List<DetalleDiagnostico> listarPorNombre(String dato);
    
    
}
