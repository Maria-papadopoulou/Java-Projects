package com.mycompany.borderlayoutex1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aggelos
 */
public class MyFrame extends JFrame{
    
    private JButton btn1, btn2, btn3, btn4, btn5, btn6,btn7,btn8,btn9,btn10;

    public MyFrame() {
        super("BOXS");
    }
    
    //prepares the UI by adding one button in each region
    public void prepareUI() {
        btn1 = new JButton("B1");
        btn2 = new JButton("B2");
        btn3 = new JButton("B3");
        btn4 = new JButton("B4");
        btn5 = new JButton("B5");
        btn5 = new JButton("B6");
        btn7 = new JButton("B7");
        btn8 = new JButton("B8");
        btn9 = new JButton("B9");
        btn10 = new JButton("B10");
        
        // this.add(btn6, BorderLayout.PAGE_START);
        this.add(btn1, BorderLayout.NORTH); //PAGE_START
        this.add(btn2, BorderLayout.SOUTH); //PAGE_END
        this.add(btn3, BorderLayout.EAST); //LINE_START
        this.add(btn4, BorderLayout.WEST); 
        this.add(btn5, BorderLayout.CENTER);
       
       
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 250);
        this.setVisible(true);
    }
    
    //prepares the Ui by using panel to group buttons
    public void prepareUI_2() {
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
        
        //We cane fit two or more components to one region using a panel panel has FlowLayout
        JLabel panel = new JLabel();
        JTextField txtname=new JTextField();
        this.setLayout(new FlowLayout());
       // panel.add(btn1);
       // panel.add(btn2);
         this.add(txtname);
        this.add(panel, BorderLayout.NORTH);
       
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 350);
        this.setVisible(true);
        
    }
    
}
