
package interfacesgraficas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Grafica extends JFrame implements ActionListener{
    JButton boton1,boton2;
    ArrayList<JButton> botones = new ArrayList<>();
    public Grafica(){
        this.setLayout(null);
        this.setBounds(20, 20, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        boton1 = new JButton();
        boton1.setText("Pulsar");
        boton1.setBounds(150,100,100,40);
        boton1.setVisible(true);
        this.add(boton1);
        boton1.addActionListener(this);
        boton2 = new JButton();
        boton2.setText("No pulsar");
        boton2.setBounds(150,50,100,40);
        boton2.setVisible(true);
        this.add(boton2);
        boton2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==boton1){
            for(int i=1;i<=5;i++){
                JButton boton = new JButton();
                boton.setBounds(30*i, 60*i,100,40);
                boton.setText("Boton "+i);
                boton.setVisible(true);add(boton);boton.addActionListener(this);botones.add(boton);
            }
            repaint();
        }
        if(e.getSource()==boton2){
            System.out.println("NO PULSE EL BOTON");
        }
    }
}
