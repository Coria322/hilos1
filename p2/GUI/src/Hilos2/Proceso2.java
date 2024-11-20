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
public class Proceso2 extends javax.swing.JFrame implements Runnable {

    JButton botones[];
    int num;
    JPanel panelbot;

    public Proceso2(String nombre, int num) {
        setTitle(nombre);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.num = num;
        Componentes();

    }

    private void Componentes() {
        botones = new JButton[num];
        panelbot = new JPanel();
        panelbot.setLayout(new GridLayout(1, num));

    }

    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            botones[i] = new JButton("Botones" + (i + 1));
            panelbot.add(botones[i]);
        }

        add(panelbot);
        setVisible(true);
    }

}
