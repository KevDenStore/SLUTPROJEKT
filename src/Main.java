import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Main {
    public static void main(String[] args) {


// sätter upp skärmen
        JFrame window = new JFrame("Cool Window");
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        window.add(panel);
        window.pack();

        window.setTitle("Kevans värld");
        window.setLocationRelativeTo(null);

    }

}