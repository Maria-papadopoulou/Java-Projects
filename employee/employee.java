public class employee
{
	private String name;
	private String position;
	private int yearHired;
	private float salary;


//constructors
//default constructor
public employee()
{

}

public employee (String name)
{
	this.name = name;
}

public employee (String position, int yearHired)
{
	this.position = position;
	this.yearHired = yearHired;
}

public employee (float salary)
{
	this.salary = salary;
}

//methods

public String getName() //getter name
{
	if(name == null)
	{
		System.out.println("error name");
		return "error";
	}
	else 
		return name;
}
public void setName(String name) //setter name
{
	this.name =  name;
}

public String getPosition() //getter position
{
	return position;
}

public void setPosition(String position) //setter position
{
	this.position =  position;
}


public int getYearHired() //getter yearHired
{
	return yearHired;

}
public void setYearHired(int yearHired) //setter yearHired
{
	this.yearHired = yearHired;
}

public float getSalary() //getter salary
{
	if(salary < 0.0f)
	{
		System.out.println("error salary");
		return 0.0f;
	}
	else 
		return salary;
}

public void setSalary(float salary) //setter salary
{
	this.salary =  salary;
}

//print 
public void printEmployeeDetails()
{
	System.out.println("Employee name:\t" + name);
	System.out.println("Current Position:\t" + position);
	System.out.println("Year hired:\t" + yearHired);
	System.out.println("Current salary:\t" + salary);
}
}

