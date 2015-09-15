
import java.awt.*;
import javax.swing.*;

public class TestImageIcon extends JFrame {

    private ImageIcon usIcon = new ImageIcon(getClass().getResource("images/us.gif"));
    private ImageIcon myIcon = new ImageIcon(getClass().getResource("images/my.jpg"));
    private ImageIcon frIcon = new ImageIcon(getClass().getResource("images/fr.gif"));
    private ImageIcon ukIcon = new ImageIcon(getClass().getResource("images/uk.gif"));
    
    public TestImageIcon() {
        setLayout(new GridLayout(1, 4, 5, 5));
        add(new JLabel(usIcon));
        add(new JLabel(myIcon));
        add(new JButton(frIcon));
        add(new JButton(ukIcon));
        
        setTitle("TestImageIcon");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TestImageIcon();
    }
}
