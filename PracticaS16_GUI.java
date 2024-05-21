/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package sv.edu.unab.practicas16_gui;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Carba
 */
public class PracticaS16_GUI {

    public static void main(String[] args) {
        JFrame pantalla = new JFrame("Mi Primera Pantalla GUI");
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla.setSize(300,300);
        pantalla.setVisible(true);
        JButton btnPulsar = new JButton("Pulsar");
        JButton btnPulsar2 = new JButton("Pulsar2");
        pantalla.getContentPane().add(btnPulsar);
        pantalla.getContentPane().add(BorderLayout.SOUTH,btnPulsar2);
        
        MiGUI ventana = new MiGUI();
        JButton btnPresionar = new JButton("Presionar");
        ventana.setContentPane(btnPresionar);
        
        
                                
        
    }
}
