/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class v1 extends JFrame{
    JLabel usuario, contraseña;
    JButton nuevo, entrar;
    JTextField txus, txk;
    
    public v1(){
        setTitle("Ventana 1");
        setSize(500,600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        componentes();
        setVisible(true);
    }
    
    public void componentes(){
        usuario = new JLabel("Usuario");
        usuario.setBounds(50,50,100,30);
        
        txus = new JTextField();
        txus.setBounds(150,50,100,30);
        
        contraseña = new JLabel("Contraseña");
        contraseña.setBounds(50,100,100,30);
        
        txk = new JTextField();
        txk.setBounds(150,100,100,30);
        
        nuevo = new JButton("Nuevo");
        nuevo.setBounds(150,200,100,30);
        
        entrar = new JButton("Entrar");
        entrar.setBounds(50,200,100,30);
       
        
        add(usuario);
        add(txus);
        add(contraseña);
        add(txk);
        add(nuevo);
        add(entrar);
    }
    
}
