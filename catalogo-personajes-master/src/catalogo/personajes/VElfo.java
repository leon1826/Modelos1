/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public class VElfo extends JFrame {
    public JPanel panel;
    private FabricaPersonajes fabrica1;
    
    
    

    public VElfo() {
        fabrica1 = new FabricaElfos(); 
        iniciarComponentes();
        Mostrar();
        
    }

    private void iniciarComponentes() {
       setSize(1000, 1000);
        setTitle("Elfo");
        panel = new JPanel();
        panel.setBackground(Color.green);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel text=new JLabel();
        text.setText("Creacion Elfos");
        Font auxFont=text.getFont(); 
        text.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        text.setBounds(200, 0, 300, 100);
        panel.add(text);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    private void Mostrar() {
        System.out.println("entro");
        JLabel imagenarma = (fabrica1.creararma().devolver());
        JLabel imagencuerpo = (fabrica1.crearcuerpo().devolver());
        JLabel imagenescudo = (fabrica1.crearescudo().devolver());
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel texto1 = new JLabel();
        texto1.setText("ARMA");
        texto1.setBounds(100, 200, 100, 100);
        JLabel texto2 = new JLabel();
        texto2.setText("CUERPO");
        texto2.setBounds(300, 200, 100, 100);
        JLabel texto3 = new JLabel();
        texto3.setText("ESCUDO");
        texto3.setBounds(600, 200, 100, 100);
        imagencuerpo.setBounds(300, 300,300,100);
        imagenarma.setBounds(50, 300,300,100);
        imagenescudo.setBounds(550,300,500,500);
        panel.add(imagenarma);
        panel.add(imagencuerpo);
        panel.add(imagenescudo);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
    }
    
}
