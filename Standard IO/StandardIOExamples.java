import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aggelos
 */
public class StandardIOExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //readBytes();
        //readCharacters();
        //readSingleLine();
        readLines();
        
        System.out.println("end of program");
    }
    
    /*
        In Java, 3 streams are created for us automatically when we run a program. 
        All these streams are attached with the console (similar to STDIN, STDOUT and STDERR in C).
        
        1) System.out: standard output stream.
        2) System.in: standard input stream. this is a byte stream.
        3) System.err: standard error stream
    
        This method reads bytes from standard input and prints them in the output
        It also prints the number of bytes read (inluding new line bytes)
        Terminates reading when we enter the byte 113 (which represents 'q') 
     */
    static void readBytes() throws IOException {
        int i;
        int count = 0;
        System.out.println("Enter characters and press enter, use 'q' to quit:");
        do {
            i = System.in.read();
            //count++;
            if (i != 10) {//10 = ASCII for \n (new line)
                System.out.println("ASCII (decimal value): " + i); //print byte as ASCII decimal value
                System.out.printf("ASCII (hex value): 0x%04x\n", i); //print byte as ASCII hex value
                System.out.println("Character: " + (char) i);//print byte as character
                count++;
            }
        } while (i != 113); //113 is ASCII decimal value for 'q'

        System.out.println("Total characters read: " + count);
        System.out.println("end of method");
    }

    /*
        An InputStreamReader is a bridge from byte streams to character streams: 
        It reads bytes and decodes them into characters using a specified charset. 
        The charset that it uses may be specified by name or may be given explicitly, 
        or the platform's default charset may be accepted. 
    
        This method reads characters from standard input and prints them in the output.
        It also prints the number of characters read (excluding new line characters).
        Terminates reading when we enter 'q' 
     */
    static void readCharacters() throws IOException {
        char c;
        int count = 0;
        System.out.println("Enter characters then enter, use 'q' to quit:");
        InputStreamReader input = new InputStreamReader(System.in);//we wrap the byte stream to a character stream

        do {
            c = (char) input.read();
            if (c != '\n') {
                System.out.println("Character: " + c);
                count++;
            }
        } while (c != 'q');

        input.close();
        System.out.println("Total characters: " + count);
        System.out.println("end of method");
    }

    /*
        This method reads a single line from standard input (line-oriented readin)
        and prints it to the output with the appropriate message.
     */
    static void readSingleLine() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("What's your name? ");
        String name = buffer.readLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("end of method");
        buffer.close();
    }

    /*
        This method reads multiple lines from standard input an prints them to the standard output
        The method is terminated when the user enters the word "stop"
     */
    static void readLines() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String data = "";
               
        while(true) {    
            System.out.print("Enter line: ");
            data = buffer.readLine();
            if (!data.equalsIgnoreCase("stop"))
                System.out.println("You entered: " + data);
            else 
                break;
        }
        
        System.out.println("end of method");
        buffer.close();
    }
    
}
