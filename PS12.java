/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.unab.practicas12;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Carba
 */
public class PS12 {
    
    
    
    
    public static void main(String[] args){
        ArrayList<String> carros = new ArrayList<String>();
        carros.add("Toyota");
        carros.add("Ford");
        carros.add("Honda");
        carros.add("Mazda");
        carros.add("Ford");
        System.out.println(carros);
        
        System.out.println(carros.get(2));
        
        carros.set(1, "BMW");
        
        System.out.println(carros.get(1));
        System.out.println(carros);
        
        carros.remove(3);
        System.out.println(carros.get(3));
        System.out.println(carros);
        
       // carros.clear();
       // System.out.println(carros);
        
       System.out.println(carros.size());
        
       for (int i = 0; i< carros.size(); i++){
           System.out.println(carros.get(i));
       }
       
       for (String i : carros){
           System.out.println(i);
       }
       
       
       ArrayList<Integer> miNumero = new ArrayList<Integer>();
       ArrayList<Double> miNDouble = new ArrayList<Double>();
       ArrayList<Boolean> miBool = new ArrayList<Boolean>();
       
       miNumero.add(33);
       miNumero.add(1);
       miNumero.add(2249);
       miNumero.add(798);
       miNumero.add(7);
       
        System.out.println(miNumero);
        System.out.println(miNumero.get(2));
        
        miNumero.set(0,9);
        System.out.println(miNumero);
        
        miNumero.remove(4);
        System.out.println(miNumero);
        
        System.out.println(miNumero.size());
        
       for (int i : miNumero){
           System.out.println(i);
       }
       
       
       Collections.sort(carros);
       for (String i : carros){
           System.out.println(i);
       }
       
       
       Collections.sort(miNumero);
       for(int i : miNumero){
           System.out.println(i);
       }
       
       Nivel miEnum = Nivel.BAJO;
       
       System.out.println(miEnum);
       
       DiaSemana miDia = DiaSemana.VIERNES;
       
       switch(miDia){
           case LUNES:
               System.out.println("Es lunes");
               break;
           case MARTES:
               System.out.println("Es martes");
               break;
           case MIERCOLES:
               System.out.println("Es miercoles");
               break;
           case JUEVES:
               System.out.println("Es Jueves");
               break;
           case VIERNES:
               System.out.println("Es Viernes");
               break;
           case SABADO:
               System.out.println("Es Sábado");
               break;
           case DOMINGO:
               System.out.println("Es Domingo");
               break;
           default:
               System.out.println("No existe este dia");
       }
       
       for (Nivel i : Nivel.values()){
           System.out.println(i);
       }
       
       for (DiaSemana i:DiaSemana.values()){
           System.out.println(i);
       }
       
       
    }
    
    enum DiaSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
    
    
}

enum Nivel{
    BAJO,
    MEDIO,
    ALTO
}




