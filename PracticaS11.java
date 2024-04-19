/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sv.edu.unab.practicas11;

/**
 *
 * @author Carba
 */
public class PracticaS11  {
    int x;
    final int a = 10;
    final double PI = 3.14;
    
    static void miMetodoStatico(){
        System.out.println("No se necesita crear un objeto");
    }
    
    public void miMetodoPublico(){
        System.out.println("Se es necesario crear un objeto");
    }
    
    //Se crea el constructor de la clase practicaS11
    public PracticaS11(){
        x = 8;
    }
    
    public PracticaS11(int y){
       
         
         x = y;
    }
    
    public PracticaS11(int y,int z){
        x = y * z;
    }

    public static void main(String[] args) {
       /*PracticaS11 miObjeto = new PracticaS11(7,4);
       PracticaS11 miObjeto1 = new PracticaS11();
       PracticaS11 miObjeto2 = new PracticaS11(7);
       System.out.println(miObjeto.x);
       System.out.println(miObjeto1.x);
       System.out.println(miObjeto2.x);*/
       
       PracticaS11 miO = new PracticaS11();
       //miO.a = 15;
       //miO.PI = 3.16;
       
       miMetodoStatico();
       miO.miMetodoPublico();
       
       Estudiante alumno = new Estudiante();
       
        System.out.println("Su nombre: "+alumno.nombre);
        System.out.println("Su edad: "+ alumno.edad);
        System.out.println("su año de graduacion es: "+ alumno.añoGraduacion);
        alumno.Estudio();
        
        Persona miPersona = new Persona();
        miPersona.setNombre("Carlos");
        System.out.println(miPersona.getNombre());
       
    }
    
    
    
}

    class Persona{
        private String nombre;

        //Getter
        public String getNombre(){
            return nombre;

        }

        //Setter
        public void setNombre(String nuevoNombre){
            this.nombre = nuevoNombre;
        }
    }

abstract class MiClaseAbstracta{
    public String nombre= "Andrea";
    public int edad = 23;
    public abstract void Estudio();
    
}

class Estudiante extends MiClaseAbstracta{
    public int añoGraduacion = 2026;
    public void Estudio(){
        System.out.println("Estudio todos los días");
    }

    

}





