import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {

        /* skärminställningar */
        JFrame window = new JFrame("Cool Window");
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel panel = new Panel();
        window.add(panel);
        window.pack();

        window.setTitle("Kevans värld");
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        Panel.startGameThread();

    }

}