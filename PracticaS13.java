package sv.edu.unab.practicas13;
import java.util.Scanner; //Importar la clase Scanner
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Carba
 */
public class PracticaS13 {

    public static void main(String[] args) {
        
        //miEntrada();
        //miFechaHora();
        //miListaEnlazada();
        //miHashMap();
        //miHashSet();
        miHashTable();
        
        
    }
    
    public static void miEntrada(){
        Scanner miEntrada = new Scanner(System.in); 
        System.out.println("Escribe su Nombre de usuario");
        
        String nombreUsuario = miEntrada.nextLine();
        System.out.println("Tu nombre de usuario: "+nombreUsuario);
        
        System.out.println("Escribe tu edad: ");
        int edadUsuario = miEntrada.nextInt();
        System.out.println("Escribe ¿cuanto ganas?");
        double salarioUsuario = miEntrada.nextDouble();
        
        System.out.println("Nombre: "+nombreUsuario);
        System.out.println("Edad: "+ edadUsuario);
        System.out.println("Salario: "+ salarioUsuario);
    }
    
    public static void miFechaHora(){
        LocalDate miFecha = LocalDate.now();
        System.out.println("La fecha actual es: "+ miFecha);
        
        LocalTime miHora = LocalTime.now();
        System.out.println("La Hora en este preciso momento es: "+miHora);
        
        LocalDateTime miFechaHora = LocalDateTime.now();
        System.out.println("La Fecha y hora actual es: "+miFechaHora);
        
        LocalDateTime miFH = LocalDateTime.now();
        System.out.println("La fecha antes del formato"+miFH);
        DateTimeFormatter miFormatoFH = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter miFFH = DateTimeFormatter.ofPattern("yyyy HH:mm");
        //DateTimeFormatter miFFH2 = DateTimeFormatter.ofPattern("yyyy HH:mm");
        
        String formatoFecha = miFH.format(miFormatoFH);
        String formatoF2 = miFH.format(miFFH);
        System.out.println("Mi nuevo formato de fecha es: "+formatoFecha);
        System.out.println("Tu nuevo formato de fecha es: "+formatoF2);
    
    }
    
    public static void miListaEnlazada(){
        LinkedList<String> carros = new LinkedList<String>();
        carros.add("Mercedes");
        carros.add("Mazda");
        carros.add("Hunda");
        carros.add("Honda");
        carros.add("Ferrari");
        
        System.out.println(carros);
        
        System.out.println("Seguna la posicion muestra su contenido: "+ carros.get(2));
        carros.set(2, "Tesla");
        
        System.out.println("ahora los elementos son: "+carros);
        
        carros.remove();
        System.out.println("El tamaño de la lista es: "+carros.size());
        //carros.clear();
        System.out.println("Ahora ya no hay elementos "+carros.size());
        
        
        carros.addFirst("Xiomi");
        System.out.println(carros);
        
        carros.addLast("Jeep");
        System.out.println(carros);
        
        carros.removeFirst();
        System.out.println(carros);
        
        carros.removeLast();
        System.out.println(carros);
        
        System.out.println(carros.getFirst());
        System.out.println(carros.getLast());
        
                
        
        
        
        
    
    }

    private static void miHashMap() {
        //creamos nuetro hashMap
        HashMap<String,String> paisCapital = new HashMap<String,String>();
        
        //vamos a agregar las llave y el valor de pais como de capital
        
        paisCapital.put("El Salvador", "San Salvador");
        paisCapital.put("Guatemala", "Guatemala");
        paisCapital.put("España", "Madrid");
        paisCapital.put("Mexico", "Mexico DF");
        paisCapital.put("USA", "Washinton");
        
        System.out.println(paisCapital);
        
        
        System.out.println(paisCapital.get("El Salvador"));
        
        paisCapital.remove("Guatemala");
        
        System.out.println(paisCapital);
        
        System.out.println(paisCapital.size());
        
        //paisCapital.clear();
        //System.out.println(paisCapital);
        
        //para imprimir las llaves o keys
        for (String i : paisCapital.keySet()){
            System.out.println("La llave es: "+i);
        }
        
        //para imprimir el valor 
        for (String i :  paisCapital.values()){
            System.out.println("El valor es: "+i);
        }
        
        for (String i : paisCapital.keySet()){
            System.out.println("la llave es: "+i+" y su valor es: "+paisCapital.get(i));
            
        }
        
        HashMap<String,Integer> persona = new HashMap<String,Integer>();
        
        persona.put("Jeser", 22);
        persona.put("Javier", 28);
        persona.put("Juan", 25);
        persona.put("David", 33);
        
        for (String i : persona.keySet()){
            System.out.println("clave: "+i+" y Valor: "+persona.get(i));
        
        }
        
        
    }
    
    private static void miHashSet(){
        HashSet<String> frutas = new HashSet<String>();
        
        frutas.add("Sandia");
        frutas.add("Piña");
        frutas.add("Uvas");
        frutas.add("Fresas");
        frutas.add("kiwi");
        
        System.out.println(frutas);
        
        System.out.println(frutas.contains("Pera"));
        System.out.println(frutas.contains("kiwi"));
        
        
        frutas.remove("kiwi");
        System.out.println(frutas);
        
        //frutas.clear();
        //System.out.println(frutas);
        System.out.println(frutas.size());
        
        for (String i : frutas){
            System.out.println(i);
        }
        
        HashSet<Double> numeros = new HashSet<Double>();
        
        numeros.add(7.7);
        numeros.add(1.0);
        numeros.add(55.5);
        numeros.add(12.4);
        
        for (double i = 1; i <= 10; i++){
            if(numeros.contains(i)){
                System.out.println(i+"Se encontro dentro de conjuntos");
            }else{
                System.out.println(i+"No se encotro dentro del conjunto");
            }
        
        }
        
    
    }
    
    private static void miHashTable(){
        Hashtable<Integer,String> tnombre = new Hashtable<Integer,String>();
        
        tnombre.put(846, "Willian Morales");
        tnombre.put(64, "Victor Monge");
        tnombre.put(1, "Juan Delgado");
        tnombre.put(1354, "Vladimir Villalobo");
        tnombre.put(11, "Oscar Rivas");
        
        System.out.println(tnombre.get(11));
        
        System.out.println(tnombre);
        
        System.out.println(tnombre.keySet());
        
        System.out.println(tnombre.size());
        
        System.out.println(tnombre.remove(64));
        
        System.out.println(tnombre);
        
        if(tnombre.containsValue("Vladimir Villalobo")){
            System.out.println("Si Existe");
        }else{
            System.out.println("No Existe");
        }
        
        for(int i : tnombre.keySet()){
            System.out.println(i);
            
            
        }
        
        for (String i : tnombre.values()){
            System.out.println(i);
        }
        
        for(int i : tnombre.keySet()){
            System.out.println(i);
            if (tnombre.containsKey(11)){
                System.out.println("si Existe");
            }else{
                System.out.println("No existe");
            }
            
        }
        
        for (String i : tnombre.values()){
            System.out.println(i);
            if (tnombre.containsValue("Juan Delgado")){
                System.out.println("si Existe");
            }else{
                System.out.println("No existe");
            }
        }
        
        
        
    
    }
    
    
}
