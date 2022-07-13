import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author aggelos
 */
public class DataStreamsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "data.dat";
        
        writeData(filename);//write primitive types to dat.dat
        System.out.println("******************");
        readData(filename); //read primitive types from dat.dat and print them to the standard output
    }

    /*
        Writes data (primitive types) to a file
    */
    static void writeData(String filename) {
        
        //data to write 
        int var1 = 123;
        float var2 = 123.45f;
        long var3 = 1231134234;
        boolean var4 = true;
        String var5 = "end";
        
        
        try {
            //FileOutputStream file = new FileOutputStream(filename);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
            dos.writeInt(var1);
            dos.writeFloat(var2);
            dos.writeLong(var3);
            dos.writeBoolean(var4);
            dos.writeUTF(var5);
            //dos.flush();
            dos.close();
            System.out.println("Write data completed");
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*
        reads data (primitive types) from file 
        and prints them to the standard output
    */
    static void readData(String filename) {
        try {
            //FileInputStream input = new FileInputStream(filename);
            DataInputStream dis = new DataInputStream(new FileInputStream(filename));

            int var1 = dis.readInt();
            float var2 = dis.readFloat();
            long var3 = dis.readLong();
            boolean var4 = dis.readBoolean();           
            String var5 = dis.readUTF();
            
            dis.close();

            System.out.println("Var1 = " + var1);
            System.out.println("Var2 = " + var2);
            System.out.println("Var3 = " + var3);
            System.out.println("Var4 = " + var4);
            System.out.println("Var5 = " + var5);
            
            System.out.println("Read data completed");

        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
