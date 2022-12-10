import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// chyba do usunięcia?
public class GUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JLabel label;
    public GUI(){
        this.frame = new JFrame();
        JButton button = new JButton("Click me");
        this.label = new JLabel("Number of clicks: 0");
        JPanel panel = new JPanel();

        frame.setMinimumSize(new Dimension(300, 300));
        button.addActionListener(this);
        button.setMinimumSize(new Dimension(50, 50));

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
