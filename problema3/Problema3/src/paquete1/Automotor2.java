/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author E.N.D
 */
public class Automotor2 {
    
    private String ceduladueño;
    private String marcavehiculo;
    private double añofabricacion;
    private double valorvehiculo;
    private double valormatricula;

    
    public  Automotor2() {
        ceduladueño = "11058976532";
        marcavehiculo = "Fort";
        añofabricacion = 1974;
        valorvehiculo = 9.900;
    }

    public  Automotor2(String cd, String marca,double año,double vehiculo) {

        ceduladueño = cd;
        marcavehiculo = marca;
        añofabricacion = año;
        valorvehiculo = vehiculo;
    }
    
    public void establecerCeduladueño(String c) {
        ceduladueño = c;
    }

    public void establecerMarcavehiculo(String c) {
        marcavehiculo = c;
    }

    public void establecerAñofabricacion(double c) {
        añofabricacion = c;
    }
    public void establecerValorvehiculo(double c) {
        valorvehiculo = c;
    }
   
    public void calcularValormatricula() {
        valormatricula = valorvehiculo * 0.002 * añofabricacion ;
    }

    public String obtenerCeduladueño() {
        return ceduladueño;
    }

    public String obtenerMarcavehiculo() {
        return marcavehiculo;
    }

    public double obtenerAñofabricacion() {
        return añofabricacion;
    }
    public double obtenerValorvehiculo() {
        return valorvehiculo;
    }

    public double obtenervalormatricula() {
        return valormatricula;
    }

    @Override
    public String toString() {
        String notas = String.format("Automotor\n"
                + "Cedula del dueño: %s\n"
                + "Marca del Vehiculo: %s\n"
                + "Año de Fabricacion: %.2f\n"
                + "Valor del Vehiculo: %.2f\n"
                + "Valor de Matricula %.2f\n",
                obtenerCeduladueño(),
                obtenerMarcavehiculo(),
                obtenerAñofabricacion(),
                obtenerValorvehiculo(),
                obtenervalormatricula());
        return notas;
    }

}

   
