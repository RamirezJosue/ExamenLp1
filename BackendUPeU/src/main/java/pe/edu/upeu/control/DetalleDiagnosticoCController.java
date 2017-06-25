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
import pe.edu.upeu.model.DetalleDiagnostico;
import pe.edu.upeu.service.DetalleDiagnosticoServis;

/**
 *
 * @author Alumnos
 */
@Controller
@RequestMapping("/detalle_diagnostico")
public class DetalleDiagnosticoCController {
    @Autowired
    DetalleDiagnosticoServis service;	
    @Autowired
    MessageSource messageSource;     

    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public ModelAndView listDetalleDiagnostico(ModelMap model) {
        List<DetalleDiagnostico> lista=service.listarEntidad();
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaDetalleDiagnostico", lista);
        modelo.put("mensaje", "Reporte de DetalleDiagnostico");                    
        return new ModelAndView("detalle_diagnostico/mainDetalleDiagnostico", modelo);
    }        
    

    @RequestMapping(value = "buscarDetalleDiagnostico", method = RequestMethod.POST)
    public  ModelAndView buscarDetalleDiagnostico(HttpServletRequest r) {
        String dato=r.getParameter("dato")==null ? "":r.getParameter("dato");
        List<DetalleDiagnostico> lista=service.listarPorNombre(dato);            
        Map<String, Object> modelo=new HashMap<String, Object> ();
        modelo.put("ListaDetalleDiagnostico", lista);
       return new ModelAndView("detalle_diagnostico/mainDetalleDiagnostico",modelo);
    } 
    
    @RequestMapping(value = "eliminarDetalleDiagnostico", method = RequestMethod.GET)
    public  ModelAndView eliminarDetalleDiagnostico(HttpServletRequest r) {
        int idEntidad=Integer.parseInt(r.getParameter("id"));
        service.eliminarEntidadId(idEntidad);
        System.out.println("si llego al metodo");
        return new ModelAndView(new RedirectView("detalle_diagnostico/list"));
    }    
}
