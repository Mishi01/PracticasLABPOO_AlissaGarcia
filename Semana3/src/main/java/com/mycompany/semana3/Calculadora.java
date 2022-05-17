/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author Ali
 */
public class Calculadora extends DispositivoElectronico implements IOperacioneStandar{

    @Override
    public void encender() {
        
        System.out.println("Caculadora Encendida");
    }
    
    @Override
    public double suma(double a, double b){
        return a + b;
    }
    
    @Override
    public double resta(double a, double b){
        return a - b;
    }
    
    @Override
    public double multi(double a, double b){
        return a * b;
    }
    
    @Override
    public double divi(double a, double b){
        return a / b;
    }
}
