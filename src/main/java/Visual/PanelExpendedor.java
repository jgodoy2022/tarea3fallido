package Visual;

import javax.swing.*;
import java.awt.*;
import javax.swing.ButtonGroup;

public class PanelExpendedor extends JPanel {
    private JRadioButton CocaButton;
    private JRadioButton SpriteButton;
    private JRadioButton FantaButton;
    private JPanel panel1;

    public PanelExpendedor() {
        CocaButton = new JRadioButton("CocaCola");
        SpriteButton = new JRadioButton("Sprite");
        FantaButton = new JRadioButton("Fanta");
    }

    public void paint(Graphics g){

    }
}