package Visual;

import javax.swing.*;
import java.awt.*;
import javax.swing.ButtonGroup;

public class PanelExpendedor extends JPanel {
    public PanelExpendedor(){
        this.setSize(600,400); //para que se inicie con un tamaño
        this.setBackground(Color.pink);
    }

    public void paint (Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(100,100,100,100); //o llamar a paint de objetos creados
    }
}