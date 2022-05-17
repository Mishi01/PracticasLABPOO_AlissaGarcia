/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author Ali
 */
public class Television extends DispositivoElectronico {
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
    
}
