/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author laris
 */
public class Autobus extends Transporte implements IFrenos, ISElectrico{
    
    public Autobus(int velocidad, int gas){
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
    
    public void tarjeta(){
        System.out.println("Lector de tarjetas activado");
    }

    @Override
    public String prendeLuces() {
        return "Luces del autobus encendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        return "Vidrios del autobus arriba";
    }

    @Override
    public String frenar() {
        return "Frenos del autobus activados";
    }
    
    @Override
    public void apagar() {
        System.out.println("Autobus apagado");
    }
    
}
