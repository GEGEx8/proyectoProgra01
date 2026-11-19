/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo.Actividades;

import modulo.Actividad;

/**
 *
 * @author arlen
 */
public class ActividadRespuestaCorta extends Actividad{
    private String respuestaCorrecta;

    public ActividadRespuestaCorta(String enunciado, String respuestaCorrecta) {
        super(enunciado);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @Override
    public String tipo() {
        return "RESPUESTA CORTA";
    }

    @Override
    public boolean validarRespuesta(String respuesta) {
        return respuesta.equalsIgnoreCase(respuestaCorrecta);
    }
    
}
