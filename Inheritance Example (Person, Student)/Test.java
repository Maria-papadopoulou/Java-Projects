public class Test {

      public static void main(String args[]) {
            Person person = new Person();
            person.setFirstName("Joe");
            person.setLastName("Doe");
            System.out.println(person.toString());

            System.out.println("--------------------------");

            Student student = new Student();
            student.setFirstName("Maria");
            student.setLastName("Doe");
            student.setRegistrationNo("cs2200000");
            System.out.println(student.toString());
      }

}