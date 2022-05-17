/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana9;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author laris
 */
public class Funciones {
    
    public static String[] funcion1(String[] cadena , int a, int b){
        String[] snueva=new String[5];
        int i=0;
        for(String act1 : cadena){
            if(i<5){
           snueva[i]= act1.substring(a, b);
           i++;
            }
        }
        return snueva;
        } 

    public static String[] funcion2(String[] cadena){
        String[] aux=new String[5];
        for(int i=0;i<5;i++){
            for(int j=0;j<cadena[i].length();j++){
                if(Character.isDigit(cadena[i].charAt(j))){
                    aux[i]="Numero";
                }
                else{
                    if(Character.isLetter(cadena[i].charAt(j))){
                    aux[i]="Letra";
                }
                    else{
                        if(Character.isSpaceChar(cadena[i].charAt(j))){
                            aux[i]= "Espacio";
                        }
                    }   
            }
        }
}
        return aux;
    }
   
    public static String[] funcion3(String[] cadena){
    String[] aux= new String[5];
    
    Scanner resp=new Scanner(System.in);
    System.out.println("Ingresa M para mayuscula y N: ");
    String param= resp.nextLine();
        if(param.equals("M")){
            for(int i=0;i<5;i++){
            aux[i]=cadena[i].toUpperCase();
        }
        }
        else{
            for(int i=0;i<5;i++){
            aux[i]=cadena[i].toLowerCase();
        }
        }
        return aux;
        }
          
    public static ArrayList<String> funcion4(String[] cadena, char a){
        ArrayList<String> aux=new ArrayList<>();
        int j=0;
        for(int i=0;i<5;i++){
            if(cadena[i].charAt(0)==a){
                aux.add(cadena[i]);
                j++;
            }
        }
        System.out.println("Hay " + j +" elementos que inician con " + a + ":  " );
        return aux;
    }
    
        public static ArrayList<String> funcion5(String[] cadena, String a){
        ArrayList<String> aux=new ArrayList<>();
        int j=0;
        for(int i=0;i<5;i++){
            if(cadena[i].endsWith(a)){
                aux.add(cadena[i]);
                j++;
            }
        }
        System.out.println("Hay " + j +" elementos que terminan con " + a + ":  " );
        return aux;
    }
}
