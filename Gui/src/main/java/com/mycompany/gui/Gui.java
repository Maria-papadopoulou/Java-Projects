package com.mycompany.gui;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui 
{
    public static void main(String[ ] args) 
    {
        
        createFrame();
    
    }
     static void createFrame()
     {
      
         JFrame frame = new JFrame("Swing Add App");
        frame.setPreferredSize(new Dimension(350, 150)); 
        

         JButton b = new JButton("Add");
         JButton b2 = new JButton("Subtrack");
         JButton b3 = new JButton("Clear");
         b.setBounds(10, 50, 60, 20);
         b2.setBounds(85, 50, 100, 20);
         b3.setBounds(200, 50, 100, 20);
        
        frame.add(b);
        frame.add(b2);
        frame.add(b3);
         JTextField t1, t2;
        t1 = new JTextField();
        t1.setBounds(20, 15, 140, 25);
        frame.add(t1);

        t2 = new JTextField();
        t2.setBounds(175, 15, 140, 25);
        frame.add(t2);
        
         JLabel  l1;
        l1 = new JLabel("Answer goes here!");
        l1.setBounds(100, 75, 120, 35);
        frame.add(l1);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 130);
        frame.setLayout(null);
        frame.setVisible(true);
         frame.pack();
         
    }
    
}