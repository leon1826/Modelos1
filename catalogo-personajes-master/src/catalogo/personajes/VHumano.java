
package catalogo.personajes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VHumano extends JFrame{
    public JPanel panel;
    private FabricaPersonajes fabrica1;
     
    public VHumano(){
        fabrica1 = new FabricaHumanos();    
        iniciarComponentes();
        Mostrar();
        
    }
    private void iniciarComponentes(){
        setSize(1000, 1000);
        setTitle("Humano");
        panel = new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel text=new JLabel();
        text.setText("Creacion Humanos");
        Font auxFont=text.getFont(); 
        text.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        text.setBounds(250,10,300,100);
        panel.add(text);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    private void Mostrar(){
        System.out.println("entro");
        JLabel imagenarma = (fabrica1.creararma().devolver());
        JLabel imagencuerpo = (fabrica1.crearcuerpo().devolver());
        JLabel imagenescudo = (fabrica1.crearescudo().devolver());
        panel.setLayout(null);
        this.getContentPane().add(panel);
        JLabel texto1 = new JLabel();
        texto1.setText("ARMA");
        texto1.setBounds(100, 100, 100, 100);
        JLabel texto2 = new JLabel();
        texto2.setText("CUERPO");
        texto2.setBounds(300, 100, 100, 100);
        JLabel texto3 = new JLabel();
        texto3.setText("ESCUDO");
        texto3.setBounds(500, 100, 100, 100);
        imagencuerpo.setBounds(300, 300,300,100);
        imagenarma.setBounds(50, 300,300,100);
        imagenescudo.setBounds(550,100,500,500);
        panel.add(imagenarma);
        panel.add(imagencuerpo);
        panel.add(imagenescudo);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        
    }
}
