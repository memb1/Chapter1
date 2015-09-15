import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame {

    public ShowGridLayout() {
        setLayout(new GridLayout(3, 2));
        
        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Middle initial"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
        
        setTitle("ShowGridLayout");
        setSize(250, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ShowGridLayout frame = new ShowGridLayout();
    }
}
