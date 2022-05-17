/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana8;

/**
 *
 * @author laris
 */
public abstract class Transporte {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

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
   
    private String marca;
    private String modelo;
    
   public int velocidad, gas;
   
   public Transporte(int velocidad, int gas){
       this.velocidad=velocidad;
       this.gas=gas;
   }
   
   public void acelerar(){
       if(gas > 10){
           System.out.println("Transporte acelerando " + velocidad);
       }
       else{
           System.out.println("Transporte sin gasolina");
       }
   }

   public abstract void encender();
   public abstract void apagar();
    
   
}
