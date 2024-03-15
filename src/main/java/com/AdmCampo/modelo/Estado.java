
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
    private boolean estadoFinal;

    public Estado() {
    }

    public boolean esFinal() {
        if(this.getNombre()=="cancelado" || this.getNombre()=="enPostSiembra" ){
            return true;
        }else return false;
    }
    
}
