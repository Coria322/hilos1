/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author sonic
 */
public class v2 extends JFrame {
     JLabel usuario, contraseña, hola;
    JButton nuevo, entrar;
    JTextField txus, txk;
    
    public v2(){
        setTitle("Ventana 2");
        setSize(500,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setResizable(false);
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        hola = new JLabel("HOLITA");
        hola.setBounds(100,20,100,30);
        
        usuario = new JLabel("Usuario 2");
        usuario.setBounds(50,50,100,30);
        
        txus = new JTextField();
        txus.setBounds(150,50,100,30);
        
        contraseña = new JLabel("Contraseña 2");
        contraseña.setBounds(50,100,100,30);
        
        txk = new JTextField();
        txk.setBounds(150,100,100,30);
        
        nuevo = new JButton("Nuevo 2");
        nuevo.setBounds(150,200,100,30);
        
        entrar = new JButton("Entrar 2");
        entrar.setBounds(50,200,100,30);
        
        add(hola);
        add(usuario);
        add(txus);
        add(contraseña);
        add(txk);
        add(nuevo);
        add(entrar);
    }

    
}

