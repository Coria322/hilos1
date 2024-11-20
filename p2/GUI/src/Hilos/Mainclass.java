/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos;

/**
 *
 * @author sonic
 */
public class Mainclass {
    
    public void hilos(){
        //Instancia de proceso 1
        Proceso1 hilo1 = new Proceso1();   
        
        //Instancia de thread que invoca a Proceso2
        Thread hilo2 = new Thread(new Proceso2());
        
        //Ejecutar los hilos
        hilo1.start();
        hilo2.start();
    }
    
    public static void main (String [] args){
        Mainclass principal = new Mainclass();
        principal.hilos();
    }
}
