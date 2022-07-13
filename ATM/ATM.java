import java.io.*;
class ATM
{
    Othoni oth=new Othoni();
    Pliktrologio pliktr = new Pliktrologio();
    int result;
    String w_karta;
    String karta_syn(){
        
        oth.emfanishString("Vale karta");
        try
        {w_karta = pliktr.dwseKarta();
        return w_karta;}
        catch (IOException e)
        {
            return "";
        }
       
    }
    int poso_syn(){
        oth.emfanishString("Dwse poso analhpshs");
        try
        {result = pliktr.dwsePoso();
        return result;}
        catch (IOException e)
        {
            return-1;
        }
        
    }
}