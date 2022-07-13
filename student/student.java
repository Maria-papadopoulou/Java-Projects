class student extends person
{
	String registrationNo;

	student()
	{
		System.out.println("student class constructor");

	}
	public void setRegistrationNo(String registrationNo)
	{
		this.registrationNo=registrationNo;
	}
	public String getRegistrationNo()
	{
		return registrationNo;
	}
	  @Override
      public String toString() 
      {
         return "First name: " + this.firstName
               +  "\nLast name: " + this.lastName
               +   "\nRegistration No: " + this.registrationNo;
      }
}