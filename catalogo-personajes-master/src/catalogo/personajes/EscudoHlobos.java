/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public class EscudoHlobos extends Escudo {

    public EscudoHlobos(JPanel panel) {
        JLabel img = new JLabel();
        JLabel text = new JLabel();
        ImageIcon fot = new ImageIcon("imagenes/ehlobo.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        img.setIcon(icono);
        img.setLocation(500,500);
        text.setText("Arma de lobo");
        text.setVisible(true);
        text.setBounds(300, 300, 200, 200);
        panel.add(img,text);
    }

    @Override
    public Escudo Crearescudo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
