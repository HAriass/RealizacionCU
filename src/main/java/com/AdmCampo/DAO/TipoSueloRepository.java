package com.AdmCampo.DAO;

import com.AdmCampo.modelo.TipoSuelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSueloRepository extends CrudRepository<TipoSuelo, Long> {
    
}
