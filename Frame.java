import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class Frame extends JFrame {

    public Frame() {
        setContentPane(new JLabel(new ImageIcon("Dice-Images/Table.png")));
        add(new JLabel(""));
        // This acts like a refresh
        setSize(799,599);
        setSize(800,600);
        setVisible(true);
        setTitle("Greed Dice");

        ImageIcon logoicon = new ImageIcon("Dice-Images/Dicelogo.png");
        Image logo = logoicon.getImage();
        setIconImage(logo);

        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int width = getSize().width;
        int height = getSize().height;
        int x = (dim.width - width)/2;
        int y = (dim.height - height)/2;

        setLocation(x,y);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}