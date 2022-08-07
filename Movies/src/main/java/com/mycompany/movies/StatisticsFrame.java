package com.mycompany.movies;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class StatisticsFrame extends JFrame
{
    public StatisticsFrame()
    {
         JLabel aboutLbl = new JLabel();
                 aboutLbl.setBorder(new EmptyBorder(0,10,0,10));//top,left,bottom,right

        aboutLbl.setText("<html><h3>Statistics of Movies</h3><br>"
                + "here will appearence the statistics of movies, "
                + "<br><strong>2021-22</strong></html>");

        this.add(aboutLbl);
       //setup the frame
        this.setSize(400, 400);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Statistics");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setVisible(true);
    }

        
    }
    

