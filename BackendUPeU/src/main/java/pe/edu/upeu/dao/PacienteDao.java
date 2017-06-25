/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Paciente;

/**
 *
 * @author Alumnos
 */
public interface PacienteDao {
    public List<Paciente> listarEntidad();
    public Paciente buscarEntidadId(int id);
    public void guardarEntidad(Paciente paciente);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Paciente paciente);
    public List<Paciente> listarPorNombre(String nombre);
}
