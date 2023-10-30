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
        this.add(new JButton("coca"));
        this.add(new JLabel("$1000"));
        this.add(new JButton("sprite"));
        this.add(new JLabel("$1000"));
        this.add(new JButton("fanta"));
        this.add(new JLabel("$1000"));
        this.add(new JButton("snickers"));
        this.add(new JLabel("$700"));
        this.add(new JButton("super8"));
        this.add(new JLabel("$500"));
    }
}
