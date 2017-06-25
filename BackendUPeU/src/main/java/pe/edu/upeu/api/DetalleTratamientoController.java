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
import pe.edu.upeu.model.DetalleTratamiento;
import pe.edu.upeu.service.DetalleTratamientoServis;



/**
 *
 * @author Alumnos
 */
@RestController
@RequestMapping("/detalle_tratamiento")
public class DetalleTratamientoController {
    
@Autowired
public DetalleTratamientoServis service;

@Autowired
MessageSource messageSource;

@RequestMapping(value = "/all", method = RequestMethod.GET)
public List<DetalleTratamiento> listarEntidad(){return service.listarEntidad();}
 
@RequestMapping(value = "/remove/{id}", method = {RequestMethod.DELETE,RequestMethod.GET})
public void eliminarEntidad(@PathVariable int id){service.eliminarEntidad(id);} 

@RequestMapping(value = "/edit", method = RequestMethod.POST)
public void modificarEntidad(@RequestBody DetalleTratamiento entidad){service.modificarEntidad(entidad);}

@RequestMapping(value = "/save", method = {RequestMethod.POST, RequestMethod.GET})
public DetalleTratamiento guardarEntidad(@RequestBody DetalleTratamiento entidad){return service.guardarEntidad(entidad);}

@RequestMapping(value = "find/{id}", method =  RequestMethod.GET)
public DetalleTratamiento buscarEntidad(@PathVariable int id){return service.buscarEntidadId(id);}
}
