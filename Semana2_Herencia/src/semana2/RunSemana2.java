/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2;
import java.util.Scanner;
/**
 *
 * @author laris
 */
public class RunSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sm= new Scanner(System.in);
        System.out.println("Introduce la Marca");
        String mrca = sm.nextLine();
        
        Scanner smo= new Scanner(System.in);
        System.out.println("Introduce el Modelo");
        String mdelo = smo.nextLine();
        
        CalculadoraBasica casio = new CalculadoraBasica();
        casio.setMarca(mrca);
        System.out.println(casio.getMarca());
        casio.setModelo(mdelo);
        System.out.println(casio.getModelo());
  
        double rs= casio.Suma(6.5, 9);
        System.out.println(rs);
        System.out.println(casio.Resta(10, 1));
        System.out.println(casio.Mult(9, 9));
        System.out.println(casio.Div(78, 10));
    }
    
}
