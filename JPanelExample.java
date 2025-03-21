import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JPanel Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout()); // Default layout

        // Add components to the panel
        panel.add(new JLabel("Enter Name:"));
        panel.add(new JTextField(10));
        panel.add(new JButton("Submit"));

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}
