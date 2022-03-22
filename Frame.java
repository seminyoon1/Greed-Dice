import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frame {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
        frame.setTitle("Greed Dice");

        ImageIcon logoicon = new ImageIcon("Dice5.png");
        Image logo = logoicon.getImage();
        
    }
}