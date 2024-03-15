package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Laboreo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboreoRepository extends CrudRepository<Laboreo, Long> {
    
}
