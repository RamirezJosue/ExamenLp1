/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.Doctor;

/**
 *
 * @author David
 */
public interface DoctorDao {
    public List<Doctor> listarEntidad();
    public Doctor buscarEntidadId(int id);
    public void guardarEntidad(Doctor entidad);
    public void eliminarEntidadId(int id);
    public void modificarEntidadId(Doctor entidad); 
    public List<Doctor> listarPorNombre(String dato);
}
