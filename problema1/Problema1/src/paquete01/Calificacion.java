/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class Calificacion {

    private String nombreestudiante;
    private double calificacionmateria1;
    private double calificacionmateria2;
    private double calificacionmateria3;
    private double promedio;


    public Calificacion() {
        nombreestudiante = "Jorge Lozada";
        calificacionmateria1 = 7.5;
        calificacionmateria2 = 4;
        calificacionmateria3=9;

    }

    public Calificacion(String nombre, double Mat1,double Mat2,double Mat3,
            double NotaF) {

        nombreestudiante = nombre;
        calificacionmateria1 = Mat1;
        calificacionmateria2 = Mat2;
        calificacionmateria3= Mat3;

    }
    public void establecerNombreestudiante(String c) {
        nombreestudiante = c;
    }

    public void establecerCalificacionmateria1(double c) {
        calificacionmateria1 = c;
    }

    public void establecerCalificacionmateria2(double c) {
        calificacionmateria2 = c;
    }
    public void establecerCalificacionmateria3(double c) {
        calificacionmateria3 = c;
    }
   
    public void calcularPromedio() {
        promedio = calificacionmateria1 + calificacionmateria2 + calificacionmateria3 / 3 ;
    }

    public String obtenerNombreestudiante() {
        return nombreestudiante;
    }

    public double obtenerCalificacionmateria1() {
        return calificacionmateria1;
    }

    public double obtenerCalificacionmateria2() {
        return calificacionmateria2;
    }
    public double obtenerCalificacionmateria3() {
        return calificacionmateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String notas = String.format("Calificaciones\n"
                + "Nombre del Estudiante: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreestudiante(),
                obtenerCalificacionmateria1(),
                obtenerCalificacionmateria2(),
                obtenerCalificacionmateria3(),
                obtenerPromedio());
        return notas;
    }

}
