/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.unab.practicas14;

/**
 *
 * @author Carba
 */
public class Proceso3 extends Thread {
    int num;
    
    public Proceso3(String nombreHilo){
        super(nombreHilo);
    }
    
    @Override
    public void run(){
       for(int i = 0;i<=num;i++){
          System.out.println(i +" "+ this.getName());
          // System.out.println("Hilo x");
       } 
       System.out.println("");
    }
    
    public void ValorCondicion(int valor){
        this.num = valor;
    }
}
