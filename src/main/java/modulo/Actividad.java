/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

/**
 *
 * @author arlen
 */
public abstract class Actividad implements Evaluacion{
    
    private String enunciado;

    public Actividad(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public abstract String tipo();

    @Override
    public abstract boolean validarRespuesta(String respuesta);
}
