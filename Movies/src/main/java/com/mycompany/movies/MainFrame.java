package com.mycompany.movies;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Μαρία
 */
public class MainFrame extends JFrame
{
    
    
   //JLabel
    private JLabel idLbl;
    private JLabel titleLbl;
    private JLabel yearLbl;
    private JLabel durationLbl;
    private JLabel ratingLbl;
    private JLabel countryLbl;
    private JLabel mainCharacterLbl;
    private JLabel directorLbl;
    
    //JTextField
    private JTextField idTF;
    private JTextField titleTF;
    private JTextField yearTF;
    private JTextField durationTF;
     private JTextField ratingTF;
   private JTextField countryTF;
    private JTextField mainCharacterTF;
   private JTextField directorTF;
    
    //JButton 
    private JButton saveButton;
    private JButton statisticsButton;
    private JButton detailsButton;
    private JButton exitButton;
    private JButton refreshBtn;
    private JButton nextBtn;
    
    //JTextArea
    private JTextArea area;
    
    //JMenuBar
    private JMenuBar menuBar;
    private JMenu myMenu;
   
    
   //JMenuItem
   private JMenuItem saveItem;
   private JMenuItem statisticsItem;
   private JMenuItem detailsItem;
   private JMenuItem exitItem;
   
   //JComboBox
   private JComboBox myComboBox;
  
 
   //ArrayList
   private ArrayList <MovieDetails> MoviesList =new ArrayList();
   
   public MainFrame()
   {
       //Δημιουργία JLable
      idLbl = new JLabel("ID:\n");
      titleLbl = new JLabel("Title:\n");
      yearLbl = new JLabel("Year:\n");
      durationLbl = new JLabel("Duration(min):\n");
     ratingLbl = new JLabel("Rating( /10 ):\n");
    countryLbl = new JLabel("Country:\n");
   mainCharacterLbl = new JLabel("Main Character:\n");
      directorLbl = new JLabel("Director:\n");
        
      //Δημιουργία JTextField
        idTF = new JTextField(3);
        idTF.setEnabled(true);
        titleTF = new JTextField(10);
        yearTF = new JTextField(4);
        durationTF = new JTextField(3);
        ratingTF = new JTextField(2);
        countryTF = new JTextField(5);
        mainCharacterTF = new JTextField(5);
        directorTF = new JTextField(5);
        
      //Δημιουργία JButton
       saveButton = new JButton("Save to file");
       statisticsButton = new JButton("Statistics of Movies");
       detailsButton = new JButton("About");
       exitButton = new JButton("Exit");
       refreshBtn = new JButton("Refresh");
       nextBtn = new JButton("Next item");
       
       //Δημιουργία JTextArea
      area=new JTextArea();
      
        //Δημιουργία JMenuBar, JMenu
       menuBar=new JMenuBar();
       myMenu=new JMenu("Menu");
       
     //Δημιουργία JMenuItem
       saveItem=new JMenuItem("Save to file");
       statisticsItem=new JMenuItem("Statistics of Movies");
       detailsItem=new JMenuItem("About");
       exitItem=new JMenuItem("Exit");
       
        
       //δημιουργία Panel. εδώ ο χρήστης καταχωρεί ταινίες
       JPanel topPanel=new JPanel();
       topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
       
       //δημιουργία Panel. εδώ τοποθετούνται τα κουμπιά
       JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
      //"λίστα" κατηγοριών ταινίας  
     myComboBox= new JComboBox();
       myComboBox.addItem("Category");		
        myComboBox.addItem("Comedy");   		
        myComboBox.addItem("Family");		
        myComboBox.addItem("Adventure");
        myComboBox.addItem("Thriller");
        
   //τοποθέτηση label, textfield στο topPanel
        topPanel.add(idLbl);
        topPanel.add(idTF);
        topPanel.add(titleLbl);
         topPanel.add(titleTF);
        topPanel.add(yearLbl);
         topPanel.add(yearTF);
        topPanel.add(durationLbl);
       topPanel.add(durationTF);
       topPanel.add(ratingLbl);
       topPanel.add(ratingTF);
       topPanel.add(countryLbl);
       topPanel.add(countryTF);
       topPanel.add(mainCharacterLbl);
       topPanel.add(mainCharacterTF);
        topPanel.add(directorLbl);
       topPanel.add(directorTF);
       
//τοποθέτηση κατηγοριων και κουμπι για την επόμενη επιλογή στο top Panel
        topPanel.add(myComboBox);
       topPanel.add(nextBtn);
       
          //τοποθέτηση κουμπιων στο κάτω μέρος του  frame 
        bottomPanel.add(saveButton);
        bottomPanel.add(statisticsButton);
        bottomPanel.add(detailsButton);
        bottomPanel.add(exitButton);
        bottomPanel.add(refreshBtn);
        
         //τοποθέτηση panel στο frame
        this.add(topPanel, BorderLayout.PAGE_START);
        this.add(topPanel, BorderLayout.NORTH);
        this.add(bottomPanel, BorderLayout.PAGE_END);
        this.add(area, BorderLayout.CENTER);
        
        //ορισμός menu
         myMenu.add(saveItem);
         myMenu.add(statisticsItem);
         myMenu.add(detailsItem);
         myMenu.addSeparator();
         myMenu.add(exitItem);
         menuBar.add(myMenu);
         
 //διαστάσεις frame
      this.setTitle("Movies");
      this.setJMenuBar(menuBar);    
       this.setSize(1100,750);
       this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setVisible(true);
        
     //Προσθήκη λειτουργικότητας
      detailsButton.addActionListener(new ActionListener() 
      {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AboutFrame();
            }
        });
      detailsItem.addActionListener(new ActionListener() 
      {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                new AboutFrame();
            }
        });
      
         exitButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                exitApp();
            }  
       });
          exitItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                exitApp();
            }  
       });
           saveButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                saveToFile();
            }  
       });
           saveItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               saveToFile();
            }  
       });
           
           statisticsButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                    new StatisticsFrame( );
            }  
       });
            statisticsItem.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                    new StatisticsFrame();
            }  
       });
           nextBtn.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                     ListofMovies();
                    
            }  
       });
           refreshBtn.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                     clearFields();
                    
            }  
       });
         this.addWindowListener(new WindowAdapter() 
         {
            public void windowClosing(WindowEvent e) 
            {
                exitApp();
            }
        });
         
   }
      private void exitApp() //έξοδος εφαρμογής
          {
           int i = JOptionPane.showConfirmDialog(MainFrame.this, "Do you want to exit the app?");
             if (i == JOptionPane.YES_OPTION)
              {
                              System.exit(0);
                }
           }
    private void ListofMovies() 
   {
       String title = titleTF.getText().trim();
       String year = yearTF.getText();
       String duration = durationTF.getText();
       String director = directorTF.getText().trim();
       String rating = ratingTF.getText().trim();
       String country = countryTF.getText().trim();
       String mainChatacter = mainCharacterTF.getText().trim();
       
      String category = myComboBox.getSelectedItem().toString();
        MovieDetails moviedetails = new MovieDetails(getId(), title, year, duration, director, rating, country, mainChatacter,category);
         MoviesList.add(moviedetails);
      
            area.append(moviedetails.toString());
            area.append("\n");
        
        if(title.isEmpty() || year.isEmpty()|| duration.isEmpty() || director.isEmpty() || category.isEmpty() ||  MoviesList.isEmpty() )
       {
          JOptionPane.showMessageDialog(
                MainFrame.this,
                "Please input correct details",
               "Input Error",
                JOptionPane.WARNING_MESSAGE);
           clearFields();
           }
     
   }
  private void saveToFile()//σώσιμο ταινιών σε ξεχωριστά αρχεία ανάλογα με τη κατηγορία τους
      {
                if (MoviesList.isEmpty()) 
                   {
                           JOptionPane.showMessageDialog(
                           MainFrame.this,
                           "Nothing to save",
                             "Save error",
                         JOptionPane.WARNING_MESSAGE);
                    } 
          if(myComboBox.getSelectedItem().equals("Comedy"))
            {
            try
            {
            {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("comedy.txt"));
                          for (MovieDetails movie : MoviesList) 
                     {
                        writer.write(movie.toString());
                        writer.newLine();
                    }
            writer.close();
            JOptionPane.showMessageDialog(
                            MainFrame.this,
                           MoviesList.size() + "  records saved to " + "comedy.txt",
                            "Save completed",
                            JOptionPane.INFORMATION_MESSAGE);
        }
            }
             catch(IOException ex) 
            {
           JOptionPane.showMessageDialog(saveButton,
                            "Can't access " + "comedy.txt",
                            "File access error",
                            JOptionPane.ERROR_MESSAGE);
           }
        }
            if(myComboBox.getSelectedItem().equals("Family"))
            {
            try
            {
            {
                 BufferedWriter writer = new BufferedWriter(new FileWriter("family.txt"));
                  for (MovieDetails movie : MoviesList) 
                     {
                        writer.write(movie.toString());
                        writer.newLine();
                    }
            writer.close();
            JOptionPane.showMessageDialog(
                            MainFrame.this,
                           MoviesList.size() + "  records saved to " + "family.txt",
                            "Save completed",
                            JOptionPane.INFORMATION_MESSAGE);
        }
            }
            catch(IOException ex) 
            {
           JOptionPane.showMessageDialog(saveButton,
                            "Can't access " + "family.txt",
                            "File access error",
                            JOptionPane.ERROR_MESSAGE);
           }
            }
              if(myComboBox.getSelectedItem().equals("Adventure"))
            {
            try
            {
            {
                   BufferedWriter writer = new BufferedWriter(new FileWriter("adventure.txt"));
                   for (MovieDetails movie : MoviesList) 
                     {
                        writer.write(movie.toString());
                        writer.newLine();
                    }
            writer.close();
            JOptionPane.showMessageDialog(
                            MainFrame.this,
                           MoviesList.size() + "  records saved to " + "adventure.txt",
                            "Save completed",
                            JOptionPane.INFORMATION_MESSAGE);
        }
            }
            catch(IOException ex) 
            {
           JOptionPane.showMessageDialog(saveButton,
                            "Can't access " + "adventure.txt",
                            "File access error",
                            JOptionPane.ERROR_MESSAGE);
           }
        }
               if(myComboBox.getSelectedItem().equals("Thriller"))
            {
            try
            {
            {
               BufferedWriter writer = new BufferedWriter(new FileWriter("thriller.txt"));
                   for (MovieDetails movie : MoviesList) 
                     {
                        writer.write(movie.toString());
                        writer.newLine();
                    }
            writer.close();
            JOptionPane.showMessageDialog(
                            MainFrame.this,
                           MoviesList.size() + "  records saved to " + "thriller.txt",
                            "Save completed",
                            JOptionPane.INFORMATION_MESSAGE);
        }
            }
            catch(IOException ex) 
            {
           JOptionPane.showMessageDialog(saveButton,
                            "Can't access " + "thriller.txt",
                            "File access error",
                            JOptionPane.ERROR_MESSAGE);
           }
        }
            }

      private void clearFields() //καθαρισμός πεδίων
      {
        idTF.setText("");
       titleTF.setText("");
      yearTF.setText("");
      durationTF.setText("");
      directorTF.setText("");
      countryTF.setText("");
      ratingTF.setText("");
      mainCharacterTF.setText("");
       area.setText("");
      }
      private String getId() 
      {
          String rand;
          int id=0;
          do
          {
              rand=String.valueOf(id);
                     id++;   //αυξάνει το id σε κάθε εγγραφή κατά 1
          }
          while(checkID(String.valueOf(id)));
          return rand;
      }
          private boolean checkID(String id)//αναζήτηση id, σε περίπτωση που δεν υπάρχει ίδιο με το id που ψάχνω εμφανίζει false αλλιώς true 
          {
              
               for(int i=0; i<MoviesList.size(); i++)
               {
                   
                   System.out.println(MoviesList.get(i).getId() + " " + id);//εκτύπωση id
                   if(MoviesList.get(i).getId().equals(id)) //εαν το id υπάρχει
                   {
                       return true; //επιστρέφει true
                   } 
               }
               return false; //αλλιώς false
    }
}
   