/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author laris
 */
public class Automovil extends Transporte implements ISElectrico, IFrenos{

    public Automovil(int velocidad, int gas){
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
    
    public void aire(){
        System.out.println("Bolsas de aire funcionando perfectamente");
    }

    @Override
    public String prendeLuces() {
        return "Luces del automovil encendidas";
    }

    @Override
    public String bajaSubeVidrios() {
        return "Vidrios del automovil arriba";
    }

    @Override
    public String frenar() {
        return "Frenos del automovil activados";
    }

    @Override
    public void apagar() {
        System.out.println("Automovil apagado");
    }
    
}
