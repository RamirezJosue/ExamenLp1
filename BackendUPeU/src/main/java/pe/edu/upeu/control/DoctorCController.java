/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.model.Doctor;
import pe.edu.upeu.service.DoctorServis;

/**
 *
 * @author Alumnos
 */
@Controller
@RequestMapping("/doctor")
public class DoctorCController {
    @Autowired
    DoctorServis service;	
    @Autowired
    MessageSource messageSource;     

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView listDoctor(ModelMap model) {
        List<Doctor> lista=service.listarEntidad();
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaDoctor", lista);
        modelo.put("mensaje", "Reporte de Doctores");                    
        return new ModelAndView("doctor/mainDoctor", modelo);
    }        
    

    @RequestMapping(value = "buscarDoctor", method = RequestMethod.POST)
    public  ModelAndView buscarDoctor(HttpServletRequest r) {
        String dato=r.getParameter("dato")==null ? "":r.getParameter("dato");
        List<Doctor> lista=service.listarEntidadNombre(dato);            
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaDoctor", lista);
       return new ModelAndView("doctor/mainDoctor",modelo);
    } 
    
    @RequestMapping(value = "eliminarDoctor", method = RequestMethod.GET)
    public  ModelAndView eliminarDoctor(HttpServletRequest r) {
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("doctor/list"));
    }    
}
