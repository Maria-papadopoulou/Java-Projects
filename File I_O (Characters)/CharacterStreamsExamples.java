import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aggelos
 */
public class CharacterStreamsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        writeCharactersToFile();
        readLinesFromFile();
        //readCharsFromFile();
        //readCharsFromFile2();
        System.out.println("end of main");
    }

    /* 
        Writes phrases in data.txt using BufferedWriter.
        In comments you may find the initial implementation 
        which uses a simple FileWriter to write the same phrases.
     */
    static void writeCharactersToFile() {
        try {
            //FileWriter writer = new FileWriter("data.txt");
            BufferedWriter buffer = new BufferedWriter(new FileWriter("/Users/aggelos/Desktop/data.txt"));
            //writer.write("this is a file writer example");
            buffer.write("This is a file writer example-2");
            buffer.newLine();
            //writer.write("\n αυτό ειναι ένα παράδειγμα εγγραφής σε αρχείο χαρακτήρων");
            buffer.write("Αυτό ειναι ένα παράδειγμα εγγραφής σε αρχείο χαρακτήρων");
            //writer.close();
            buffer.close();
            System.out.println("Write to data.txt completed");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    /*
        Reads lines of text from data.txt using BufferedReader.        
     */
    static void readLinesFromFile() {
        try {
            BufferedReader buffer = new BufferedReader(new FileReader("/Users/aggelos/Desktop/data.txt"));
            String line;
            int count = 0;

            while (buffer.ready()) {
                line = buffer.readLine();//line-oriented reading                
                System.out.println(line);
                count++;
            }
            buffer.close();
            System.out.println("Read lines from data.txt completed");
            System.out.println("Total lines: " + count);

        //The order of catching the exception is that if the first catch matches 
        //the exception, it executes, else if it doesn't, the next one is tried 
        //and on and on until one is matched or none are.
        //Thus, when catching exceptions you want to always catch the 
        //most specific first and the most generic last.
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*
        Reads characters from data.txt using FileReader
     */
    static void readCharsFromFile() {
        try {
            FileReader reader = new FileReader("data.txt");
            int c;
            
            while (reader.ready()) {
                c = reader.read(); //character-oriented reading
                System.out.print((char) c + " ");
            }
            reader.close();
            System.out.println("\nRead chars from data.txt completed");
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*
        Second version of readCharsFromFile method.    
        Reads characters from data.txt using FileReader
     */
    static void readCharsFromFile2() {
        int counter = 0;
        try {
            //FileReader reader = new FileReader("data.txt");
            FileReader reader = new FileReader("data2.txt");//file created with sublime utf8 with bom
            int c;

            while ((c = reader.read()) != -1) {
                System.out.print((char) c + " ");
                counter++;
            }

            reader.close();
            System.out.println("\nRead chars from data.txt completed");
            System.out.println("Total characters read: " + counter);
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}