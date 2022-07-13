import java.io.*;
class Pliktrologio
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public int dwsePoso() throws IOException{
return (Integer.parseInt(br.readLine()));
}


public String dwseKarta() throws IOException{
return (br.readLine());
}
}