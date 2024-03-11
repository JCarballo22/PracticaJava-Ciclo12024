

package sv.edu.unab.mipro5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Carba
 */
public class MiPro5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        //Break podemos realizar saltos
        for (int i = 0;i<10;i++){
             if (i==4){
                 System.out.println("Se ejecuto el Break");
                 break;
             }
            System.out.println(i);
        }
        System.out.println("Estamos fuera del bucle For");
        
        //Estamos con metodo continue
        for(int i = 0;i<10; i++){
            if(i==4){
                System.out.println("Entramos al condicional y se ejecuto continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Estamos fuera del bucle ya finalizado");
        
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
            if(i==5){
                System.out.println("Se ejecuta el break");
                break;
            }
        }
        System.out.println("Salimos del while sin que este finalizara");
        
        int a = 0;
        while(a<10){
            System.out.println(a);
            a++;
            if(a==5){
                System.out.println("Se ejecuta el continue");
                continue;
            }
        }
        System.out.println("Salimos del while pero finalizo su recorrido");
        
        //String[] carros;
        String[] carros = {"Toyota","Honda","Mazda","Mercedez","Ford"};
       // carros[] = {"Toyota","Honda","Mazda","Mercedez","Ford"};
        System.out.println(carros[3]);
        carros[3] = "BMW";
        System.out.println(carros[3]);
        
        System.out.println(carros.length);
        
        for (int i = 0; i<carros.length;i++){
            //System.out.println(i);
            System.out.println(carros[i]);
        }
        
        for (String i:carros){
            System.out.println(i);
        }
        
                         //{{1,2,3,4},{5,6,7},{8,9,10,11,12},{13,14}};
        int[][] miNumero ={{88,22,1,4},{67,632,79},{1,2,3,4,5},{1,2,3,4,5},{4,4,4,4,4}};
        System.out.println(miNumero[3][4]);
        
        miNumero[4][1] = 8;
        System.out.println(miNumero[4][1]);
        
        for (int i = 0; i<miNumero.length;++i){
            for (int j = 0;j<miNumero[i].length;++j){
                System.out.println(miNumero[i][j]);
            }
        }
        
        //String[] carros;
        String[] carros = {"Toyota","Honda","Mazda","Mercedez","Ford"};
        String[][] carros2 = {{"Toyota","Honda","Mazda","Mercedez","Ford"},{"Rojo","Verde","Azul"}};
        System.out.println(carros2[1][1]);
        int n = carros.length;
        carros = Arrays.copyOf(carros, n+1);
        carros[n] = "hola";
        
        System.out.println(carros[5]);
        
        for (int i = 0;i<carros.length;++i){
            for(int j = 0;j<carros[i].length;++j){
                System.out.println(carros[i][j]);
            }
        
        }
        
       
        miMetodo();
        miMetodo();
        miMetodo();
        
        miNuevoMetodo("Antonio",7);
        miNuevoMetodo("Andrea",9);
        miNuevoMetodo("Josue",5);
        
        
        System.out.println(miOtroMetodo(6,"hola",3.3));
        
        int z = miOtroMetodo2(5,6);
        System.out.println(z);*/
        
        RevisarEdad(19);
        
        
    }
    
    static void miMetodo(){
        //Se ejecutara el codigo.
        int x,y;
        x = 9;
        y = 4;
        
        int resul = x - y;
           
        System.out.println("Hola estudiantes se les saluda desde el metodo");
    }
    
    static void miNuevoMetodo(String nombre, int num){
        System.out.println("El nombre de usuario utilizado es: "+nombre+" Un gusto "+num);
    }
    
    static int miOtroMetodo(int num,String nom,double nume){
        //int x = num + 5;
       // return x;
        return num;
        
    }
    
    static int miOtroMetodo2(int x,int y){
        int s = x + y;
       return s;
       // return x * y;
    }
    
    static void RevisarEdad(int edad){
        if(edad<18){
            System.out.println("Acceso denegado por no tener la mayoria de edad "+ edad);
        }else{
            System.out.println("Acceso consedido, por se mayor de edad "+ edad);
        }
            
    }
    
    
    
}
