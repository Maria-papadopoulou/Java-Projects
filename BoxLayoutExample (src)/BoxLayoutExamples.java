import javax.swing.JFrame;

/**
 *
 * @author aggelos
 */
public class BoxLayoutExamples {

    public static void main(String[] args) {
        //createSwingFrame();
        //createAwtFrame();
        createSwingFrame2();
    }
    
    //example using Swing JFrame
    static void createSwingFrame() {
        MyFrame frame = new MyFrame();
        frame.prepareUI();
    }
    
    //Example using awt Frame
    static void createAwtFrame() {
        MyFrame1 frame = new MyFrame1();
        frame.prepareUI();
    }
    
    //another example using swing JFrame
    static void createSwingFrame2() {
        MyFrame2 frame = new MyFrame2("Box Layout Demo");
        frame.prepareUI();   
    }
    
}
