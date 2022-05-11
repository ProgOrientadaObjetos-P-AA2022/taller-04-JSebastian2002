/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

public class Sueldo2 {

    private String nombre;
    private String apellido;
    private double sueldobasico;
    private String cedula;
    private double sueldototal;
    
    public Sueldo2 () {
        nombre = "Laura Maria";
        apellido = "Solorzano Montalvan";
        sueldobasico = 900;
        cedula = "110987898761";
    }
    
    public Sueldo2(String nb,String ap, double basico,
            String cd) {

        nombre= nb;
        apellido = ap;
        sueldobasico = basico;
        cedula = cd;
    }
    
    public void establecerNombre(String c) {
        nombre = c;
    }
    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerSueldobasico(double c) {
        sueldobasico = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }
   public void calcularSueldototal() {
        sueldototal = sueldobasico * 0.20 + sueldobasico;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldobasico() {
        return sueldobasico;
    }
    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldototal() {
        return sueldototal;
    }

    @Override
    public String toString() {
        String docente = String.format("Sueldo Total del Docente\n"
                + "Nombre del Docente: %s\n"
                + "Apellido del Docente: %s\n"
                + "Sueldo basico : %.2f\n"
                + "Cedula: %s\n"
                + "Sueldo total: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldobasico(),
                obtenerCedula(),
                obtenerSueldototal());
        return docente;
    }

}
