
package com.AdmCampo.controlador;

import com.AdmCampo.modelo.Campo;
import com.AdmCampo.modelo.Lote;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.AdmCampo.servicio.CampoServicio;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GestorLaboreos {
    
    private ArrayList<Campo> camposHabilitados = new ArrayList<>();
    private ArrayList<Lote> lotesConProyectoCultivoVigente = new ArrayList<>();
    private Campo campoSeleccionado = null;
    private List<Lote> lotesCampoSeleccionado;
    private Map<Integer, LocalDate> mapaLotesFechaInicio = new HashMap<>();
    @Autowired
    private CampoServicio campoServicio;
    
    @GetMapping("/pedirSeleccionCampo")
    public String buscarCampos(Model model) {
        camposHabilitados.clear();
        List<Campo> campos = campoServicio.listaCampos();
        for (int i = 0; i < campos.size(); i++) {
            Campo campo = campos.get(i);
            if (campo.estaHabilitado()) {
            camposHabilitados.add(campo);
            }
        }
        model.addAttribute("camposHabilitados", camposHabilitados);
        return "pantallaAdmLaboreos";
    }

    @GetMapping("/tomarSeleccionCampo/{campoId}")
    public String tomarSeleccionCampo(@PathVariable Long campoId) {
        
        for (Campo campo : camposHabilitados) {
            if (campo.getId().equals(campoId)) {
                campoSeleccionado = campo;
                break;
            }
        }

        if (campoSeleccionado == null) {
            throw new RuntimeException("Campo no encontrado con ID: " + campoId);
        }

        // Devolver el nombre del campo seleccionado
        System.out.println("campoSeleccionado " + campoSeleccionado.getNombre());
        return "redirect:/pedirSeleccionLotesConProyectoCultivo";
    }

    //buscar lote con proyecto de cultivo vigente
    public void buscarLoteProyectoVigente(Campo campoSeleccionado){ 
        if (campoSeleccionado!=null){
            this.lotesCampoSeleccionado = campoSeleccionado.getLotes();

            for(Lote lote : this.lotesCampoSeleccionado){

                if(lote.tieneProyectoCultivoVigente()){
                    System.out.println("nuero lote actual"+lote.getNumero());
                    this.lotesConProyectoCultivoVigente.add(lote);
                    int numeroLote = lote.getNumero();
                    LocalDate fecha = lote.mostrarFechaInicioProyectoVigente(lote.getId());
                    mapaLotesFechaInicio.put(numeroLote, fecha);
                    System.out.println(""+numeroLote + fecha);
                }
            }
        }
    }
    @GetMapping("/pedirSeleccionLotesConProyectoCultivo")
    public String pedirSeleccionLotesConProyectoCultivo(Model model){
        this.mapaLotesFechaInicio.clear();
        this.buscarLoteProyectoVigente(campoSeleccionado);
        model.addAttribute("mapaLotesFechaInicio", mapaLotesFechaInicio);
        return "mostrarLotesConProyectoDeCultivo";
    }

}
