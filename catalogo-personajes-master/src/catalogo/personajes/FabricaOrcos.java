/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo.personajes;

import javax.swing.JPanel;

/**
 *
 * @author Leon1
 */
public class FabricaOrcos extends FabricaPersonajes {
    
    public JPanel panel;
    public ArmaOrcos ao;
    public EscudoOrcos eo;
    public CuerpoOrcos co;
    public FabricaOrcos(){
    }   


    @Override
    public Arma crearpersonaje() {
        return null;
    }

    @Override
    public Arma creararma() {
        ao = new ArmaOrcos();
        return ao;
    }

    @Override
    public Cuerpo crearcuerpo() {
        co = new CuerpoOrcos();
        return co;
    }

    @Override
    public Escudo crearescudo() {
        eo = new EscudoOrcos();
        return eo;
    }
    
}
