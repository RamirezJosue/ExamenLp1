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
import pe.edu.upeu.model.Diagnostico;
import pe.edu.upeu.service.DiagnosticoServis;

/**
 *
 * @author David
 */
@RestController
@RequestMapping("/diagnostico")
public class DiagnosticoController {
 
   @Autowired
    public DiagnosticoServis service;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Diagnostico> listarDiagnostico(){ return service.listarEntidad(); }


    @RequestMapping(value = "/edit", method = {RequestMethod.GET, RequestMethod.POST})
    public void modificarEntidadId(@RequestBody Diagnostico diagnostico) {
        service.modificarEntidadId(diagnostico);
    }

    @RequestMapping(value = "remove/{id}", method = RequestMethod.DELETE)
    public void eliminarEntidadId(@PathVariable int id) {
        System.out.println("Holas "+id);
        service.eliminarEntidadId(id);
    }

    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Diagnostico buscarEntidadId(@PathVariable int id) {
        return service.buscarEntidadId(id);
    }

    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public void guardarEntidad(@RequestBody Diagnostico entidad) {
        service.guardarEntidad(entidad);
    }    
}
