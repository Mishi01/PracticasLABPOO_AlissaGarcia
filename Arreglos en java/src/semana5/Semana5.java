/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana5;
import java.util.Scanner;

/**
 *
 * @author laris
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
                
        Calculadora[] calcs = new Calculadora[5];
        Television[] televs = new Television[5];
        CalculadoraCientifica[] calcsci = new CalculadoraCientifica[5]; 
        
         for (int i = 0; i < 5; i++) {

            calcs[i] = new Calculadora();
            System.out.println("Introduce las marcas de las calculadoras:");
            Scanner objCalM = new Scanner(System.in);
            String marCal = objCalM.next();
            calcs[i].setMarca(marCal);
            System.out.println("Introduce los modelos de las calculadoras: ");
            Scanner objCalMo = new Scanner(System.in);
            String modCal = objCalMo.next();
            calcs[i].setModelo(modCal);
         }
         
         for (int i = 0; i < 5; i++){
            televs[i] = new Television();
            System.out.println("Introduce las marcas de las televisiones:");
            Scanner objTelM = new Scanner(System.in);
            String marTel = objTelM.next();
            televs[i].setMarca(marTel);
            System.out.println("Introduce los modelos de las televisiones: ");
            Scanner objTelMo = new Scanner(System.in);
            String modTel = objTelMo.next();
            calcs[i].setModelo(modTel);
            System.out.println("Ingresa el color de la televisión: ");
            Scanner objTelC= new Scanner(System.in);
            String colTel = objTelC.next();
            televs[i].setColor(colTel);
         }
         for(int i = 0; i < 5; i++){
            calcsci[i] = new CalculadoraCientifica();
            System.out.println("Introduce las marcas de las calculadoras científicas:");
            Scanner objCalciM = new Scanner(System.in);
            String marCalci = objCalciM.next();
            calcsci[i].setMarca(marCalci);
            System.out.println("Introduce los modelos de las calculadoras científicas: ");
            Scanner objCalciMo = new Scanner(System.in);
            String modCalci = objCalciMo.next();
            calcsci[i].setModelo(modCalci);
        }
         
        for (Calculadora cal : calcs)
        {
            System.out.println("Calculadora Marca: " + cal.getMarca());  
            System.out.println("Calculadora Modelo: " + cal.getModelo());  
            cal.encender();
            System.out.println(cal.suma(2, 2));
            System.out.println(cal.resta(2, 2));
            System.out.println(cal.divi(4, 2));
            System.out.println(cal.multi(2, 3));
            System.out.println(cal.apagar());
        }
        for (Television tel : televs)
        {
            System.out.println("Television Marca: " + tel.getMarca());
            System.out.println("Television Modelo: " + tel.getModelo());
            System.out.println("Television Color: " + tel.getColor());
            tel.encender();
            System.out.println(tel.cambiarCanal(3));
            System.out.println(tel.cambiarVolumen(5));
            System.out.println(tel.colorConfig());
            System.out.println(tel.getColor());
            System.out.println(tel.resolConfig());
            System.out.println(tel.sonidoConfig());
            System.out.println(tel.apagar());
        }
        
        for (CalculadoraCientifica calci : calcsci)
        {
            System.out.println("Calculadora Científica Marca: " + calci.getMarca());
            System.out.println("Calculadora Científica Modelo: " + calci.getModelo());
            calci.encender();
            System.out.println(calci.suma(2, 2));
            System.out.println(calci.resta(2, 2));
            System.out.println(calci.divi(4, 2));
            System.out.println(calci.multi(2, 3));
            System.out.println(calci.mod(3, 2));
            System.out.println(calci.sqrt(4));
            System.out.println(calci.apagar());
        }
    }
    
}
