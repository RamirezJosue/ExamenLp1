/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Diagnostico;

/**
 *
 * @author Alumnos
 */
public interface DiagnosticoServis {
    public List<Diagnostico> listarEntidad();
    public Diagnostico buscarEntidadId(int id);
    public void guardarEntidad(Diagnostico diagnostico);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Diagnostico entidad);    
    public List<Diagnostico> listarPorNombre(String nombre);
    
}


