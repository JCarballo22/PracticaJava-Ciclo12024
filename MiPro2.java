
package sv.edu.unab.mipro2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carba
 */
public class MiPro2 {

    public static void main(String[] args) {
        /*System.out.println(4 + 8);
        System.out.println("8"+"4");
        
        int myInt = 9;
        double myDouble = myInt; //Esta conversion se realiza automaticamente
        
        System.out.println(myInt); //Salida sera 9
        System.out.println(myDouble); // Salida sera 9.0
        
        double myDouble2 = 14.36;
        int myInt2 = (int) myDouble2;
        
        System.out.println(myDouble2);
        System.out.println(myInt2); 
        
        int integerPrimitivo = 10;
        Integer integerObjeto = 10;
        
        double doublePrimitivo = 10.0d;
        Double doubleObjeto = 10.0d;
        
        boolean booleanPrimitivo = false;
        Boolean booleanObjeto = false;
        
        
        String numero = "99";
        
        byte numByte = Byte.parseByte(numero);
        short numShort = Short.parseShort(numero);
        int numInt = Integer.parseInt(numero);
        long numLong = Long.parseLong(numero);
        float numFloat = Float.parseFloat(numero);
        double numDouble = Double.parseDouble(numero);
        
        System.out.println(numByte);
        
        String cadena;
        
        byte numeroByte = 10;
        cadena = "@" + numeroByte;
        System.out.println(cadena);
        
        //Suma 
        int a = 2;
        int b = 3;
        int suma = a + b;
        System.out.println("La suma de "+ a + " y "+ b +" es: "+ suma);
        
        int sum1,sum2,sum3;
        sum1 = 100 + 50;
        sum2 = sum1 + 250;
        sum3 = sum2 + sum2;
        
        System.out.println(sum1);
        System.out.println(sum2);
        
        //Resta
        int x = 5;
        int y = 2;
        int resta = x - y;
        System.out.println("La diferencia entre "+x+ " y "+y+" es: "+resta);
        
        //Multiplicación
        int p = 4;
        int q = 3;
        int producto = p * q;
        System.out.println("El producto de "+p+" y "+q+" es: "+producto);
        
        //división 
        int m = 6;
        int n = 4;
        float division = m/n;
        System.out.println("El cociente de "+m+" y "+n+" es: "+division);
        
        //Mod o Modulo o residuo
        int r = 6;
        int s = 2;
        int modulo = r%s;
        System.out.println("El modulo de "+r+" y "+s+" es: "+modulo);
        
        int x =10;
        int k = 10;
        int h = 10;
        String mensaje = "Hola";
       // x = x + 5;
        x += 5;
        System.out.println(x);
        //x = x - 3;
        x -= 3;
        System.out.println(x);
        
        //x = x * 3;
        x *= 3;
        System.out.println(x);
        
        //x = x / 3;
        x /= 3;
        System.out.println(x);
        
        //x = x % 3;
        x %= 3;
        System.out.println(x);
        
        System.out.println(k);
        //k = k & 3;
        k &= 3;
        System.out.println(k);
        
        //k = k | 3;
        k |= 3;
        System.out.println(k);
        
        //h = h ^ 3;
        h ^= 3;
        System.out.println(h);
        
        //h = h << 3;
        h <<= 3;
        System.out.println(h);
        
        //h = h >> 3;
        h >>= 3; 
        System.out.println(h);
        
        int a = 5;
        int b = 7;
        
        boolean igual = (a==b);
        boolean noIgual = (a!=b);
        boolean mayorQue = (a > b);
        boolean mayorIgualQue = (a >= b);
        boolean menorQue = (a < b);
        boolean menorIgualQue = (a <= b);
        System.out.println(igual);
        System.out.println(noIgual);
        System.out.println(mayorQue);
        System.out.println(menorIgualQue);
        System.out.println(mayorIgualQue);
        System.out.println(menorQue);
        
        boolean x = true;
        boolean y = false;
        int a = 7;
        
        boolean andLogico = (x && y);
        boolean and2 = (a<5&&a<10);
        System.out.println(andLogico);
        System.out.println(and2);
        
        boolean orLogico = (x || y);
        boolean or2 = (a<5||a<10);
        System.out.println(orLogico);
        System.out.println(or2);
        
        boolean notLogico = !x;
        boolean not2 = !(a<5&&a<10);
        System.out.println(notLogico);
        System.out.println(not2);
        
        //Operadores de incremento y decremento
        
        int z = 5;
        z++;
        System.out.println("incremento "+z);
        
        int s = 5;
        s--;
        System.out.println("decremento "+s);
        
        int edad = 17;
        String mensaje = (edad>=18)?"Eres mayor de edad":"Eres menor de edad";
        System.out.println(mensaje);*/
        
        Scanner entrada = new Scanner(System.in);
        /*float valor;
        System.out.println("Ingresa un valor: ");
        valor = entrada.nextFloat();
        System.out.println("Tu numero ingresado es: "+valor);
        
        String cadena;
        System.out.println("Escribe un texto: ");
        cadena = entrada.nextLine();
        System.out.println("Tu numero ingresado es: "+cadena);
        
        char caracter;
        System.out.println("Escribe un texto: ");
        caracter = entrada.next().charAt(2);
        System.out.println("Tu numero ingresado es: "+caracter);*/
        
        String cadena = JOptionPane.showInputDialog("Ingresa algo");
        JOptionPane.showMessageDialog(null, cadena);
        
        
    }
}
