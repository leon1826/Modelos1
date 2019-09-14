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
class VHlobo extends JFrame{
    public JPanel panel;
    public VHlobo(JPanel panel){
        iniciarComponentes();
        Mostrar();
       
    }
    private void iniciarComponentes(){
        setSize(1000, 500);
        setTitle("Orco");
        panel = new JPanel();
        panel.setBackground(Color.lightGray);
        JLabel text=new JLabel();
        text.setText("Creacion Hombres Lobo");
        Font auxFont=text.getFont(); 
        text.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        text.setLocation(100,100);
        panel.add(text);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    private void Mostrar(){
//         AHlobos ahl = new AHlobos(panel);
//         EscudoHlobos eh = new EscudoHlobos(panel);
//         CuerpoHlobos ch = new CuerpoHlobos(panel);
//        
    }
    
}
