import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author aggelos
 */
public class GUIHandler {

    public GUIHandler() {
        createSwingFrame();        
    }
    
    private void createSwingFrame() {
        JFrame frame = new JFrame();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        frame.setResizable(false);
        frame.setLocation(300, 300);
        frame.setSize(300, 200);
        frame.setTitle("Swing Frame Example");
        frame.getContentPane().setBackground(Color.CYAN);
        
        frame.setVisible(true);
    }
    
}
