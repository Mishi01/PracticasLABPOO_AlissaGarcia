/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana10;
import java.io.*;
/**
 *
 * @author laris
 */
public class WRMethods {
    
    public WRMethods(String fileN){
        this.wfiles(fileN);
    }
    
    private void wfiles(String fileN){
        
        try{
            FileWriter fw=new FileWriter(fileN);
            FileReader fr=new FileReader(fileN);
        
        
        WriteFile(fw);
        ReadFile(fr);
        }
        
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    private void WriteFile(FileWriter file) throws IOException{
        file.write("Escribiendo en archivo");
        file.write(97);
        file.close();
    }
    
    private void ReadFile(FileReader file) throws IOException{
        int aux=file.read();
        while (aux!=-1){
            System.out.println((char)aux);
            aux=file.read();
        }
        file.close();
    }
}
