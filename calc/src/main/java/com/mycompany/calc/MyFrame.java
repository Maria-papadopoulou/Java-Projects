package com.mycompany.calc;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
   private JButton btn7, btn8,btn9,btn_add, btn4,btn5,btn6, btn_subtrack,btn0, btn1, btn2, btn3,   btn_dot, btn_divide,btn_multiply,btn_equal;
   private JTextField txt;
      public MyFrame() 
      {
        super("Testing Form [Calculator]");
    }
      
    public void Calculator()
    {   
        JPanel button=new JPanel(new GridLayout(4,4));
        txt= new JTextField("0.0");
        this.add(txt, BorderLayout.NORTH);
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn_add=new JButton("+");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn_subtrack=new JButton("-");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn_multiply=new JButton("*");
        btn0= new JButton("0");   
        btn_dot=new JButton(".");
        btn_equal=new JButton("=");
        btn_divide=new JButton("/");
         

        button.add(btn7);
        button.add(btn8);
        button.add(btn9);
        button.add(btn_add);
        button.add(btn4);
        button.add(btn5);
        button.add(btn6);
        button.add(btn_subtrack);
       button.add(btn1);
        button.add(btn2);
         button.add(btn3);
        button.add(btn_multiply);
      button.add(btn0);
        button.add(btn_dot);
        button.add(btn_equal);
       button.add(btn_divide);

       this.add(button, BorderLayout.CENTER);

this.setSize(365,365);
this.setVisible(true);
this.setResizable(false);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}