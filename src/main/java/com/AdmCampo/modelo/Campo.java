
package com.AdmCampo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Campo implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean habilitado;
    
    @OneToMany(fetch = FetchType.EAGER)
    private List<Lote> lotes;
    
    private String nombre;

    public Campo() {
    }

    public boolean estaHabilitado() {
        return this.habilitado;
    }
    
    
}
