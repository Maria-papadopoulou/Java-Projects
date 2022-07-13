import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private String firstName;
    private String lastName;
    private Calendar birthday;
    
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthday = new GregorianCalendar();
    }
    
    public Person(String firstName, String lastName, Calendar birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = new GregorianCalendar();
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public int getAge(Calendar currentDate) {
        return currentDate.get(Calendar.YEAR) - this.birthday.get(Calendar.YEAR);
    }
       
}