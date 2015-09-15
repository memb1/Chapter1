import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    private JButton jbtOK = new JButton("OK");
    
    public MyFrame() {
        super("Frame Title");
        add(jbtOK);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
   
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
