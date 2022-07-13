public class Trapeza
{
    ATM atm1 =new ATM();
    
    Pelatis[] pelates  = new Pelatis[3];
    
  
    
    public int elegxoskartas(Karta karta)
    {
        for(int i = 0; i < pelates.length;i++)
        {
            if (this.pelates[i].logar.equals(karta.logariasmos))
                   return i;
        }
        return -1;
    }
    
    public void analipsi(int log,int poso)
    {
        this.pelates[log].poso -= poso;
    }
    
    
    
}