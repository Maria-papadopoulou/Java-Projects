import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 *
 * @author aggelos
 */
public class FramesExamples {

    public static void main(String[] args) {
        //createAWTFrame();
        //createSwingFrame();
        //createFrameWithInheritance();
        createFrameWithClass();
    }
    
    /*
        Create AWT Frame directly from main()
    */
    static void createAWTFrame() {
        Frame frame = new Frame();
        frame.setSize(400, 500);
               
        frame.setResizable(false);
        frame.setLocation(300, 300);
        frame.setSize(300, 200);
        frame.setTitle("AWT Frame Example");
        frame.setBackground(Color.CYAN);
        
        frame.setVisible(true);
    }
    
    /* 
        Create SWING Frame directly from main()
        This frame includes close operation
    */
    static void createSwingFrame() {
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
    
    /*
        Create AWT Frame using inheritance
    */
    static void createFrameWithInheritance() {
        MyFrame frame = new MyFrame();
        frame.initUI();             
    }
    
    /*
        Create frame using a dedicated class to handel gui creation
    */
    static void createFrameWithClass() {
        GUIHandler gui = new GUIHandler();
    }
    
   
}
