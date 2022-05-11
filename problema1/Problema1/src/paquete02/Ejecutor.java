/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Calificacion;
import paquete01.Calificacion2;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {
        public static void main(String[] args) {
        // TODO code application logic here
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        Calificacion nt = new Calificacion();
        Calificacion2 nt2 = new Calificacion2();
        nt.calcularPromedio();
        nt.obtenerPromedio();
        
        nt2.calcularPromedio();
        nt2.obtenerPromedio();

        System.out.printf("%s\n", nt);
        System.out.printf("%s\n", nt2);
    }
}
