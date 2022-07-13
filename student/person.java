public class person
{
	String firstName;
	String lastName;

	/*person()
	{
		System.out.println("person class constructor");
	}*/

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}

	
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}

	public String getlastName()
	{
		return lastName;
	}
	  public String toString() 
	  {
         return "First name: " + firstName+
                 "\nLast name: " + lastName;
      }
}