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
public class EscudoOrcos extends Escudo {

    @Override
    public Escudo Crearescudo() {
        return new EscudoOrcos();
    }
    
    public EscudoOrcos(){
        ImageIcon fot = new ImageIcon("imagenes/eorco.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        imagenescudo.setIcon(icono);
        imagenescudo.setLocation(500, 300);
    }
    
}
