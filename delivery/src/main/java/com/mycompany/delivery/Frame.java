package com.mycompany.delivery;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Frame extends JFrame
{
public Frame()
{
}
     public void initUI() 
     {    
        this.setTitle("Application for Delivery!");        
        this.setLayout(null); 
      
          this.addRadioButtons();
         this.addCheckBox();
         this.addComboBox();
         this.addLabel();
        this.setVisible(true);
        this.setSize(400, 450);    
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
    private void addRadioButtons()
    {
       JLabel label1 = new JLabel(); 
        
        label1.setVerticalAlignment(JLabel.TOP);       
        label1.setText("Size");     
        label1.setBounds(5, 9, 100, 20);
        
        
        JRadioButton smallButton = new JRadioButton("Small"); 	
        JRadioButton mediumButton = new JRadioButton("Medium"); 
        JRadioButton largeButton = new JRadioButton("Large"); 	
 	
        smallButton.setBounds(5, 40, 80, 25);		
        mediumButton.setBounds(80, 40, 80, 25);		
        largeButton.setBounds(160, 40, 80, 25);
  
      add(label1);  
      add(smallButton);		
      add(mediumButton);		
      add(largeButton);       
    }
        private void addCheckBox() 
        {
            JLabel label1 = new JLabel();   
            label1.setText("Toppings");     
            label1.setBounds(10, 110, 100, 40);		
            JCheckBox checkbox = new JCheckBox("Pepperoni"); 
             JCheckBox checkbox2 = new JCheckBox("Anchovies"); 
             
            checkbox.setBounds(5, 150, 90, 30); 
            checkbox2.setBounds(120, 150, 130, 30); 
        	
            checkbox.setToolTipText("click to select this option"); 		
           
            add(label1);
            add(checkbox);   
            add(checkbox2);   
    }
 
       private void addComboBox() 
       {
            JLabel label1 = new JLabel();   
            label1.setText("Delivery");     
            label1.setBounds(5, 220, 100, 30);
        JComboBox myComboBox=new JComboBox();		
       	
        myComboBox.setBounds(5, 260, 180, 30);		
        		
        myComboBox.addItem("[Select a delivery option]");		
        myComboBox.addItem("Eat-in");   		
        myComboBox.addItem("Take out");		
        myComboBox.addItem("Home Delivery");    				
    	
        add(label1);
        add(myComboBox);     
    }

    private void addLabel() 
    {
             
        JLabel label1 = new JLabel(); 
             
        label1.setBounds(5, 350, 130, 30); 	
        
        label1.setText("Message goes here");       
        label1.setOpaque(true);              
        
        add(label1);  
    }
}