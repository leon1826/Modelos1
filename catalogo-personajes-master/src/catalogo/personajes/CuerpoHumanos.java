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
 * @author Lindsey
 */
public class CuerpoHumanos extends Cuerpo {
    
    @Override
    public Cuerpo crearcuerpo() {
        return new CuerpoHumanos();
       }
    
    public CuerpoHumanos (){
        ImageIcon fot = new ImageIcon("imagenes/chumano.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        imagencuerpo.setIcon(icono);
        imagencuerpo.setLocation(200, 300);
    }
    
        
}
    

