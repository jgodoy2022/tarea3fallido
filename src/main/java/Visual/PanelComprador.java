package Visual;

import javax.swing.*;

public class PanelComprador extends JPanel {
    private JButton thebutton;
    private JButton raulButton;
    public PanelComprador() {
        JLabel nombre  = new JLabel("Nombre");
        thebutton = new JButton("poki");
        raulButton=new JButton("raul");
        this.add(nombre);
        this.add(raulButton);
    }
}
