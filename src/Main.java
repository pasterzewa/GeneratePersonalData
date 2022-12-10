import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //new GUI();
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // setting up GUI
        frame.setMinimumSize(new Dimension(1000, 700));
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int x = (screenSize.width - frame.getWidth())/2;
        int y = (screenSize.height - frame.getHeight())/2;
        frame.setLocation(x, y);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(5, 5));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
}