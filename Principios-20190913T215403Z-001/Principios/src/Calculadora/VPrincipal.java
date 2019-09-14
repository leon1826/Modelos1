
package Calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VPrincipal extends JFrame{
    public JPanel panel;
    public VPrincipal(){
        iniciarComponentes();
        DibujarBotones();
    }
    
    private void iniciarComponentes(){
        setSize(800, 500);
        setTitle("Calculadora");
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel text=new JLabel();
        text.setText("CALCULADORA");
        text.setBounds(275, 50, 300, 200);
        panel.add(text);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void DibujarBotones(){
        JButton botonO = new JButton();
        botonO.setText("Operaciones Algebraicas");
        botonO.setBounds(50, 200, 200, 50);
        panel.add(botonO);
        ActionListener Click = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                VAlgebraica va = new VAlgebraica();
                va.setVisible(true);
 
            }
        };
        botonO.addActionListener(Click);
        
        JButton botonA = new JButton();
        botonA.setText("Area de figuras");
        botonA.setBounds(220, 350, 200, 50);
        panel.add(botonA);
        panel.add(botonO);
        ActionListener Click1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                VAreas var = new VAreas();
                var.setVisible(true);
 
            }
        };
        botonA.addActionListener(Click1);
        
        JButton botonV = new JButton();
        botonV.setText("Volumen figuras");
        botonV.setBounds(400, 200, 200, 50);
        panel.add(botonV);
        ActionListener ClickV = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Vvolumen vol = new Vvolumen();
                vol.setVisible(true);
         }
        };
        botonV.addActionListener(ClickV);
    }
}
