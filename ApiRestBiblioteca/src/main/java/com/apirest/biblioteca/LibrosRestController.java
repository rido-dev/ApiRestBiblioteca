package com.apirest.biblioteca;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ridouan Abdellah Tieb
 */
@RestController
@RequestMapping("/biblioteca")
public class LibrosRestController {
    
    @Autowired
    private LibrosRepository repo;
    
    /*
    Método AutoImplementado por el Framework.
    */
    @GetMapping("/")
    public List<models.Libros> list() {
        return repo.findAll();
    } 
    
    /*
    Método JPA, personalización de consultas. 
    PRIMER APARTADO DEL EJERCICIO.
    */
    @GetMapping("/libros")
    public List<Object[]> getLibros() {
        return repo.primera();
    }
    
    /*
    Método AutoImplementado por el Framework.
    SEGUNDO APARTADO DEL EJERCICIO.
    */
    @GetMapping("/di/{id}")
    public Optional<models.Libros> get(@PathVariable Long id) {
        return repo.findById(id);
    } 
    
    /*
    Método JPA, personalización de consultas. 
    SEGUNDO APARTADO DEL EJERCICIO.
    */
    @GetMapping("/id/{id}")
    public List<Object[]> getInfo(@PathVariable Long id) {
        return repo.segunda(id);
    }
    
    /*
    Método AutoImplementado por el Framework.
    TERCER APARTADO DEL EJERCICIO.
    */
    @GetMapping("/categoria/{categoria}")
    public List<models.Libros> getCateg(@PathVariable String categoria) {
        return repo.findByCategoria(categoria);
    }
    
    /*
    Método JPA, personalización de consultas.
    TERCER APARTADO DEL EJERCICIO.
    */
    @GetMapping("/catego/{catego}")
    public List<Object[]> getCatego(@PathVariable String catego) {
        return repo.tercera(catego);
    }
    
    /*
    Método AutoImplementado por el Framework.
    CUARTO APARTADO DEL EJERCICIO.
    */
    @GetMapping("/autor/{autor}")
    public List<models.Libros> getAutor(@PathVariable String autor) {
        return repo.findByAutor(autor);
    }
    
    /*
    Método JPA, personalización de consultas. 
    CUARTO APARTADO DEL EJERCICIO.
    */
    @GetMapping("/auto/{auto}")
    public List<Object[]> getAuto(@PathVariable String auto) {
        return repo.cuarta(auto);
    }
    
    /*
    Método JPA, personalización de consultas. 
    APARTADO EXTRA
    */
    @GetMapping("/titulo/{titulo}")
    public List<Object[]> getTitu(@PathVariable String titulo) {
        return repo.quinta(titulo);
    }
    
    /*
    Método de captura de errores.
    */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Error message")
    public void handleError() {
    }
    
}
