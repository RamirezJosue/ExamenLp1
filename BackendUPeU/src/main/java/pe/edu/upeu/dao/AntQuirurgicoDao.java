/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import pe.edu.upeu.model.AntQuirurgico;

/**
 *
 * @author jeanpaul
 */
public interface AntQuirurgicoDao {       
    public List<AntQuirurgico> listarEntidad();
    public AntQuirurgico guardarEntidad(AntQuirurgico entidad);
    public void modificarEntidad(AntQuirurgico entidad);
    public void eliminarEntidad(Integer id);
    public AntQuirurgico buscarEntidadId(int id);

}
