
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class TestFont extends JFrame {

    public TestFont() {
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();

        setLayout(new FlowLayout());
        JButton[] buttonArray = new JButton[fontNames.length];

        add(new JLabel("Total fonts: " + fontNames.length));

        for (int i = 0; i < fontNames.length; ++i) {
            buttonArray[i] = new JButton((i + 1) + ". " + fontNames[i]);
            if (i % 2 == 0) {
                buttonArray[i].setFont(new Font(fontNames[i], Font.BOLD, 16));
            } else {
                buttonArray[i].setFont(new Font(fontNames[i], Font.BOLD + Font.ITALIC, 12));
            }
            add(buttonArray[i]);
        }
        
        setTitle("TestFont");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 800);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestFont();
    }
}
