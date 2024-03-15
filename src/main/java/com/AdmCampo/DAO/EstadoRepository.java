package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {
    
}
