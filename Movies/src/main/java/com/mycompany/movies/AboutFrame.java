package com.mycompany.movies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Μαρία
 */
 
public class AboutFrame extends JFrame 
{
    public AboutFrame() 
    {
        
          JLabel aboutLbl = new JLabel();
        aboutLbl.setText("<html><h3>Movies</h3><br>"
                + "This application has been developed in the framework of Java Development Course, "
                + "<h3> Developer Details: </h3> <br>"
                +" Name: Maria <br>"
                +" Surname: Papadopoulou<br> "
                +" AM: 20390178 <br>"
                + "<br><strong>2021-22</strong></html>");
        try
        {
            JLabel imageLbl = new JLabel(new ImageIcon(ImageIO.read(new File("C:\\JAVA_ERGASTHRIO_2022\\Movies\\movie.png"))));
            JPanel ImagePn= new JPanel();
             ImagePn.setLayout(new FlowLayout(FlowLayout.RIGHT));
             ImagePn.add(imageLbl);
             imageLbl.setSize(200, 200);
             this.add(ImagePn, BorderLayout.PAGE_START);
        } 
         catch(IOException ex) 
            {
                System.out.println(ex.getMessage());
           }

        this.add(aboutLbl);
 
        //setup the frame
        setSize(400,400);
        setResizable(false);
       this.setLocationRelativeTo(null);
        setTitle("About");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
      
    }

}
