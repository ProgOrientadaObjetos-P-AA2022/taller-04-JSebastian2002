/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Financia2 {

    private String nombrecliente;
    private String nombrebanco;
    private double valorcheque;
    private double comision;


    public Financia2() {
        nombrecliente = "Diego Cuenca";
        nombrebanco = "BANCO AMAZONAS";
        valorcheque = 30000;

    }

    public Financia2(String nombre, String banco,double cheque) {

        nombrecliente = nombre;
        nombrecliente = banco;
        valorcheque = cheque;
    }
    public void establecerNombrecliente(String c) {
        nombrecliente = c;
    }

    public void establecerNombrebanco(String c) {
        nombrebanco = c;
    }

    public void establecerValorcheque(double c) {
        valorcheque = c;
    }
    public void calcularComision() {
       comision = valorcheque * 0.003;
    }

    public String obtenerNombrecliente() {
        return nombrecliente;
    }

    public String obtenerNombrebanco() {
        return nombrebanco;
    }

    public double obtenerValorcheque() {
        return valorcheque;
    }
    public double obtenerComision() {
        return comision;
    }
    @Override
    public String toString() {
        String saldo = String.format("Finanzas\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comision: %.2f\n",
                obtenerNombrecliente(),
                obtenerNombrebanco(),
                obtenerValorcheque(),
                obtenerComision());
        return saldo;
    }

}
