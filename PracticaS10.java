/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sv.edu.unab.practicas10;

/**
 *
 * @author Carba
 */
public class PracticaS10 {
    
    static void miMetodo(){
        System.out.println("Bienvenido de nuevo a clases");
    
    }
    
    //Metodo Estatico
    static void miMetodoStatic(){
        System.out.println("Metodo Estatico: Se puede llamar si la necesidad de crear un objeto");
    }
    
    //Metodo Publico
    public void miMetodoPublic(){
        System.out.println("Metodo Publico: Se puede llamar solo mediante la creación de un objeto");
    }

    
    public static void main(String[] args) {
      /*  //miMetodo();
        miMetodoStatic();
        //miMetodoPublic(); //Da error
        
        PracticaS10 miMetodoPublico = new PracticaS10();
        miMetodoPublico.miMetodoPublic();
        
        Vehiculo miCarro = new Vehiculo();
        miCarro.EnMarcha();
        miCarro.Velocidad(80);
        
        //Crear una instancia de la clase carro
        Carro miCar = new Carro();
        miCar.SonarBocina();
        
        System.out.println("La marca de mi carro es: "+miCar.Marca+" y su modelo es: "+miCar.modeloCarro);
        
        Perro miPerro = new Perro();
        
        miPerro.comer(); //estamos haciendo referencia a la clase base o superclase
        miPerro.sonido();//Este es de medoto de la clase derivada o subclase
        
        canario miCanario = new canario();
        miCanario.volar();
        miCanario.numPatas(2);
        miCanario.Tamaño(10);
      
        Animal miAnimal = new Animal();
        Animal miCerdo = new Cerdo();
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        
        miAnimal.SonidoAnimal();
        miCerdo.SonidoAnimal();
        miPerro.SonidoAnimal();
        
        miGato.SonidoAnimal();
        
        // empleado = new Empleado();
        Empleado[] empleado = new Empleado[2];
        empleado[0] = new Programador();
        empleado[1] = new Diseñador();
        
        for (Empleado e: empleado){
            e.trabajar();
        }*/
        
        ClaseExterna miExterna = new ClaseExterna();
        ClaseExterna.ClaseInterna miInterna = miExterna.new ClaseInterna();
        
        System.out.println(miExterna.x + miInterna.y);
        System.out.println(miInterna.miMetodoInterno());
        
       
      
      
      
    }
    
    
   
    
}
/*
class Vehiculo {
   public void EnMarcha(){
       System.out.println("El vehiculo esta en marcha");
   } 
   
   public void Velocidad(int veloz){
       System.out.println("El vehiculo va a: "+ veloz +" Kmh");
   }
}


class Automovil{
    protected String Marca = "Toyora";
    public void SonarBocina(){
        System.out.println("sonar la bocinas!");
    }
}

class Carro extends Automovil{
    public String modeloCarro = "centra";
     
}


class Animal {
    void comer(){
        System.out.println("El animal esta comiendo....");
    }
    void numPatas(int n){
        System.out.println("El numero de patas del animal es: "+n);
    }
}

class Perro extends Animal{
    void sonido(){
        System.out.println("El perro esta ladrando...");
    }
}

class Gato extends Animal{
    void cazar(){
        System.out.println("El Gato caza sus presas...");
    }
    
    void sonido(){
        System.out.println("El Gato mauya");
    }
}

class pajaro extends Animal{
    void volar(){
        System.out.println("El pajaro vuela");
    }
}

class canario extends pajaro{
    String color = "Amarillo";
    void Tamaño(double tamaño){
        System.out.println("El tamaño de el canario es: "+tamaño+" cm");
    }
}



class Animal{
    public void SonidoAnimal(){
        System.out.println("El animal hace un sonido");
    }
}


class Cerdo extends Animal{
    public void SonidoAnimal(){
        System.out.println("El Cerdo gruñe...");
    }

}


class Perro extends Animal{
    public void SonidoAnimal(){
        System.out.println("El perro ladra...");
    }
}

class Gato extends Animal{
    public void SonidoAnimal(){
        System.out.println("El Gato mauya...");
    }
}


class Empleado{
    void trabajar(){
        System.out.println("El empleado esta trabajando...");
    }

}


class Programador extends Empleado{
    void trabajar(){
        System.out.println("El programador esta programando");
    }

}

class Diseñador extends Empleado{
    void trabajar(){
        System.out.println("El diseñador esta Diseñando");
    }

}*/



class ClaseExterna{
    int x = 8;
    
    class ClaseInterna{
        int y = 4;
        public int miMetodoInterno(){
            return x;
        }
        
    }

}
