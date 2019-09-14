
package catalogo.personajes;

import javax.swing.JLabel;

public abstract class Cuerpo {
    JLabel imagencuerpo = new JLabel();
    public abstract Cuerpo crearcuerpo();
    public JLabel devolver(){
        return imagencuerpo;
    }
    
}
