
package catalogo.personajes;

import javax.swing.JLabel;


public abstract class Escudo {
    JLabel imagenescudo = new JLabel();
    public abstract Escudo Crearescudo(); 
     public JLabel devolver(){
        return imagenescudo;
    }
}

    
