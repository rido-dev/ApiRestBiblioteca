package com.apirest.biblioteca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ridouan Abdellah Tieb
 */
@Controller
public class LibrosController {
    
    @Autowired
    private LibrosRepository repo;
    
    @RequestMapping("/bibliohtml")
    public String lista(Model model) {
        model.addAttribute("bibliohtml", repo.findAll());
        return "api_html";
    }
    
    @RequestMapping("/bibliohtml/detalle")
    public String id(Model model) {
        model.addAttribute("detalle", repo.findAll());
        return "api_html2";
    }
    
    @RequestMapping("/bibliohtml/categoria")
    public String categoria(Model model) {
        model.addAttribute("categoria", repo.findAll());
        return "api_html3";
    }
}
