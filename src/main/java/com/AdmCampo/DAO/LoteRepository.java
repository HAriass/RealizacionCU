package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Lote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteRepository extends CrudRepository<Lote, Long> {
    
}
