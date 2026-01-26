import javax.swing.*;
import java.awt.*;

public class IndianFlag extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Flag dimensions
        int x = 100;
        int y = 50;
        int width = 450;
        int height = 90;

        // Saffron
        g.setColor(new Color(255, 153, 51));
        g.fillRect(x, y, width, height);

        // White
        g.setColor(Color.WHITE);
        g.fillRect(x, y + height, width, height);

        // Green
        g.setColor(new Color(19, 136, 8));
        g.fillRect(x, y + 2 * height, width, height);

        // Ashoka Chakra
        g.setColor(Color.BLUE);
        int chakraX = x + width / 2 - 45;
        int chakraY = y + height + 10;
        g.drawOval(chakraX, chakraY, 90, 90);

        // 24 spokes
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15);
            int cx = x + width / 2;
            int cy = y + height + 55;

            int x2 = (int) (cx + 45 * Math.cos(angle));
            int y2 = (int) (cy + 45 * Math.sin(angle));

            g.drawLine(cx, cy, x2, y2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Indian Flag 🇮🇳");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new IndianFlag());
        frame.setVisible(true);
    }
}
