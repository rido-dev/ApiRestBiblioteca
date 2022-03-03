package models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author Ridouan Abdellah Tieb
 */
@Entity
@Table(name="libros")
@Data
public class Libros implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String titulo;
    private String autor;
    private String categoria;
    private String isbn;
    private String edicion;
    
    
}
