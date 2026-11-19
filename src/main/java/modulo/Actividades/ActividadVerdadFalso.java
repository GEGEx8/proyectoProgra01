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
public class ActividadVerdadFalso extends Actividad {

    private boolean respuestaCorrecta;

    public ActividadVerdadFalso(String enunciado, boolean respuestaCorrecta) {
        super(enunciado);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public boolean isRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    @Override
    public String tipo() {
        return "Verdadero o Falso";
    }

    @Override
    public boolean validarRespuesta(String respuesta) {
        if (respuesta.equalsIgnoreCase("VERDADERO")) {
            return respuestaCorrecta = true;
        }
        if (respuesta.equalsIgnoreCase("FALSO")) {
            return respuestaCorrecta = false;
        }

        return false; //No escribio respuesta
    }

}
