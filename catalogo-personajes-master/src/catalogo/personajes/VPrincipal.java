
package catalogo.personajes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VPrincipal extends JFrame{
    public JPanel panel;
    
    
    public VPrincipal(){
        iniciarComponentes();
        Mostrar();
        Botones();
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    }
    
    private void iniciarComponentes(){
        setSize(600,600);
         
        setTitle("Catalogo de personajes");
        panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        this.getContentPane().add(panel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void Mostrar(){
        JLabel Pregunta = new JLabel();
        JLabel imagen = new JLabel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        Font auxFont=Pregunta.getFont(); 
        Pregunta.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 30));
        Pregunta.setBounds(100,10,600,300);
        Pregunta.setText("Que personaje desea crear?");
        panel.add(Pregunta);
    }
    
    private void Botones(){
        JButton Humanos = new JButton();
        Humanos.setText("Humanos");
        Humanos.setBounds(100, 300, 100,50 );
        panel.add(Humanos);
        ActionListener Click = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                VHumano vh = new VHumano();
                vh.setVisible(true);
                vh.setLocationRelativeTo(null);
 
            }
        };
        Humanos.addActionListener(Click);
        
        JButton Elfos = new JButton();
        Elfos.setText("Elfo");
        Elfos.setBounds(250, 400, 100,50 );
        panel.add(Elfos);
        ActionListener Click2 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                VElfo ve = new VElfo();
                ve.setVisible(true);
                ve.setLocationRelativeTo(null);
 
            }
        };
        Elfos.addActionListener(Click2);
        
        JButton Orcos = new JButton();
        Orcos.setText("Orco");
        Orcos.setBounds(400, 300, 100,50 );
        panel.add(Orcos);
        ActionListener Click3 = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                VOrco vo = new VOrco();
                vo.setVisible(true);
                vo.setLocationRelativeTo(null);
 
            }
        };
        Orcos.addActionListener(Click3);
//        JButton HombreLobos = new JButton();
//        HombreLobos.setText("Hombre Lobo");
//        panel.add(HombreLobos);
//        HombreLobos.setLocation(300, 300);
//        ActionListener Click4 = new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                VHlobo vl = new VHlobo(panel);
//                vl.setVisible(true);
//                vl.setLocationRelativeTo(null);
// 
//            }
//        };
//        HombreLobos.addActionListener(Click4);
    }

}
