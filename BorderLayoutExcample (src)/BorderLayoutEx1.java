public class BorderLayoutEx1 {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        
        //Version 1: one button en each region
        //frame.prepareUI();
        
        //Version 2: using panel to group buttons
        frame.prepareUI_2();
        
    }
    
}
