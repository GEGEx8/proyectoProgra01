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
public class ActividadSeleccionUnica extends Actividad {
    private String[] opciones;
    private String respuestaCorrecta;

    public ActividadSeleccionUnica(String enunciado, String respuestaCorrecta, String[] opciones) {
        super(enunciado);
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    @Override
    public String tipo() {
        return "SELECCION UNICA";
    }

    @Override
    public boolean validarRespuesta(String respuesta) {
        return respuestaCorrecta.equalsIgnoreCase(respuesta);
    }

}
