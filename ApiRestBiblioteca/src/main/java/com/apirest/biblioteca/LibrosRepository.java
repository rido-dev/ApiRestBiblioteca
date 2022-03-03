package com.apirest.biblioteca;

import java.util.List;
import models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author Ridouan Abdellah Tieb
 */
public interface LibrosRepository extends JpaRepository<Libros, Long> {
    
   /*
    Listar id y titulo de todos los libros.
    */ 
   @Query(value = "SELECT id, titulo FROM Libros")
   List<Object[]> primera();
   
   /*
   Listar al detalle utilizando un id.
   */
   @Query(value = "SELECT titulo, autor, categoria, isbn, edicion FROM Libros WHERE id = ?1")
   List<Object[]> segunda(Long id);
   
   /*
   Listar libros utilizando una categoria.
   */
   @Query(value = "SELECT titulo, autor FROM Libros WHERE categoria = ?1")
   List<Object[]> tercera(String categoria);
   
   List<models.Libros> findByCategoria(String categoria);
   
   /*
   Listar libros utilizando un autor.
   */
   @Query(value = "SELECT titulo, categoria FROM Libros WHERE autor = ?1")
   List<Object[]> cuarta(String autor);
   
   List<models.Libros> findByAutor(String autor);
   
   /*
   Listar el detalle utilizando un titulo
   */
   @Query(value = "SELECT autor, categoria, isbn, edicion FROM Libros WHERE titulo = ?1")
   List<Object[]> quinta(String titulo);
   
}
