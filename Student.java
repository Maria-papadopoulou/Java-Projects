import java.util.Scanner;

public class Student
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter data: ");
        
        String am = scanner.next();
        String course;
        float mark;
        float sum = 0;
        float count = 0;
        
        while(!am.equals("000000")) 
        {
            course = scanner.next();
            while (!course.equals("end")) 
            {
                mark = scanner.nextFloat();
                count++;
                sum += mark;
                course = scanner.next();
            }
            System.out.println("Average of student " + am + " is " + sum/count);
            sum = 0;
            count = 0;
            am = scanner.next();
        }
        
        System.out.println("Reading data completed");
    }
    
}
