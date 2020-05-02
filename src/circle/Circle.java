package circle;

import java.awt.Color;
import javax.swing.JFrame;

public class Circle {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        Lingkaran panel = new Lingkaran(150,150,100);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}
