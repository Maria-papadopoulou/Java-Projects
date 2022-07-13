import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aggelos
 */
public class MyFrame extends JFrame {
    
    JButton buttons[];

    public MyFrame() { 
        super();
    }

    public void prepareUI() {       
        //Can't set BoxLaytout directly to a JFrame because it produces error.
        //We have to add BoXLayout to the content pane (container) of the JFrame
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        System.out.println(this.getContentPane().getLayout().toString());
        System.out.println(this.getLayout().toString());
        
        buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button " + (i + 1));
            this.add(buttons[i]);
        }
      
        this.setSize(400, 400);
        this.setVisible(true);
    }

}
