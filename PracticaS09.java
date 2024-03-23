/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sv.edu.unab.practicas09;

import java.util.Scanner;

/**
 *
 * @author Carba
 */
public class PracticaS09 {

    public static void main(String[] args) {
        System.out.println("Hola Estudiantes");
        Scanner entrada = new Scanner(System.in);
        /*
        miMetodo();
        miMetodo();
        miMetodo();
        
        miMetodoString("Antonio");
        miMetodoString("Jeser");
        
        nuevoMetodo(6,9,7);
        
        OtroMetodo2("Andrea",22);
        OtroMetodo3("Oscar",25,1.65);
        
        System.out.println(miMetodoInt(9,6));
        System.out.println(miMetodoInt2(9,6));
        
        MetodoCondicional(17);
        
        int miNumI = MiMetodoInt(6,6);
        double miNumD = MiMetodoDouble(6.6,6.6);
        System.out.println("Int: "+miNumI);
        System.out.println("Double: "+miNumD);
        
        
       int miNumI = miMetodoOver(6,6);
       double miNumD = miMetodoOver(6.6,6.6);
       
       System.out.println("Int: "+miNumI);
       System.out.println("Double: "+miNumD);
       System.out.println("Int 3: "+miMetodoOver(7,8,9));
       System.out.println("Int 4: "+miMetodoOver(6,8,9,7)); */
       
       int result = sum(10);
       System.out.println(result);
       
       
       Principal miObjeto = new Principal();
       Principal miObjeto2 = new Principal();
       int suma = miObjeto.x * miObjeto.y;
       System.out.println(miObjeto.x);
       miObjeto2.x = 55; 
       System.out.println("El Resultado de la suma es: "+suma);
        System.out.println("El resultado de la mutiplicación: " +miObjeto2.x);
       
       Segunda miSObjeto = new Segunda();
       
       miSObjeto.x = 35;
       
       System.out.println("El valor en la segunda clase es: "+miSObjeto.x);
       
       Segunda miSObjeto2 = new Segunda();
       miSObjeto2.y = 25;
       
        System.out.println("El valor del segundo atributo es: "+miSObjeto2.y);
        
       // miSObjeto.z = 11;
        
        System.out.println("El nuevo valor es: "+miSObjeto.z);
        
        Principal otroObjeto = new Principal();
        
        System.out.println("Nombre: "+otroObjeto.nombre+" "+otroObjeto.apellido);
        System.out.println("Edad: "+otroObjeto.edad);
        
        OtraClase otraVariable = new OtraClase();
        
        double resultado = otraVariable.x / otraVariable.y;
        System.out.println("El resultado es: "+resultado);
        
    }
    
    static void miMetodo(){
        System.out.println("Un Mensaje desde un metodo");
    }
    
    static void miMetodoString(String nombre){
        System.out.println("Tu nombre es: "+nombre);
    }
    
    static void nuevoMetodo(int x,int y, int z){
        int a = x + y + z;
        System.out.println("El valor resultante es: " + a);
                          
    }
    
    static void OtroMetodo2(String nombre, int edad){
        System.out.println("Tu nombre es: "+ nombre +" y tu edad es "+edad+" años");
    }
    
    static void OtroMetodo3(String nombre, int edad,double estatura){
        System.out.println("Tu nombre es: "+ nombre +" y tu edad es "+edad+" años y su estatura es "+estatura);
    }
    
    
    static int miMetodoInt(int x,int y){
        return x - y;
    }
    
    static int miMetodoInt2(int x,int y){
        int resul = x * y;
        
        return resul;
    }
    
    static void MetodoCondicional(int edad){
        if(edad<18){
            System.out.println("No eres mayor de edad");
        
        }else{
            System.out.println("Eres mayor de edad");
        }
    }
    
    
    static int MiMetodoInt(int num1,int num2){
        return num1 + num2;
    }
    
    static double MiMetodoDouble(double num1,double num2){
        return num1 + num2;
    }
    
    
    static int miMetodoOver(int num1, int num2){
        return num1 + num2;
    }
    
    static int miMetodoOver(int num1, int num2,int num3){
        return num1 + num2;
    }
    
    static int miMetodoOver(int num1, int num2,int num3,int num4){
        return num1 + num2 + num3 + num4;
    }
       
    static double miMetodoOver(double num1, double num2){
        return num1 + num2;
    }
    
    
    static void miMetodoPrueba(){
        //En esta parte del codigo no se puede usar la variable
        
        
        int x = 100;//partir de este momento se puede utilizar la variable
        
        System.out.println(x);// aqui ya se ase uso de la variable
        
        
    
    }
    
    static void miMetodoPrueba1(){
        //En esta parte del codigo no se puede usar la variable
        
        {//Este es un bloque de codigo
        //En esta parte del codigo no se puede usar la variable    
            
        int x = 100;//partir de este momento se puede utilizar la variable
        
        System.out.println(x);// aqui ya se ase uso de la variable
        
        }// fin del bloque de codigo
        
        //En esta parte del codigo no se puede usar la variable 
    
    }
    
    public static int sum(int k){
        if(k>0){
            return k + sum(k-1);
        }else{
            return 0;
        }
    }
    
    
    
}

class OtraClase{
    double x = 15.0;
    double y = 7.7;

}
