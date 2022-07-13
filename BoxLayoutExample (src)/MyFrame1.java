import java.awt.Button;
import java.awt.Frame;
import javax.swing.BoxLayout;

/**
 *
 * @author aggelos
 */
public class MyFrame1 extends Frame {
    
    Button buttons[];

    public MyFrame1() {
    }
    
    public void prepareUI() {        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));       
        
        buttons = new Button[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            this.add(buttons[i]);
        }
        
        this.setSize(400, 400);
        this.setVisible(true);
    }
    
}
