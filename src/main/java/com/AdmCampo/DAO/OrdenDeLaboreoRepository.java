package com.AdmCampo.DAO;

import com.AdmCampo.modelo.OrdenDeLaboreo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenDeLaboreoRepository extends CrudRepository<OrdenDeLaboreo, Long> {
    
}
