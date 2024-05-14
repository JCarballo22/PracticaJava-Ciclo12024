/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sv.edu.unab.practicas14;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Carba
 */
//public class PracticaS14 extends Thread {
//public class PracticaS14 implements Runnable {
public class PracticaS14 {
    public static int cantidad = 0;
    
    public static void main(String[] args) {
        //Iterador();
        //hiloThread();
        //hiloRunnable();     
        //System.out.println("Este codigo se ejecuta fuera del hilo");
        
        //OtroHilo();
        /*
        Proceso1 hiloThread = new Proceso1();
        Thread hiloRunnable = new Thread(new Proceso2());
        
        Proceso2 hiloRunnable2 = new Proceso2();
        Thread hiloPrincipal = new Thread(hiloRunnable2);
        
        hiloPrincipal.start();
        hiloThread.start();
        hiloRunnable.start();
        
        Proceso3 otroHiloThread1 = new Proceso3("Hilo 1");
        Proceso3 otroHiloThread2 = new Proceso3("Hilo 2");
        Proceso3 otroHiloThread3 = new Proceso3("Hilo 3");
        
        otroHiloThread1.ValorCondicion(5);
        otroHiloThread2.ValorCondicion(6);
        otroHiloThread3.ValorCondicion(4);
        
        otroHiloThread1.start();
        otroHiloThread2.start();
        otroHiloThread3.start();*/
        
        excepsiones();
        
    }
    
    public static void Iterador(){
        //Creamos una colleccion
        ArrayList<String> vegetales = new ArrayList<String>();
        vegetales.add("Zanahora");
        vegetales.add("Papa");
        vegetales.add("brocoli");
        vegetales.add("Berengena");
        vegetales.add("Tomate");
        
        int a = 0;
        for (String i : vegetales){
            a += 1;
            System.out.println("Los elementos del array son :"+a+" "+i);
            
        }
        
        Iterator<String> itVegetales = vegetales.iterator();
        
        System.out.println("Nos muestra el primer valores del iterador: "+itVegetales.next());
        System.out.println("Nos muestra el primer valores del iterador: "+itVegetales.next());
        
        while(itVegetales.hasNext()){
            System.out.println("Estos son los elementos a iterar "+itVegetales.next());
            
        }
        
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(34);
        numeros.add(6);
        numeros.add(37);
        numeros.add(12);
        numeros.add(99);
        numeros.add(66);
        
        Iterator<Integer> itNumeros = numeros.iterator();
        while(itNumeros.hasNext()){
            //System.out.println(itNumeros.next());
            Integer i = itNumeros.next();
            if(i<=50){
                itNumeros.remove();
            }
            
        }
        System.out.println(numeros);
        
        Iterator<Integer> itNumeros2 = numeros.iterator();
        int c = 0;
        while(itNumeros2.hasNext()){
            //System.out.println(itNumeros.next());
            itNumeros2.next();
            itNumeros2.remove();
            c+=1;
        }
        System.out.println("El bucle se repitio: "+c);
        System.out.println(numeros);
    
    }
    
    /*public static void hiloThread(){
        PracticaS14 hiloThread = new PracticaS14();
        hiloThread.start();
        System.out.println("El valor actual es: "+cantidad);
        //esperar que el hilo o thread finalice
        while(hiloThread.isAlive()){
            System.out.println("Esperando... que finaliza el hilo");
        }
        System.out.println("El valor actual es: "+cantidad);
        cantidad++;
        System.out.println("El valor actual es: "+cantidad);
        
    }
    
    public static void hiloRunnable(){
        PracticaS14 hiloRunnable = new PracticaS14();
        Thread hiloPrincipal = new Thread(hiloRunnable);
        hiloPrincipal.start();
    }*/
    
    public static void OtroHilo(){
        
        for (int i = 0;i<=7;i++){
            System.out.println("Proceso 1");
        
        }
        
        System.out.println("");
        
        for(int i = 0; i<=7;i++){
            System.out.println("Proceso 2");
        }
    }
    /*
    @Override
        public void run(){
            //System.out.println("Este codigo corre dentro del hilo");
            cantidad++;
        }*/
        
    
    public static void excepsiones(){
        try{
        int[] miNumeros = {1,2,3};
        
        System.out.println(miNumeros[1]);
        }catch(Exception e){
            System.out.println("Has indicado un numero incorrecto de indice"+e);
        }finally{
            System.out.println("La bloque try...Catch a finalizado");
        }
    
    }
    
    
}
