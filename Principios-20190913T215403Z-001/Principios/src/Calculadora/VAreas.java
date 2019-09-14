
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VAreas extends JFrame{
    Areas a = new Areas();
    
    public JPanel panel;
    private JTextField n1;
    private JTextField n2;
    private JButton botonC;
    private JButton botonR;
    private JButton botonCi;
    
    
    public VAreas(){
        iniciarComponentes();
        Numeros();
        DibujarBotones();
        acciones();
    }
    
    private void iniciarComponentes(){
        setSize(500, 500);
        setTitle("Operaciones Algebraicas");
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void Numeros(){
        n1 = new JTextField();
        n1.setBounds(100, 100, 50, 50);
        n2 = new JTextField();
        n2.setBounds(200, 100, 50, 50);
        panel.add(n1);
        panel.add(n2);
        
    }
    
    private void DibujarBotones(){
        botonC = new JButton();
        botonC.setText("Cuadrado");
        botonC.setBounds(10, 10, 100, 50);
        panel.add(botonC);
        
        botonR = new JButton();
        botonR.setText("Rectangulo");
        botonR.setBounds(120, 10, 100, 50);
        panel.add(botonR);
        
        botonCi = new JButton();
        botonCi.setText("Circulo");
        botonCi.setBounds(230, 10, 100, 50);
        panel.add(botonCi);
    }
    
    private void resultado(String re){
        JTextField resp = new JTextField();
        resp.setBounds(0, 300, 500, 100);
        resp.setText("resultado " + re);
        panel.add(resp);
    }
    
    
    public void acciones(){
        ActionListener Click = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                a.Cuadrado(num1, num2);
                String resps = Integer.toString((int) a.res);
                resultado(resps);
            }
        };
        botonC.addActionListener(Click);
         
        ActionListener Click1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                a.Rectangulo(num1, num2);
                String respr = Integer.toString((int) a.res);
                resultado(respr);
            }
        };
        botonR.addActionListener(Click1);
        
        ActionListener Click2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                a.Circulo(num1);
                String respm = Float.toString((float) a.res);
                resultado(respm);
            }
        };
        botonCi.addActionListener(Click2);
    }
}

