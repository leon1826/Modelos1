
package catalogo.personajes;

import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public abstract class FabricaPersonajes {
//   JPanel j;
//
//    public FabricaPersonajes() {
//        this.j = new JPanel();
//    }
   public abstract Arma crearpersonaje();
   public abstract Arma creararma();
   public abstract Cuerpo crearcuerpo();
   public abstract Escudo crearescudo();
   
}
