import javax.swing.JPanel;
import java.awt.*;

public class Panel extends JPanel{
//skärm variablarrrr
    final int originalPixelSize = 16; //16x16 pixlar
    final int scale = 3; //skalar den till nya monitorer annars för liten
    final int pixelSize = originalPixelSize * scale; //40x40 pixlar
    final int maxScreenCol = 20; //horizontell max rad
    final int maxScreenRow = 15; //vertikal max rad
    final int screenWidth = pixelSize * maxScreenCol;
    final int screenHeight = pixelSize * maxScreenRow;

    public Panel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //öka prestandan

    }


}
