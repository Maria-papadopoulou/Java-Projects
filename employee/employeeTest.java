public class employeeTest
{
	public static void main(String args[])
	{
		employee e1;
		employee e2;
		employee e3;

		e1 = new employee();
		e2 =  new employee("Maria");
		e2.setName("Papadopoulou");

		e2.setPosition("Software Engineer");
		e2.setSalary(350.0f);
		e2.setYearHired(2022);

		e1.printEmployeeDetails();
		e2.printEmployeeDetails();
		//e3.printEmployeeDetails();
		
		
	}
}