/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo;

/**
 *
 * @author gomez
 */
public class jugador {
        private String nombre;
    private int avanceProyecto;
    private int preparacionExposicion;
    private boolean acuerdoCumplido;
    
    
     // Horario: 2 espacios por día y 5 días
    private String[][] agenda;

    // Guarda las decisiones que toma durante la historia
    private ArrayList<String> historial;

    public jugador() {
        
    }
    
    
    public Jugador(String nombre) {

        this.nombre = nombre;

        avanceProyecto = 0;
        preparacionExposicion = 0;
        acuerdoCumplido = false;

        agenda = new String[2][5];
        historial = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAvanceProyecto() {
        return avanceProyecto;
    }

    public void setAvanceProyecto(int avanceProyecto) {
        this.avanceProyecto = avanceProyecto;
    }

    public int getPreparacionExposicion() {
        return preparacionExposicion;
    }

    public void setPreparacionExposicion(int preparacionExposicion) {
        this.preparacionExposicion = preparacionExposicion;
    }

    public boolean isAcuerdoCumplido() {
        return acuerdoCumplido;
    }

    public void setAcuerdoCumplido(boolean acuerdoCumplido) {
        this.acuerdoCumplido = acuerdoCumplido;
    }


}
