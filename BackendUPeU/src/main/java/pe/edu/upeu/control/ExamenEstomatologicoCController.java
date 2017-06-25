/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.upeu.service.ExamenEstomatologicoServis;
/**
 *
 * @author Alumnos
 */
@Controller
@RequestMapping("/exEstomat")
public class ExamenEstomatologicoCController {
      
    @Autowired
    public ExamenEstomatologicoServis service;

    @Autowired
    MessageSource messageSource;

    @RequestMapping(value = {"/", "/listar"}, method = RequestMethod.GET)
    public String paginaInicio(ModelMap model) {
        model.addAttribute("attribute", "value");
        return "index";
    }
}
