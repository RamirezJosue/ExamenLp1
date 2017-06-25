/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Persona;

/**
 *
 * @author David
 */
public interface PersonaDao {
    public List<Persona> listarEntidad();
    public Persona buscarEntidadId(int id);
    public void guardarEntidad(Persona diente);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Persona diente);    
}
