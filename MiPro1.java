
package sv.edu.unab.mipro1;

/**
 *
 * @author Carba
 */
public class MiPro1 {

    public static void main(String[] args) {
        //Y ya esto se vuelve un comentario donde podemos explicar algo que hace un bloque de codigo
       System.out.println("Hola Estudiantes!");
       System.out.println("Estoy aprendiendo Java");
       System.out.println("Este esto tiene un error");
       
       //Esta linea imprime un texto en pantalla 
       System.out.print("Programación");
       System.out.print(" Aplicada II");//Estal linea es otra forma de declarar comentarios
       
       /*
       Esta linea es comentario
       Tambien es comentario
       es un comentario
       *///ya no es comentario
       
       
       System.out.println("\n"+9);
       System.out.println(4);
       
       System.out.println(9+4);
       System.out.println(9*4);
       
       String nombre1 = "Fernando";
       System.out.println(nombre1);
       
       int numero = 14;
       System.out.println(numero);
       
       float decimal = 3.1416f;
       System.out.println(decimal);
       
       
       int num1;
       num1 = 25;
       System.out.println(num1);
       
       int num2 = 20;
       System.out.println(num2);
       num2 = 30;
       System.out.println(num2);
       
       char letra = 'a';
       letra = 'B';
       System.out.println(letra);
                
       boolean bool = true;
       System.out.println(bool);
    
       final int equipoFutbol = 11;
       //final int equipoFutbolSala = 5;
       //equipoFutbol = 25;//No podemos reasignar valores a una constante
       System.out.println(equipoFutbol);
       
       String nom1 = "Jose";
       System.out.println("Hola como estas "+nom1);
       
       String nombre = "Andrea";
       String apellido = "Murcia";
       String nombreCompleto = nombre +" "+ apellido;
       System.out.println(nombreCompleto);
       
       int x = 7;
       int y = 4;
       System.out.println(x + y);
       
       int z = 45;
       System.out.println(x + y + z);
       /*
       int a,b,c;
       a = 3;
       b = 6;
       c = 9;*/
                           
       int a = 3,b = 6, c = 9;
       System.out.println(a+b+c);
       
       
       final int minutosPorHora = 60;//seria una buen identificador
       
       int mph = 60;//Este seria otra opción validad para este identificador
       int m = 60;//Este no seria muy recomendado.
       
       int $num123;
       int $num;
       int _num123;
       int _num;
       int num123;
       int num;
       
       int myVariable;
       int myvariable;
                           
       byte myByte = 127;
       byte edad = 25;
       System.out.println(myByte);
       
       short myShort = 32767;
       System.out.println(myShort);
       
       int myInt = 2147483647;
       System.out.println(myInt);
       
       long myLong = 3542846896L;
       long myLong2 = 215496316L;
       long myLongR = myLong + myLong2;
       System.out.println(myLongR);
       
       float myFloat = 5.45f;
       System.out.println(myFloat);
       
       double myDouble = 19.99d;
       System.out.println(myDouble);
       
       boolean verdadero = true;
       boolean falso = false;
       System.out.println(verdadero);
       System.out.println(falso);
    }
}
