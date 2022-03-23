import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;

public class GreedStart extends JFrame {
    private JButton newButton;
    private JLabel label;
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JLabel label4 = new JLabel();
    JLabel label5 = new JLabel();
    JLabel label6 = new JLabel();
    JLabel textScore = new JLabel();
    Frame frame = new Frame();

    public GreedStart() {

        int[] dices = (GreedRandomizer.getDices());
        int score = GreedCalculator.greedy(dices); 

        newButton = new JButton("Roll");
	    newButton.setBounds(340,460,100,50);

        label = new JLabel();
        label.setBounds(100,150,150,20);

        frame.add(newButton);
        frame.add(label);
        frame.setVisible(true);

        ClickListener click= new ClickListener();
        newButton.addActionListener(click);
                
        textScore.setText("Your Greed Dice score is: " + score);
        textScore.setBounds(300, 150, 300, 100);
        frame.getContentPane().add(textScore);
    }

    class ClickListener implements ActionListener {

        // It was at this point I realized, that the single thread nature would haunt me every time
        // I thought I could make something cool with Java Swing. 
        public void actionPerformed(ActionEvent e) {
            int[] dices = (GreedRandomizer.getDices());
            int score = GreedCalculator.greedy(dices);

            if (e.getSource() == newButton) {

                textScore.setText("Your Greed Dice score is: " + score);
                textScore.setBounds(300, 150, 300, 100);
                frame.getContentPane().add(textScore);

                for(int i = 0; i < dices.length; i++) {
                    if(i == 0) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label1.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label1.getPreferredSize(); //Gets the size of the image
                        label1.setBounds(170, 300, size.width, size.height);
                        frame.getContentPane().add(label1);
                    }
                    if(i == 1) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label2.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label2.getPreferredSize(); //Gets the size of the image
                        label2.setBounds(240, 300, size.width, size.height);
                        frame.getContentPane().add(label2);
                    }
                    if(i == 2) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label3.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label3.getPreferredSize(); //Gets the size of the image
                        label3.setBounds(310, 300, size.width, size.height);
                        frame.getContentPane().add(label3);
                    }
                    if(i == 3) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label4.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label4.getPreferredSize(); //Gets the size of the image
                        label4.setBounds(380, 300, size.width, size.height);
                        frame.getContentPane().add(label4);
                    }
                    if(i == 4) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label5.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label5.getPreferredSize(); //Gets the size of the image
                        label5.setBounds(450, 300, size.width, size.height);
                        frame.getContentPane().add(label5);
                    }
                    if(i == 5) {
                        String diceNum = ("Dice-Images/Dice" + Integer.toString(dices[i]) + ".png");
                        label6.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(diceNum)).getImage().getScaledInstance(60, 60, 1)));
                        Dimension size = label6.getPreferredSize(); //Gets the size of the image
                        label6.setBounds(520, 300, size.width, size.height);
                        frame.getContentPane().add(label6);
                    }
                } 

                frame.setSize(799,599);
                frame.setSize(800,600);
            }
        }
    }
    
}
