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

        JLabel titleLabel = new JLabel("Minesweeper!", SwingConstants.CENTER);
        frame.add(titleLabel);

        JButton button = new JButton();
        BufferedImage buttonIcon = ImageIO.read(new File("images/button.png"));
        button = new JButton("", buttonIcon);

    }

    public static void main(String[] args) {
        createAndShowFrame();
    }

}