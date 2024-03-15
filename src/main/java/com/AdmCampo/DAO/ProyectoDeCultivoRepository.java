package com.AdmCampo.DAO;

import com.AdmCampo.modelo.ProyectoDeCultivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoDeCultivoRepository extends CrudRepository<ProyectoDeCultivo, Long> {
    
}
