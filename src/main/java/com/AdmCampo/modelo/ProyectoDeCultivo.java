
package com.AdmCampo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProyectoDeCultivo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Cultivo cultivo;
    @ManyToOne
    private Estado estado;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    @OneToMany()
    private List<Laboreo> laboreo;
    private String observaciones;

    public ProyectoDeCultivo() {
    }

    public boolean estaVigente() {
        return !estado.esFinal();
    }
    
}
