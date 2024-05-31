/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Carba
 */
public class Trabajador {
    private String dui;
    private String nombre;
    private String apellido;
    private int edad;
    private String Cargo;
    private boolean genero;
    private boolean estadoCivil;
    
    public Trabajador(){
    }

    public Trabajador(String dui, String nombre, String apellido, int edad, String Cargo, boolean genero, boolean estadoCivil) {
        this.setDui(dui);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setCargo(Cargo);
        this.setGenero(genero);
        this.setEstadoCivil(estadoCivil);
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "dui=" + dui + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", Cargo=" + Cargo + ", genero=" + genero + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
    
}
