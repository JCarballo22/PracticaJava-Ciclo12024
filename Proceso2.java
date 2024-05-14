/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sv.edu.unab.practicas14;

/**
 *
 * @author Carba
 */
public class Proceso2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<=7;i++){
            System.out.println("Proceso 2");
        }
    }
    
}
