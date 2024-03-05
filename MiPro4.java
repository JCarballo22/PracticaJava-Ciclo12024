/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sv.edu.unab.mipro4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carba
 */
public class MiPro4 {

    public static void main(String[] args) {
       Scanner entra = new Scanner(System.in);
      /* int numUsuario,numRamdon;
       numRamdon = (int)(Math.random()*10);
        System.out.println("Ingrese este numero: "+numRamdon);
        numUsuario = entra.nextInt();
        if(numRamdon == numUsuario){
            System.out.println("Los son igual");
        }else{
            System.out.println("No conciden los numeros ingresado");
        }
        System.out.println("Ingrese un numero entre 1 - 4");
        int operacion = entra.nextInt();
        int numUno = 8;
        int numDos = 3;
        int resultado = 0;
        
        if(operacion == 1){
            resultado = numUno + numDos;
            System.out.println("El resultado de la suma es: "+ resultado);
        }else if(operacion == 2){
            resultado = numUno - numDos;
            System.out.println("El resultado de la resta es: "+ resultado);
        }else if (operacion == 3){
            resultado = numUno * numDos;
            System.out.println("El resultado de la multiplicación es: "+ resultado);
        }else if (operacion == 4){
            resultado = numUno / numDos;
            System.out.println("El resultado de la divicion es: "+ resultado);
        }else{
            System.out.println("la operación no es soportada se esta trabajando en ella");
        } 
         
        if(operacion == 1){
            resultado = numUno + numDos;
            System.out.println("El resultado de la suma es: "+ resultado);
        }else{
            if(operacion == 2){
            resultado = numUno - numDos;
            System.out.println("El resultado de la resta es: "+ resultado);
            }else{ 
                if (operacion == 3){
                resultado = numUno * numDos;
                System.out.println("El resultado de la multiplicación es: "+ resultado);
                }else{
                    if (operacion == 4){
                    resultado = numUno / numDos;
                    System.out.println("El resultado de la divicion es: "+ resultado);
                 }else{
                    System.out.println("la operación no es soportada se esta trabajando en ella");
                 }
                } 
            }
        }
        
      int edad = 20;
      String mensaje = (edad>=18)?"Eres mayor de edad":"Eres menor de edad";
        System.out.println(mensaje);
      
        System.out.println("Seleciones un dia de al semana ingrese de 1 - 7");
        int semana = entra.nextInt();
        switch(semana){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El dia que especifico no es valido");
                
        }
        System.out.println("Seleciones un dia de al semana");
        String semanaStr = entra.nextLine();
        semanaStr = semanaStr.toLowerCase();
        switch(semanaStr){
            case "lunes":
                System.out.println("Lunes");
                break;
            case "martes":
                System.out.println("Martes");
                break;
            case "miercoles":
                System.out.println("Miercoles");
                break;
            case "jueves":
                System.out.println("Jueves");
                break;
            case "viernes":
                System.out.println("Viernes");
                break;
            case "sabado":
                System.out.println("Sabado");
                break;
            case "domingo":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("El dia que especifico no es valido");
                
        }
        
      
      int i = 1;
      while(i<=10){
          System.out.println("i = "+i);
          i = i+1;
      }
      
      int i = 10;
      while(i>=1){
          System.out.println("i = "+i);
          i = i-1;
      }
      
        System.out.println("Ingresa el numero a alcanzar");
        int valor = entra.nextInt();
      int i = 1;
      while(i<=valor){
          System.out.println("i = "+i);
          i++;
          i = i+5;
      }
      
      int i = 1;
      do{
          System.out.println("i = "+i);
          i++;
      }while(i<=10);
      
      int i = 10;
      do{
          System.out.println("i = "+i);
          i--;
      }while(i>=1);
      
      Random ran = new Random();
      int aleatorio = ran.nextInt(10)+1;
        System.out.println("El numero aleatorio es: "+aleatorio);
      int i = 1;
      do{
          System.out.println("i = "+i);
          i++;
      }while(i<=aleatorio);
      
      
      for (int i = 1;i<=10;i++){
          System.out.println("i = "+i);
      }
      
      for (int i = 10;i>=1;i--){
          System.out.println("i = "+i);
      }
      
      System.out.println("Ingrese el numero que desea repetir");
      int rep = entra.nextInt();
      for(int i = 0;i<=rep;i = i+2){
          System.out.println("i = "+i);
      }
      
      for (int i = 1; i<=2;i++){
          System.out.println("bucle externo i = "+i);
          for(int j = 1;j<= 3;j++){
              System.out.println("bucle interno j = "+j);
              for(int f = 1;f<= 4;f++){
                  System.out.println("Buble interno del interno f = "+f);
              }
          }
      }
                   //0,1,2,3,4
      int[] miNum = {8,4,9,7,2};
        System.out.println(miNum[2]);
      for(int i = 0;i<=4;i++){
          System.out.println(miNum[i]);
      }*/
      
      String[] carros = {"Toyota","Honda","Mazda","Mercedez","Ford"};
      for(int i = 0;i<=carros.length-1;i++){
          System.out.println(carros[i]);
      }
      
      for(String i:carros){
          System.out.println("Los valores del arreglo son: "+i);
      }
                    //0,1,2,3,4
      int[] miNum = {8,4,9,7,2};
      for(int i:miNum){
          System.out.println(i);                       
      }
      
      
    }
}
