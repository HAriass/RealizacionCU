
package com.AdmCampo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class Lote implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int numero;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<ProyectoDeCultivo> proyectosCultivo;
    
    private int tamanioHas;
    @ManyToOne
    private TipoSuelo tipoSuelo;

    public Lote() {
    }

    public boolean tieneProyectoCultivoVigente() {
        return proyectosCultivo.stream().anyMatch(ProyectoDeCultivo::estaVigente);
    }


    public LocalDate mostrarFechaInicioProyectoVigente(Long id) {
    for(ProyectoDeCultivo proyecto : proyectosCultivo){
        if(proyecto.getId().equals(id)){
            return proyecto.getFechaInicio();
        }
    }
        // Si no se encuentra el proyecto con el id especificado, puedes devolver null o lanzar una excepción según tu lógica de negocio.
        return null;
    }
    
}
