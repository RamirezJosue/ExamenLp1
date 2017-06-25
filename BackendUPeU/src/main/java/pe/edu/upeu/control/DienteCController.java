package pe.edu.upeu.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.edu.upeu.model.Dientes;
import pe.edu.upeu.service.DientesServis;

/**
 *
 * @author David
 */
@Controller
@RequestMapping("/")
public class DienteCController {
	@Autowired
	DientesServis service;	
	@Autowired
	MessageSource messageSource;    
    
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public ModelAndView listDientes(ModelMap model) {
            List<Dientes> lista=service.listarEntidad();
            Map<String, Object> modelo=new HashMap<String, Object> ();
            modelo.put("ListaDiente", lista);
            modelo.put("saludo", "Hola amigos");            
            System.out.println("Holassssssssss");
            return new ModelAndView("periodo/mainDiente", modelo);
	}

        @RequestMapping(value = "eliminarDient", method = RequestMethod.GET)
        public  ModelAndView eliminarDiente(HttpServletRequest r) {
            int idEntidad=Integer.parseInt(r.getParameter("id"));
            service.eliminarEntidadId(idEntidad);
            System.out.println("si llego al metodo");
            return new ModelAndView(new RedirectView("list"));
        }


        @RequestMapping(value = "formDiente", method = RequestMethod.GET)
        public ModelAndView irFormulario(@ModelAttribute("modeloDiente") Dientes entidad,BindingResult result ){
            Map<String, Object> modelo=new HashMap<String, Object> ();
            modelo.put("listaTemporada", "Holasssssssssss");
            modelo.put("listaTemporadaX", service.listarEntidad());
            modelo.put("listaTemporada2", "");
            modelo.put("listaTemporada3", "");            
            return new ModelAndView("periodo/formDiente",modelo);
        }


        @RequestMapping(value = "guardarDiente", method = RequestMethod.POST)
        public ModelAndView guardarDienteXX(@ModelAttribute("modeloDiente") Dientes entidad,
                                              BindingResult result ){            
                service.guardarEntidad(entidad);
            return new ModelAndView(new RedirectView("list"));
        }

        @RequestMapping(value = "modificarDiente", method = RequestMethod.GET)
        public ModelAndView modificarDiente(HttpServletRequest r ){
           int id=Integer.parseInt(r.getParameter("id"));
               Dientes entidad=null;
               entidad=service.buscarEntidadId(id);
            return new ModelAndView("periodo/formUDiente","ModeloDiente",entidad);
        }

        @RequestMapping(value = "modificarDienteX", method = RequestMethod.GET)
        public String modificarDienteX(HttpServletRequest r, Model model ){
           int id=Integer.parseInt(r.getParameter("id"));
               Dientes periodo=null;
               periodo=service.buscarEntidadId(id);
               model.addAttribute("ModeloDiente", periodo);             
            return "periodo/formUDiente";
        }

        @RequestMapping(value = "actualizarDiente", method = RequestMethod.POST)
        public ModelAndView gactualizarDienteXX(@ModelAttribute("ModeloDiente") Dientes entidad,
                                              BindingResult result ){
                service.modificarEntidadId(entidad);
            return new ModelAndView(new RedirectView("list"));
        }


        @RequestMapping(value = "buscarDientex", method = RequestMethod.POST)
        public  ModelAndView buscarDiente(HttpServletRequest r) {
            String dato=r.getParameter("dato")==null ? "":r.getParameter("dato");
            List<Dientes> lista=service.listarPorNombre(dato);            
            Map<String, Object> modelo=new HashMap<String, Object> ();
            modelo.put("ListaDiente", lista);
           return new ModelAndView("periodo/mainDiente",modelo);
        }
    
}
