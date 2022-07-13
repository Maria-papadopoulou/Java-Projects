public class test
{
	public static void main(String args[])
	{
		person person=new person();
		person.setFirstName("maria");
		person.setLastName("papadopoulou");
		System.out.println(person.toString());

		System.out.println("----------------------");

		student student=new student();
		student.setFirstName("panos");
		student.setLastName("z");
		student.setRegistrationNo("ice20390178");
		System.out.println(student.toString());

	}

}