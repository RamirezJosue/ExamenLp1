/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Dientes;

/**
 *
 * @author Alumnos
 */
public interface DientesDao {
    public List<Dientes> listarEntidad();
    public Dientes buscarEntidadId(int id);
    public void guardarEntidad(Dientes diente);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Dientes diente);
    public List<Dientes> listarPorNombre(String nombre);
}
