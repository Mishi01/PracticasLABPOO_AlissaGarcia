/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author laris
 */
public class RunSemana9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena[]=new String[5];
        cadena[0]="Hola Mundo";
        cadena[1]="Alissa Garcia";
        cadena[2]="Ciencias Computacionales";
        cadena[3]="Benito Juárez";
        cadena[4]="Feliz Cumpleaños";
        
        String cadena2[]=new String[5];
        cadena2[0]="5";
        cadena2[1]=" ";
        cadena2[2]="a";
        cadena2[3]="p";
        cadena2[4]="6";
                
        String cadena3[]=new String[5];
        cadena3[0]="Nombre";
        cadena3[1]="Alissa";
        cadena3[2]="Nacion";
        cadena3[3]="Salmon";
        cadena3[4]="Nemo";
    
    int opc=0;    
    do{    
    System.out.println("""
                       \n\nEscoja una opci\u00f3n: 
                       \t1) Substrings 
                       \t2) Letra, digito o espacio
                       \t3) Mayuscula o minuscula
                       \t4) Empiezan con N
                       \t5) Terminan con N
                       \t6) Salir""");
    Scanner opcion=new Scanner(System.in);
    opc=opcion.nextInt();
    switch(opc){
        case 1 -> { 
            System.out.println(Arrays.toString(Funciones.funcion1(cadena, 5, 10)));
            
            }
        case 2 -> {
            System.out.println(Arrays.toString(Funciones.funcion2(cadena2)));
        }
        case 3 -> {
            System.out.println(Arrays.toString(Funciones.funcion3(cadena)));        
        }
        case 4 -> {
            System.out.println(Funciones.funcion4(cadena3,'N'));        
        }
        case 5 -> {
            System.out.println(Funciones.funcion5(cadena3,"n"));
        }
    }
    }while(opc!=6);
    }
    }

