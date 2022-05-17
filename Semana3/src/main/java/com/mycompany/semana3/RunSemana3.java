/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;
import java.util.Scanner;
/**
 *
 * @author Ali
 */
public class RunSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sma = new Scanner(System.in);
        System.out.println("Ingrese la marca de la television: ");
        String tmrca = sma.nextLine();
        
        Scanner smo = new Scanner(System.in);
        System.out.println("Ingrese el modelo de la television: ");
        String tmdlo = smo.nextLine();
        
        Scanner scol = new Scanner(System.in);
        System.out.println("Ingrese el color de la television: ");
        String tclor = scol.nextLine();
        
        Television hitachi = new Television();
        hitachi.setMarca(tmrca);
        hitachi.setModelo(tmdlo);
        hitachi.setColor(tclor);
        
        System.out.println(hitachi.getMarca());
        System.out.println(hitachi.getModelo());
        System.out.println(hitachi.getColor());
        
        hitachi.encender();
        System.out.println(hitachi.cambiarCanal(5));
        System.out.println(hitachi.cambiarVolumen(2));
        System.out.println(hitachi.apagar());
        
        Scanner smacal = new Scanner(System.in);
        System.out.println("Ingrese la marca de la calculadora: ");
        String cmrca = smacal.nextLine();
        
        Scanner smocal = new Scanner(System.in);
        System.out.println("Ingrese el modelo de la calculadora: ");
        String cmdlo = smocal.nextLine();
        
        Calculadora casio = new Calculadora();
        casio.setMarca(cmrca);
        casio.setModelo(cmdlo);
        
        System.out.println(casio.getMarca());
        System.out.println(casio.getModelo());
        casio.encender();
        System.out.println(casio.suma(4, 9));
        System.out.println(casio.resta(10, 8));
        System.out.println(casio.multi(7, 3));
        System.out.println(casio.divi(22, 2));
        System.out.println(casio.apagar());
        
    }
    
}
