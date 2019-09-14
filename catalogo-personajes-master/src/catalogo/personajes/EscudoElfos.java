
package catalogo.personajes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Lindsey
 */
public class EscudoElfos extends Escudo{
    
    @Override
    public Escudo Crearescudo() {
        return new EscudoElfos();
    }
    
    public EscudoElfos(){
        ImageIcon fot = new ImageIcon("imagenes/eelfo.png");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        imagenescudo.setIcon(icono);
        imagenescudo.setLocation(500, 300);
        
    }

    
}
