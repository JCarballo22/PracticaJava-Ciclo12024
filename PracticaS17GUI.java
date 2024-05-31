/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicas17gui;
import java.sql.Connection;
import BDConexion.Conexion;
import Modelo.Trabajador;
import Controlador.TrabajadorControl;
import java.sql.SQLException;
/**
 *
 * @author Carba
 */
public class PracticaS17GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion();
        con.Conectar();
        
        Trabajador t = new Trabajador("489561461","Andrea","Murcia",21,"Administrador",false,false);
        TrabajadorControl tControl = new TrabajadorControl();
        
        try{
            if(tControl.agregarTrabajador(t)){
                System.out.println("Agregado");
            }else{
                System.out.println("Ha ocurrido un Error al agregar");
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
