package Visual;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class PanelComprador extends JPanel {
    private JButton thebutton;
    private JButton raulButton;
    public PanelComprador() {
        this.setBackground(Color.pink);
        this.setLayout(new GridLayout(5,2));
        JButton coca = new JButton("CocaCola");
        JLabel precioCoca = new JLabel("        $1000");
        JButton sprite = new JButton("Sprite");
        JLabel precioSprite = new JLabel("       $1000");
        JButton fanta = new JButton("Fanta");
        JLabel precioFanta = new JLabel("       $1000");
        JButton snickers = new JButton("Snickers");
        JLabel precioSnickers = new JLabel("        $700");
        JButton super8 = new JButton("Super8");
        JLabel precioSuper8 = new JLabel("        $500");
        this.add(coca);
        this.add(precioCoca);
        this.add(sprite);
        this.add(precioSprite);
        this.add(fanta);
        this.add(precioFanta);
        this.add(snickers);
        this.add(precioSnickers);
        this.add(super8);
        this.add(precioSuper8);
    }
}
