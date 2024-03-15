package com.AdmCampo.DAO;

import com.AdmCampo.modelo.MomentoLaboreo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MomentoLaboreoRepository extends CrudRepository<MomentoLaboreo, Long> {
    
}
