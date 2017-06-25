/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.DetalleTratamiento;

/**
 *
 * @author Alumnos
 */
public interface DetalleTratamientoDao{
    public List<DetalleTratamiento> listarEntidad();
    public DetalleTratamiento guardarEntidad(DetalleTratamiento entidad);
    public void modificarEntidad(DetalleTratamiento entidad);
    public void eliminarEntidad(int id);
    public DetalleTratamiento buscarEntidadId(int id);
}
