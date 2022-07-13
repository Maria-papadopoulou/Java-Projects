import java.util.GregorianCalendar;

public class PersonTest{

     public static void main(String []args){        
        Person person1 = new Person("Joe", "Doe", new GregorianCalendar(1999, 2, 6));
        
        System.out.println("hello my name is " + person1.getFullName() + ". I am " + 
        person1.getAge(new GregorianCalendar()) + " years old.");
        
     }
}