/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upeu.dao.ExamenEstomatologicoDao;
import pe.edu.upeu.model.ExamenEstomatologico;
/**
 *
 * @author Alumnos
 */
@Service("ExamenEstomatologicoServis")
@Transactional
public class ExamenEstomatologicoImpl implements ExamenEstomatologicoServis{
    @Autowired
    public ExamenEstomatologicoDao dao;

    @Override
    public List<ExamenEstomatologico> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public ExamenEstomatologico guardarEntidad(ExamenEstomatologico entidad){ return dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(ExamenEstomatologico entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public ExamenEstomatologico buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
 
}
