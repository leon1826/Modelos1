
package catalogo.personajes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EscudoHumanos extends Escudo {
    
    @Override
    public Escudo Crearescudo() {
        return new EscudoHumanos();
    }
    
    public EscudoHumanos(){
        ImageIcon fot = new ImageIcon("imagenes/ehumano.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        imagenescudo.setIcon(icono);
        imagenescudo.setLocation(500, 300);
    }


    
}
