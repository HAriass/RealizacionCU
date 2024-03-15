package com.AdmCampo.DAO;

import com.AdmCampo.modelo.TipoLaboreo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLaboreoRepository extends CrudRepository<TipoLaboreo, Long> {
    
}
