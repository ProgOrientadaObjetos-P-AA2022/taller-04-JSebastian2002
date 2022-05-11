/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import paquete1.Financia;
import paquete1.Financia2;

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
        Financia dn = new Financia();
        Financia2 dn2 = new Financia2();
        dn.calcularComision();
        dn.obtenerComision();
        
        dn2.calcularComision();
        dn2.obtenerComision();


        System.out.printf("%s\n", dn);
        System.out.printf("%s\n", dn2);
    }
}
