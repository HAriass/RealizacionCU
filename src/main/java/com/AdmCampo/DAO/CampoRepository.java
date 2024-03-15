package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Campo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampoRepository extends CrudRepository<Campo, Long> {
    
    
}
