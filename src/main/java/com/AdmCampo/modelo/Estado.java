
package com.AdmCampo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Estado implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;

    public Estado() {
    }

   public boolean esFinal() {
        System.out.println("nombre estado = " + this.getNombre());
        return "cancelado".equals(this.getNombre()) || "enPostSiembra".equals(this.getNombre());
    }

    
}
