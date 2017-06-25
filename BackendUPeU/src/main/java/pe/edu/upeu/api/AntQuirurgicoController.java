/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.model.AntQuirurgico;
import pe.edu.upeu.service.AntQuirurgicoServis;


/**
 *
 * @author jeanpaul
 */
@RestController
@RequestMapping("/quirurgico")
public class AntQuirurgicoController {
    @Autowired
public AntQuirurgicoServis service;

@Autowired
MessageSource messageSource;

@RequestMapping(value = "/all", method = RequestMethod.GET)
public List<AntQuirurgico> listarEntidad(){ return service.listarEntidad();}
 
@RequestMapping(value = "/remove/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
public void eliminarEntidad(@PathVariable Integer id){
    System.out.println("Holas:" + id);
    service.eliminarEntidad(id);}

@RequestMapping(value = "/edit", method = RequestMethod.POST)
public void modificarEntidad(@RequestBody AntQuirurgico entidad){service.modificarEntidad(entidad);}

@RequestMapping(value = "/add", method = {RequestMethod.POST, RequestMethod.GET})
public AntQuirurgico guardarEntidad(@RequestBody AntQuirurgico entidad){return service.guardarEntidad(entidad);}

@RequestMapping(value = "find/{id}", method = RequestMethod.GET)
public AntQuirurgico buscarEntidadId(@PathVariable int id){return service.buscarEntidadId(id);}
}
