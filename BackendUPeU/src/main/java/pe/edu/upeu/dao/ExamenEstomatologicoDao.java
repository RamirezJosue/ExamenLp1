/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.ExamenEstomatologico;

/**
 *
 * @author Alumnos
 */
public interface ExamenEstomatologicoDao {
    public List<ExamenEstomatologico> listarEntidad();
    public ExamenEstomatologico guardarEntidad(ExamenEstomatologico entidad);
    public void modificarEntidad(ExamenEstomatologico entidad);
    public void eliminarEntidad(Integer id);
    public ExamenEstomatologico buscarEntidadId(int id);
}
