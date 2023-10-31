package Visual;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class prueba extends JPanel implements ActionListener{
    final int PANEL_WIDTH = 600;
    final int PANEL_HEIGHT = 400;
    Image coke;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;

    prueba(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.black);
        coke = new ImageIcon("fanta.png").getImage();
        timer = new Timer(1000,null);
    }

    public void paint(Graphics g){
        Graphics2D g2D= (Graphics2D) g;
        g2D.drawImage(coke,x,y,null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
