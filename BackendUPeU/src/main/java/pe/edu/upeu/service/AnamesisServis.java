/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Anamesis;

/**
 *
 * @author Alumnos
 */
public interface AnamesisServis {
    public List<Anamesis> listarEntidad();    
    public Anamesis guardarEntidad(Anamesis entidad);
    public void modificarEntidad(Anamesis entidad);
    public void eliminarEntidad(Integer id);
    public Anamesis buscarEntidadId(int id);    
}
