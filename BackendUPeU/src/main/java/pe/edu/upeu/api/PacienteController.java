/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.api;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.model.Paciente;
import pe.edu.upeu.service.PacienteServis;



/**
 *
 * @author Alumnos
 */
//@CrossOrigin(origins = "http://localhost:8383")
@RestController
@RequestMapping("/paciente")
public class PacienteController {
    
    @Autowired
    public PacienteServis service;

    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Paciente> listarDientes(){ return service.listarEntidad(); }


    @RequestMapping(value = "/edit", method = {RequestMethod.GET, RequestMethod.POST})
    public void modificarEntidadId(@RequestBody Paciente paciente) {
        service.modificarEntidadId(paciente);
    }

    
    @RequestMapping(value = "remove/{id}", method = {RequestMethod.DELETE, RequestMethod.GET})
    public void eliminarEntidadId(@PathVariable String id) {
        System.out.println("Holas "+id);
        int dato=Integer.parseInt(id);
        service.eliminarEntidadId(dato);
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Paciente buscarEntidadId(@PathVariable String id) {
        System.out.println("Holas  DMP------> "+id);        
        int dato=Integer.parseInt(id);
        return service.buscarEntidadId(dato);
    }
    @RequestMapping(value = "/findn/{nombre}", method = RequestMethod.GET)
    public List<Paciente> buscarEntidadNombre(@PathVariable String nombre) {
        return service.listarPorNombre(nombre);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public void guardarEntidad(@RequestBody Paciente paciente) {
        
        service.guardarEntidad(paciente);
    }
    
}
