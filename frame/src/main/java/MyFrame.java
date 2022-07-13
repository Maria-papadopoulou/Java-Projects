import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame {

    /* 
        Deafault constructor - could be ommitted
    */
    public MyFrame() {
        super();//this is implied here
    }

    public void initUI() {
        this.setSize(400, 500);
        this.setResizable(false);
        
        //this.setLocation(300, 300);
        this.setLocationRelativeTo(null);
        
        this.setSize(400, 300);
        this.setTitle("AWT Frame Example");
        this.setBackground(Color.CYAN);
      
        
        this.setVisible(true);
    }
       
}
