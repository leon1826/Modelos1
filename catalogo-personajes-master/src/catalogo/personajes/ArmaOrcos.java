/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import java.awt.Image;
import java.util.Locale;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public class ArmaOrcos extends Arma {

    @Override
    public Arma CrearArma() {
        return new ArmaOrcos();
    }
     public ArmaOrcos(){
        ImageIcon fot = new ImageIcon("imagenes/aorco.jpg");
        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT));
        imagen.setIcon(icono);
        imagen.setLocation(100, 500);
    }

  
}
