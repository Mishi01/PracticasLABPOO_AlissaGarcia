/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author laris
 */
public class CalculadoraCientifica extends DispositivoElectronico implements IOperacioneStandar, IOperacionesAvanzadas{

    @Override
    public void encender() {
        System.out.println(("Calculadora Científica Encendida"));
    }

    @Override
    public double suma(double a, double b) {
        return (a + b);
    }

    @Override
    public double resta(double a, double b) {
        return (a - b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double multi(double a, double b){
        return a * b;
    }
    
    @Override
    public double divi(double a, double b){
        return a / b;
    }

    @Override
    public double sqrt(double a) {
        return (a * a);
    }

    @Override
    public double mod(double a, double b) {
        return (a % b);
    }
    
}
