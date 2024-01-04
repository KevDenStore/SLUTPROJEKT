import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.swing.*;
import java.util.random;

public class Panel extends JPanel implements ActionListener{
//skärm variablarrrr
    private static final long serialVersionUID = 1L;

    static final int WIDTH = 400;
    static final int HEIGHT = 400;
    static final int UNIT_SIZE = 18;
    static final int NUMBER_OF_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);

    final int x [] = new int[NUMBER_OF_UNITS]; //håller x,y kordinater för kroppen av ormen
    final int y [] = new int[NUMBER_OF_UNITS];
    //ormens längd
    chardirection = "D";
    boolean running = false;
    Random random;
    Timer timer;
    int lenght = 5;
    int foodEaten;
    int foodX;
    int foodY;

    Panel() {
        random = new Random();
        this.set
    }
Thread gameThread;

    public Panel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //öka prestandan :)

    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(gameThread != null) {
            update();
            repaint(); //medans spelet kör så kallar loopen update->repaint->update->repaint->update->repaint->

        }

    }
    //updatering (ändringar konstant)
public void update() {

}
    public void paintComponent(Graphics g) { //för att rita in i panelen
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g; //graphics2d klassen extendar vanliga graphics klassen för mer sofistikerad kontrol över estetiken(2d har mer funktioner)
        g2.setColor ()
    }

}
