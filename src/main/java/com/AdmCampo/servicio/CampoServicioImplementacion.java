
package com.AdmCampo.servicio;

import com.AdmCampo.DAO.CampoRepository;
import com.AdmCampo.modelo.Campo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampoServicioImplementacion implements CampoServicio{

    
    @Autowired
    private CampoRepository campoRepository;

    
    @Override
    public List<Campo> listaCampos() {
        return (List<Campo>) campoRepository.findAll();
    }
    
    
}
