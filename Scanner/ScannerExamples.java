import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {

        //readInputRecordFromStd();
        //readIntsFromStd1();
        //readIntsFromStd2();
        //readFloatsFromStd();
        //readString1();
        //readString2();
        //readEntireFile();
        try {
            //readFileLineByLine();
            readDataFile();
        } catch (FileNotFoundException ex) {

        }
    }

    /*
        reads the text from datafile.txt lin-by-line and prints it to the standard output
    */
    static void readFileLineByLine() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("datafile.txt"));
        int lineNumber = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineNumber++;
            System.out.println("line " + lineNumber + " :" + line);            
        }
        scanner.close();
    }

    /*
        Reads records from tdatafile.txt
        Each record is one line long, while the fields are separetd by ; character
     */
    static void readDataFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("datafile.txt"));
        
        scanner.useLocale(Locale.US); // to use dot as decimal mark        
        scanner.useDelimiter(";|\n");//; and \n are considered as delimeters |\\R+
        //scanner.useDelimiter(";");//Only ; is considered as delimeter (doesn't work properly)
        //scanner.useDelimiter("\\s*;\\s*|\n");//this delimeter consumes whitespaces before/after the delimeter. Also \n is considered as delimeter
        
        String title, category, runningTime;
        int year;
        double price;
        int count = 0;
        
        while (scanner.hasNextLine()) {
            title = scanner.next();
            category = scanner.next();
            runningTime = scanner.next();
            year = scanner.nextInt();
            price = scanner.nextDouble();
            Movie movie = new Movie(title, category, runningTime, year, price);
            count++;
//            System.out.println("Movie [" + count + "]: " + title + "#" + category + "#" + runningTime + "#"
//                    + year + "#" + price); // just for debugging
            System.out.println("Movie [" + count + "]: " + movie.toString()); // just for debugging
        }
        scanner.close();
    }

    /*
        The Java Scanner class (java.util) reads the input into tokens using a delimiter 
        which is whitespace by default. It provides many methods to scanner and 
        parse various primitive values.
        This method reads student record (which contains varius types) from System.in (on enter)
        The method terminates after it reads the 5th token (double).
        Record:
            Joe Doe
            M
            21
            12345678
            8,3
     */
    static void readInputRecordFromStd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student details: ");

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Student Code: ");
        long code = scanner.nextLong();
        System.out.print("Mark: ");
        double mark = scanner.nextDouble();

        scanner.close();

        System.out.println("*******************");
        System.out.println("Name:\t" + name);
        System.out.println("Gender:\t" + gender);
        System.out.println("Age:\t" + age);
        System.out.println("Code:\t" + code);
        System.out.println("Mark:\t" + mark);
    }

    /*
        Reads integers and acummulates them in sum variable.
        Terminates when reads -1, then prints result
     */
    static void readIntsFromStd1() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        System.out.println("Enter integers (enter -1 to stop): ");
        do {
            sum += i;
        } while ((i = sc.nextInt()) != -1);
        System.out.println("SUM=" + sum);
        sc.close();
    }

    /*
        scanner integers and acummulate them in sum variable
        also count the integers, calculate arithmetic mean
        stops when we enter any other type (or negative number)
     */
    static void readIntsFromStd2() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        System.out.println("Enter positive integer numbers (negative or other type to stop):");

        while (scanner.hasNextInt()) {// Check if an int value is available
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }

        int mean = sum / count;
        System.out.println("Arithmetic Mean = " + mean);
    }

    /*
        reads floats from the input and
        1. acummulates the passing grades to sumPass variable and counts them in countPass
        2. acummulates the failing grades to sumFail variable and counts them in countFail
        3.it stops when we enter negative number
        4. if we enter  any other type we get error
     */
    static void readFloatsFromStd() {
        int countPass = 0;
        float sumPass = 0;
        float mark = 0;
        float sumFail = 0;
        int countFail = 0;

        System.out.println("Enter student's marks range 0,0-10");
        System.out.println("when done provide a negative number");
        Scanner input = new Scanner(System.in);
        while ((mark = input.nextFloat()) >= 0.0) {
            if (mark >= 5.0) {
                sumPass += mark;
                countPass++;
            } else {
                sumFail += mark;
                countFail++;
            }
        }

        System.out.println("Passing marks: " + countPass);
        System.out.printf("Pass average: %4.4g\n ", sumPass / countPass);

        System.out.println("Failing marks: " + countFail);
        System.out.printf("Fail Average: %4.4g\n ", sumFail / countFail);
    }

    /*
        Example of using the Scanner delimeter to tokenize input
        here the delimeter is "fish" word
     */
    static void readString1() {
        String input = "1-2-red-blue-black";
        System.out.println("Input phrase: " + input);
        Scanner scanner = new Scanner(input).useDelimiter("-"); 
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        scanner.close();
    }
    
    /*
        Example of using the Scanner delimeter to tokenize input
        here the delimeter is "fish" word
     */
    static void readString2() {
        String input = "1 fish 2 fish red fish blue fish black";
        System.out.println("Input phrase: " + input);
        Scanner scanner = new Scanner(input).useDelimiter("\\s*fish\\s*");//this delimeter means the word fish with possible whitespaces before and after
        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        scanner.close();
    }

    /*
        Reads a whle text file and stores it to a string variable.
        We use the Scanner to tokenize the entire stream from the beginning to 
        the next regex “A” – which matches the full input.
     */
    static void readEntireFile() {
        try {
            Scanner scanner = new Scanner(new FileInputStream("test.txt"));
            scanner.useDelimiter("A");
            String result = scanner.next();
            System.out.println(result);
            scanner.close();
        } catch (FileNotFoundException ex) {

        }
    }

}
