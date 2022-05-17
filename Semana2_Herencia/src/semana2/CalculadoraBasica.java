/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana2;

/**
 *
 * @author laris
 */
public class CalculadoraBasica extends Calculadora {

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    private String modelo;
    
    public double Mult(double a, double b){
        return a*b;
    }
    
    public double Div(double a, double b){
        return a/b;
    }
}
