/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import BDConexion.Conexion;
import Modelo.Trabajador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Carba
 */
public class TrabajadorControl {
    private Conexion conexion = new Conexion();
    
    public boolean agregarTrabajador(Trabajador trabajador) throws SQLException {
        boolean fueAgregado = false;
        Connection conn = conexion.Conectar();
        try{
            String sql = "insert into trabajador values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, trabajador.getDui());
            stmt.setString(2, trabajador.getNombre());
            stmt.setString(3, trabajador.getApellido());
            stmt.setInt(4, trabajador.getEdad());
            stmt.setString(5, trabajador.getCargo());
            stmt.setBoolean(6, trabajador.isGenero());
            stmt.setBoolean(7, trabajador.isEstadoCivil());
            
            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);
            
        }catch(Exception ex){
            System.out.println("Error al agregar trabajador "+ ex.getMessage());
        } finally{
            conn.close();
        }
        
        return fueAgregado;
        
        
    }
}
