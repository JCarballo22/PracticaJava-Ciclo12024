/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sv.edu.unab.practicas12;
import java.util.ArrayList;

/**
 *
 * @author Carba
 */
public class PracticaS12 {

    public static void main(String[] args) {
       
        
       /* Persona miPersona = new Persona();
        //miPersona.nombre = "Erick";
       // System.out.println(miPersona.nombre);
        miPersona.setNombre("Josue");
        System.out.println(miPersona.getNombre());
        miPersona.setNombre("Ronald");
        System.out.println(miPersona.getNombre());
        
        //Animal miAnimal = new Animal(); //da error
        
        Cerdo miCerdo = new Cerdo();//cree un objeto de clase cerdo
        miCerdo.SonidoAnimal();
        miCerdo.Dormir();
        miCerdo.correr();
        
        //Vegetales miVegetales = new Vegetales();
        
        Tomate miTomate = new Tomate();
        miTomate.Semilla();
        miTomate.cascara();
        miTomate.color();
        miTomate.PrimerMetodo();
        miTomate.SegundoMetodo();*/
       
       ArrayList<String> carros = new ArrayList<String>();
       carros.add("Toyota");
       carros.add("Nissan");
       carros.add("Honda");
       carros.add("Ford");
       carros.add("Mazda");
       System.out.println(carros);
       
        System.out.println(carros.get(3));
        
    }
    
    
}

class Persona{
        private String nombre; //private = restringir el acceso
        
        //Getter
        public String getNombre(){
            return nombre;
        }
        
        //Setter
        public void setNombre(String nuevoNom){
            this.nombre = nuevoNom;
        
        }
        
    }


abstract class Animal {
    //En el metodo Abstract no se puede el cuerpo del metodo
    public abstract void SonidoAnimal();
    public abstract void comer();
    
    public void Dormir(){
        System.out.println("El Animal esta durmiendo Zzz");
    }
    
    
}

class Cerdo extends Animal{
    String nombre;
    
    //En la clase que hereda es la que le dara la accion y cuerpo al metodo
    @Override
    public void SonidoAnimal(){
        System.out.println("El sonido del cerdo es: wee wee");
    }

    @Override
    public void comer() {
        System.out.println("El cerdo come de todo");
    }
    
    public void correr(){
        System.out.println("El Cerdo no corre mucho");
    } 
    
}

interface Vegetales{
    
    public void Semilla();
    public void cascara();
}


class Tomate implements Vegetales,PrimeroInterface,SegundaInterface{

    @Override
    public void Semilla() {
        System.out.println("El tomate posee semillas");
        System.out.println("Es opcional si las comes");
    }

    @Override
    public void cascara() {
        System.out.println("El tomate tiene una cascara comestible");
    }
    
    public void color(){
        System.out.println("El tomate es de color rojo ya maduro");
    }

    @Override
    public void PrimerMetodo() {
        System.out.println("Este metodo pertenece a la primera Interface");
    }

    @Override
    public void SegundoMetodo() {
        System.out.println("Este metodo pertenece a la segunda Interface");
    }


}

interface PrimeroInterface{
    public void PrimerMetodo();
}

interface SegundaInterface{
    public void SegundoMetodo();
}


