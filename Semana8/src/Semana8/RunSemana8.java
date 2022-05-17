/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Semana8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author laris
 */
public class RunSemana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Transporte> trans = new ArrayList<Transporte>();
        
        trans.add(new Automovil(100, 50));
        trans.add(new Autobus(65, 7));
        trans.add(new Barco(10, 9));
        trans.add(new Helicoptero(200, 100));
        trans.add(new Avion(800, 200));
        
        for (Transporte tra : trans ){
            System.out.println(tra.getClass().toString());
            System.out.println("Ingresa la marca del transporte: ");
            Scanner mrca=new Scanner(System.in);
            String marca=mrca.nextLine();
            tra.setMarca(marca);
            System.out.println("Ingresa el modelo del transporte: ");
            Scanner modl=new Scanner(System.in);
            String modelo=modl.nextLine();
            tra.setModelo(modelo);
            System.out.println(tra.getMarca());
            System.out.println(tra.getModelo());
            tra.encender();
            tra.acelerar();
        }
        
        Automovil rio = new Automovil(100, 50);
        System.out.println(rio.getClass().toString());
        rio.encender();
        System.out.println(rio.prendeLuces());
        System.out.println(rio.bajaSubeVidrios());
        System.out.println(rio.frenar());
        rio.aire();
        rio.apagar();
        
        Autobus mercedez = new Autobus(70, 70);
        System.out.println(mercedez.getClass().toString());
        mercedez.encender();
        System.out.println(mercedez.prendeLuces());
        System.out.println(mercedez.frenar());
        System.out.println(mercedez.bajaSubeVidrios());
        mercedez.tarjeta();
        mercedez.apagar();
        
        Avion delta = new Avion(800, 200);
        System.out.println(delta.getClass().toString());
        delta.encender();
        System.out.println(delta.prendeLuces());
        System.out.println(delta.volar());
        System.out.println(delta.frenar());
        delta.llantas();
        delta.apagar();
        
        Helicoptero puma = new Helicoptero(200, 100);
        System.out.println(puma.getClass().toString());
        puma.encender();
        System.out.println(puma.prendeLuces());
        System.out.println(puma.volar());
        puma.atras();
        System.out.println(puma.frenar());
        puma.apagar();
        
        Barco angler = new Barco(10, 11);
        System.out.println(angler.getClass().toString());
        angler.encender();
        System.out.println(angler.prendeLuces());
        System.out.println(angler.frenar());
        angler.apagar();
            
        }
    }
    
