package circle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import static java.lang.Math.sqrt;
import javax.swing.JPanel;

public class Lingkaran extends JPanel {
    BufferedImage gambar;
    int x, y, r;

    public Lingkaran(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
        CirclePolar(x, y, r);
    }

    public void CirclePolar(int xc, int yc, int r){
        gambar = new BufferedImage(300, 300, BufferedImage.TYPE_INT_ARGB);
        double x, y;
        for(double i = 1.0/r; i <= 2 * Math.PI; i += 1.0/r){
            y = yc + r * Math.sin(i);
            x = xc + r * Math.cos(i);
            gambar.setRGB((int) x, (int) y, Color.black.getRGB());
        }repaint();
    }
    
    public Dimension getPreferredSize() {
        return new Dimension(gambar.getWidth(), gambar.getHeight());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(gambar, null, null);
    }
}
