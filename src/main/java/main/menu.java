/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class menu {

    public void iniciar() {

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    Menu Principal
                                                                  
                                                         1.Registrar personaje
                                                         2.Iniciar o continuar aventura
                                                         3.Ver progreso
                                                         4.Consultar dias
                                                         5.Consultar historial
                                                         6.Reiniciar partida
                                                            Salir   """));

            switch (opcion) {

                case 0: // Registrar personaje
                    break;

                case 1: // Iniciar o continuar aventura
                    break;

                case 2: // Ver progreso
                    break;

                case 3: // Consultar agenda
                    break;

                case 4: // Consultar historial
                    break;

                case 5: // Reiniciar partida
                    break;

                case 6: // Salir
                    break;
            }

        } while (opcion != 6);
    }
}
