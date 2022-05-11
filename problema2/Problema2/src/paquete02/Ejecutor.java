/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.Sueldo;
import paquete01.Sueldo2;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {
        public static void main(String[] args) {
        // TODO code application logic here
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        Sueldo dc = new Sueldo();
        Sueldo2 dc2 = new Sueldo2();

        dc.calcularSueldototal();
        dc.obtenerSueldototal();
        
        dc2.calcularSueldototal();
        dc2.obtenerSueldototal();

        System.out.printf("%s\n", dc);
        System.out.printf("%s\n", dc2);
    }
}
