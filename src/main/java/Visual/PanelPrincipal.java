package Visual;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JFrame {
    private PanelComprador com;
    private PanelExpendedor exp;
    public PanelPrincipal () {
        exp = new PanelExpendedor ();
        com = new PanelComprador();
        this.setBackground(Color.white);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 800);

        this.add(com);
        this.add(exp);

        this.setVisible(true);
    }
    public void paint (Graphics g) { //todo se dibuja a partir de este método
        super.paint(g); //llama al método pint al que hace override en la super
//el de la super clase solo pinta el fondo (background)
        com.paint(g); //llama al metodo paint definido en el PanelComprador
        exp.paint(g); //llama al metodo paint definido en el PanelExpendedor
    }
}

