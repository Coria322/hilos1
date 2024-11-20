/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hilos2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author sonic
 */

public class Proceso1 extends Thread{
    JFrame ventana;
    JButton botones [];
    JPanel botonespane;
    int num;
    
    public Proceso1(String nombre){
        ventana = new JFrame();
        ventana.setSize(500,500);
        ventana.setTitle(nombre);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void componentes(){
        botones = new JButton[num];
        botonespane = new JPanel();
        botonespane.setLayout(new GridLayout(1, botones.length));
        
    }
    
    public void valores(int num){
        this.num = num;
    }
    
    @Override
    public void run(){
        componentes();
        
        
        for(int i = 0; i< num; i++){
            //Se crean los botones
            botones[i] = new JButton("Boton" + (i+1));
            botonespane.add(botones[i]);
        }
        ventana.add(botonespane);
        ventana.setVisible(true);
    }
    
    
}
