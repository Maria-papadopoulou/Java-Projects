import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import java.awt.Panel;

/**
 *
 * @author aggelos
 */
public class MyFrame extends JFrame{
    
    private JButton btn1, btn2, btn3, btn4, btn5;

    public MyFrame() {
        super();
    }
    
    //prepares the UI by adding one button in each region
    public void prepareUI() {
        btn1 = new JButton("B1");
        btn2 = new JButton("B2");
        btn3 = new JButton("B3");
        btn4 = new JButton("B4");
        btn5 = new JButton("B5");
        
        this.add(btn1, BorderLayout.NORTH); //PAGE_START
        this.add(btn2, BorderLayout.SOUTH); //PAGE_END
        this.add(btn3, BorderLayout.EAST); //LINE_START
        this.add(btn4, BorderLayout.WEST); //LINE_END
        this.add(btn5, BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    //prepares the Ui by using panel to group buttons
    public void prepareUI_2() {
        btn1 = new JButton("B1");
        btn2 = new JButton("B2");
        btn3 = new JButton("B3");
        btn4 = new JButton("B4");
        btn5 = new JButton("B5");
        
        //this.add(btn1, BorderLayout.NORTH); //PAGE_START
        //this.add(btn2, BorderLayout.SOUTH); //PAGE_END
        this.add(btn3, BorderLayout.EAST); //LINE_START
        this.add(btn4, BorderLayout.WEST); //LINE_END
        this.add(btn5, BorderLayout.CENTER);
        
        //We cane fit two or more components to one region using a panel panel has FlowLayout
        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);
        
        this.add(panel, BorderLayout.NORTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        
    }
    
}
