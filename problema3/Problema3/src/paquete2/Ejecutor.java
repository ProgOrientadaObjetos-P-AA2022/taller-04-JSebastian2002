/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import paquete1.Automotor;
import paquete1.Automotor2;

/**
 *
 * @author E.N.D
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        Automotor vh = new Automotor();
        Automotor2 vh2 = new Automotor2();
        vh.calcularValormatricula();
        vh.obtenervalormatricula();
        vh2.calcularValormatricula();
        vh2.obtenervalormatricula();

        System.out.printf("%s\n", vh);
        System.out.printf("%s\n", vh2);
    }
    
}
