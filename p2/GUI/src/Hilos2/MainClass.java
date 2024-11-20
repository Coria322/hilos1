/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sonic
 */
public class MainClass {
    
    public void Hilos(){
        //inicializar hilo (Primer estado)
        //Instancias de hilo 1
        Proceso1 hilo1 = new Proceso1("hilo1");
        Proceso1 hilo2 = new Proceso1("hilo2");
    
        //instancia hilo 2
        Thread hilo3 = new Thread(new Proceso2("hilo3",10));
        Thread hilo4 = new Thread(new Proceso2("hilo4", 12));
        
        hilo1.valores(3);
        hilo2.valores(4);
        
        //Arranque (2do estado)
        hilo1.start();
        //Bloqueo (3er estado, se bloquea por 1000 milisegundos)
        try {
            hilo1.sleep(1000);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "error en el hilo 1");
        }
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
    
    public static void main(String [] args){
        MainClass mainclass = new MainClass();
        mainclass.Hilos();
    }
}
