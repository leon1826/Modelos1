/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Leon1
 */
class Vvolumen extends JFrame {
    Volumenes v = new Volumenes();
    public JPanel panel;
    private JTextField n1;
    private JTextField n2;
    private JButton botonCubo;
    private JButton botonPrisma;
    private JButton botonEsfera;
    
    public Vvolumen(){
        iniciar();
        Numeros();
        DibujarBotonos();
        acciones();
        
    }

    private void iniciar() {
        setSize(500,500);
        setTitle("Volumen");
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        
        
    }

    private void Numeros() {
        n1 = new JTextField();
        n1.setBounds(100, 100, 50, 50);
        n2 = new JTextField();
        n2.setBounds(200, 100, 50, 50);
        panel.add(n1);
        panel.add(n2);
    }

    private void DibujarBotonos() {
        botonCubo = new JButton();
        botonCubo.setText("Cubo");
        botonCubo.setBounds(10, 10, 100, 50);
        panel.add(botonCubo);
        
        botonPrisma = new JButton();
        botonPrisma.setText("Prisma");
        botonPrisma.setBounds(120, 10, 100, 50);
        panel.add(botonPrisma);
        
        botonEsfera = new JButton();
        botonEsfera.setText("Esfera");
        botonEsfera.setBounds(230, 10, 100, 50);
        panel.add(botonEsfera);
        
    }
    
        private void resultado(String re){
        JTextField resp = new JTextField();
        resp.setBounds(0, 300, 500, 100);
        resp.setText("resultado " + re);
        panel.add(resp);
    }

    private void acciones() {
        ActionListener Click = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                n2.setVisible(false);
                JLabel mensaje= new JLabel();
                mensaje.setText("Solo toma el primer termino");
                mensaje.setBounds(100, 200, 100 , 100);
                panel.add(mensaje);
                int num1= Integer.parseInt(n1.getText());
                v.Cubo(num1);
                String resps = Integer.toString((int) v.res);
                resultado(resps);
            }
        };
        botonCubo.addActionListener(Click);
         
        ActionListener Click1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                v.Prisma(num1, num2, num1);
                String respr = Integer.toString((int) v.res);
                resultado(respr);
            }
        };
        botonPrisma.addActionListener(Click1);
        
        ActionListener Click2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                v.Esfera(num1);
                String respm = Float.toString((float) v.res);
                resultado(respm);
            }
        };
        botonEsfera.addActionListener(Click2);
    }
    }
    
    
    
 
