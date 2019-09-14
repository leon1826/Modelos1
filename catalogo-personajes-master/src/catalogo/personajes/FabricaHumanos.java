
package catalogo.personajes;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FabricaHumanos extends FabricaPersonajes {
    public JPanel panel;
    public ArmaHumanos ah;
    public EscudoHumanos eh;
    public CuerpoHumanos ch;
    public FabricaHumanos (){
    }
    
//    public void iniciarComponentes(){
//        panel.setSize(1000, 500);
//        panel.setTitle("Orco");
//        panel = new JPanel();
//        panel.setBackground(Color.lightGray);
//        JLabel text=new JLabel();
//        text.setText("Creacion Hombres Lobo");
//        Font auxFont=text.getFont(); 
//        text.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
//        text.setLocation(100,100);
//        panel.add(text);
//        this.getContentPane().add(panel);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//    private void Mostrar(){
//         AHlobos ahl = new AHlobos(panel);
//         EscudoHlobos eh = new EscudoHlobos(panel);
//         CuerpoHlobos ch = new CuerpoHlobos(panel);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public Arma crearpersonaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Arma creararma() {
        ah = new ArmaHumanos();
        return ah;
        }

    @Override
    public Cuerpo crearcuerpo() {
        ch = new CuerpoHumanos();
        return ch;
    }

    @Override
    public Escudo crearescudo() {
        eh = new EscudoHumanos();
        return eh;
    }
}


