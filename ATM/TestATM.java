import java.util.*;
public class TestATM
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα

    public static void main()
    {
        Trapeza Pireos = new Trapeza();
   
        
        
        Pireos.pelates[0] = new Pelatis("Velet_1", "1111",200);
        Pireos.pelates[1] = new Pelatis("Velet_1", "2222",200);  
        Pireos.pelates[2] = new Pelatis("Velet_1", "3333",200);  
        
     
        
       for(;;)
       {
           String ppelatis= Pireos.atm1.karta_syn();

        if(ppelatis.equals("0"))
            break;
        
        
        Karta Maria = new Karta(ppelatis);
        
        int thesi = Pireos.elegxoskartas(Maria);
        if (thesi > -1)
        {
   
            int synal= Pireos.atm1.poso_syn();  
            Pireos.analipsi(thesi,synal);
            System.out.println("To neo ypoloipo einai:"+Pireos.pelates[thesi].poso);
        }
        else
           System.out.println("Den yparxei o logariasmos!");
          
        } 
    }

   
}