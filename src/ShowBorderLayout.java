import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.HeadlessException;

public class ShowBorderLayout extends JFrame {

    public ShowBorderLayout() {
        setLayout(new BorderLayout(5, 10));
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("West"), BorderLayout.WEST);
      //  add(new JButton("North"), BorderLayout.NORTH);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("Center"), BorderLayout.CENTER);
        
        setTitle("BorderLayout");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ShowBorderLayout();
    }
}
