import javax.swing.*;

public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame(); // creating an instance of JFrame
        JButton jButton=new JButton("Click Me");// adding an instance of JButton
        jButton.setBounds(130,100,100,40);
        jFrame.add(jButton);
        jFrame.setSize(400,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
