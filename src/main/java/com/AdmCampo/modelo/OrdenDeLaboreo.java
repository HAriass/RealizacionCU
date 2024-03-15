
package com.AdmCampo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class OrdenDeLaboreo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne()
    private MomentoLaboreo momentoLaboreo;//aceveriguar esta parte q onda
    private String orden; //averiguar que es y que tipo de datos se utilizaria
    
    @ManyToOne()
    private TipoLaboreo tipoLaboreo;

    public OrdenDeLaboreo() {
    }
    
}
