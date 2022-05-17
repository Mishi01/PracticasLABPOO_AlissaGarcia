package semana5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laris
 */
public class Television extends DispositivoElectronico implements MenuConfig{
    private String color;

    @Override
    public void encender() {
        System.out.println("Television Encendida");
        
    }
    
    public String cambiarCanal(int c) {
        return "Television Cambia a Canal " + c;
    }
    
    public String cambiarVolumen(int v) {
        return "Television Cambia a Volumen " + v;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String resolConfig() {
        return ("Se ha cambiado la configuracion de resolucion");
    }

    @Override
    public String sonidoConfig() {
        return ("Se ha cambiado la configuracion del sonido");
    }

    @Override
    public String colorConfig() {
        return ("Se ha cambiado la configuracion del color");
    }
    
}
