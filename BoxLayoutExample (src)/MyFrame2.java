import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aggelos
 */
public class MyFrame2 extends JFrame{

    public MyFrame2(String title) {
        super(title);
    }
    
    public void prepareUI() {
        Container pane = this.getContentPane();
        
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
 
        addAButton("Button 1", pane);
        addAButton("Button 2", pane);
        addAButton("Button 3", pane);
        addAButton("Long-Named Button 4", pane);
        addAButton("5", pane);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        //Display the window.
        this.pack();
        this.setVisible(true);
    }
 
    private void addAButton(String text, Container container) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(button);
    }
    
}
