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
import pe.edu.upeu.dao.AntQuirurgicoDao;
import pe.edu.upeu.model.AntQuirurgico;

/**
 *
 * @author jeanpaul
 */
@Service("AntQuirurgicoServis")
@Transactional
public class AntQuirurgicoservisImpl implements AntQuirurgicoServis{
    
    @Autowired
    public AntQuirurgicoDao  dao;

    @Override
    public List<AntQuirurgico> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public AntQuirurgico guardarEntidad(AntQuirurgico entidad){ return  dao.guardarEntidad(entidad);}
    @Override
    public void modificarEntidad(AntQuirurgico entidad){dao.modificarEntidad(entidad);}
    @Override
    public void eliminarEntidad(Integer id){dao.eliminarEntidad(id);}
    @Override
    public AntQuirurgico buscarEntidadId(int id){ return dao.buscarEntidadId(id);}
}
