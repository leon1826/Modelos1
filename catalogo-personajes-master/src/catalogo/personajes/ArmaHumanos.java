
package catalogo.personajes;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ArmaHumanos extends Arma {
    public ArmaHumanos CrearArma() {
        
        return new ArmaHumanos();
    }

    public ArmaHumanos(){
        ImageIcon fot = new ImageIcon("imagenes/ahumano.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        imagen.setIcon(icono);
        imagen.setLocation(100, 500);
    }
}

