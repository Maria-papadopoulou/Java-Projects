import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author aggelos
 */
public class ByteStreamsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        writeBytesToFile();
        //writeBytesToFile2();
        //readBytesFromFile();
        //readBytesFromFile2();
        System.out.println("end of main");
    }
    
    /*
        Writes bytes to out.dat file using FileOutputStream.
        Bytes are obtained from a string using getBytes() method.
        We can test different cases of bytes: english characters, greek characters
        The default location of the file is the project directory.
     */
    static void writeBytesToFile() {
         byte[] data = "This is an output example".getBytes();//(21 chars x 1 byte) + (4 spaces x 1 byte)= 25 bytes
         //byte[] data = "Αυτό ειναι ένα παράδειγμα εγγραφής σε αρχείο χαρακτήρων".getBytes(); //(48 UTF chars x 2 bytes) + (7 spaces x  1byte) =103 bytes
         //byte[] data = "Μεθοδολογίες Ανάπτυξης\r\nΕφαρμογών".getBytes(); //(30 UTF chars x 2 bytes) + (1 space x 1 byte) + (1 new line x 1 byte) + (1 carriage return x 1 byte) = 63 bytes
         try {
            FileOutputStream output = new FileOutputStream("out.dat");
            output.write(data);
            output.close();
            System.out.println("Write bytes to file completed");
            System.out.println("Total bytes written: " + data.length);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    

    /*
        Writes bytes to out.dat file using FileOutputStream.
        Bytes are obtained from a string using getBytes() method.
        
        In this version the output file is located in a directory relative to the project path.
     */
    static void writeBytesToFile2() {
        byte[] data = "This is an output example".getBytes();//21x1 byte + 4spaces=25bytes

        //If we want to put the file inside a dir (relative to project dir)
        //we can use the following code to create a directory
        File directory = new File("data");
        if (!directory.exists()) {
            directory.mkdir();
        }
        File file = new File(directory + "/" + "out.dat");

        try {
            FileOutputStream output = new FileOutputStream(file);
            output.write(data);
            output.close();
            System.out.println("Write bytes to file (2nd version) completed");
            System.out.println("Total bytes written: " + data.length);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
        Reads bytes from out.dat file using FileInputStream
        and prints them (hex or decimal values) to the standard output.
        The default file location is the project directory
        We can also read from different directories.
     */
    static void readBytesFromFile() {
        try {
            FileInputStream input = new FileInputStream("out.dat");
            //FileInputStream in = new FileInputStream("data/out.dat");
            //FileInputStream in = new FileInputStream("data/out2.dat");//out2.dat created with sublime text
            //The UTF-8 representation of the BOM is the (hexadecimal) byte sequence 0xEF,0xBB,0xBF.
            //FileInputStream in = new FileInputStream("data/out3.dat");//out3.dat created with sublime text UTF8-with BOM
            int c;
            int count = 0;

            while ((c = input.read()) != -1) {
                //System.out.print(c + "\t"); //print decimal values
                System.out.printf("0x%02x\t", c); //print hex values
                count++;
            }
            input.close();

            System.out.println("\nRead bytes from file completed");
            System.out.println("Total bytes read: " + count);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
        Second verison of reading bytes method.
        Reads bytes from out.dat file using FileInputStream
        and prints them (hex values) to the standard output.
        
        This version does not need to read repetitively (using while loop).
        Instead it can read all the contents at once and store them to a byte array.        
     */
    static void readBytesFromFile2() {
        File file = new File("out.dat");
        byte[] bytes = new byte[(int) file.length()];//byte array to store the contents of the file

        try {
            FileInputStream input = new FileInputStream(file);
            input.read(bytes);//added in Java 6
            input.close();
            
            //we need a loop to print the contnets of the byte array
            for (int i = 0; i < bytes.length; i++) {
                System.out.printf("0x%04x\t", bytes[i]);
            }
            System.out.println("\nRead bytes from file (2nd version) completed");
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
