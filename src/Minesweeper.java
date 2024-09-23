import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Minesweeper extends App {

    App Minesweeper = new App();

    public static void createAndShowFrame() {
    //initialize minesweeper frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("Minesweeper!");
        frame.setSize(400,400);

        //add title text
        JLabel titleLabel = new JLabel("Minesweeper!", SwingConstants.CENTER);
        frame.add(titleLabel);

        //generate button
        Icon buttonIcon = new ImageIcon("images/button.png");
        JButton button = new JButton("", buttonIcon);
        button.setSize(32, 32);
        frame.add(button);

    }

    public static void main(String[] args) {
        createAndShowFrame();
    }

}