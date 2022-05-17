/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author laris
 */
public class Barco extends Transporte implements IFrenos, ISElectrico{

     public Barco(int velocidad, int gas){
        super(velocidad, gas);
    }
    
    @Override
    public void encender() {
        if(gas > 10){
           System.out.println("El nivel de gasolina es " + gas);
       }
       else{
           System.out.println("Transporte sin gasolina");
       }
    }

    @Override
    public String frenar() {
        return "Frenos del barco activados";
    }

    @Override
    public String prendeLuces() {
        return "Luces del barco encendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public void apagar() {
        System.out.println("Barco apagado");
    }
    
}
