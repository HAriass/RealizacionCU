package com.AdmCampo.DAO;

import com.AdmCampo.modelo.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {
    
}
