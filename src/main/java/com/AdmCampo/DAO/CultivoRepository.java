package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Cultivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultivoRepository extends CrudRepository<Cultivo, Long> {
    
}
