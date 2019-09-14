
package catalogo.personajes;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class Arma {
    public JLabel imagen = new JLabel();
    public abstract Arma CrearArma(); 
    public JLabel devolver(){
        return imagen;
    }
}
