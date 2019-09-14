package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VAlgebraica extends JFrame{
    Algrebraica a = new Algrebraica();
    
    public JPanel panel;
    private JTextField n1;
    private JTextField n2;
    private JButton botonS;
    private JButton botonR;
    private JButton botonM;
    private JButton botonD;
    
    
    public VAlgebraica(){
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
        botonS = new JButton();
        botonS.setText("Suma");
        botonS.setBounds(10, 10, 100, 50);
        panel.add(botonS);
        
        botonR = new JButton();
        botonR.setText("Resta");
        botonR.setBounds(120, 10, 100, 50);
        panel.add(botonR);
        
        botonM = new JButton();
        botonM.setText("Multiplicacion");
        botonM.setBounds(230, 10, 140, 50);
        panel.add(botonM);
        
        botonD = new JButton();
        botonD.setText("Division");
        botonD.setBounds(380, 10, 100, 50);
        panel.add(botonD);
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
                a.Suma(num1, num2);
                String resps = Integer.toString((int) a.res);
                resultado(resps);
            }
        };
        botonS.addActionListener(Click);
         
        ActionListener Click1 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                int num1= Integer.parseInt(n1.getText());
                int num2= Integer.parseInt(n2.getText());
                a.Resta(num1, num2);
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
                a.Multiplicacion(num1, num2);
                String respm = Integer.toString((int) a.res);
                resultado(respm);
            }
        };
        botonM.addActionListener(Click2);
        
        ActionListener Click3;
        Click3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                float num1=  Float.parseFloat(n1.getText());
                float num2= Float.parseFloat(n2.getText());
                a.Division(num1, num2);
                String respd = Float.toString((float) a.res);
                resultado(respd);
            }
        };
        botonD.addActionListener(Click3);
    }
}
