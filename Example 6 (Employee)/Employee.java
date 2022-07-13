public class Employee {

    private String name;
    private String position;
    private int yearHired;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

	public void setYearHired(int yearHired) {
        this.yearHired = yearHired;
    }

    public int getYearHired() {
        return this.yearHired;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee name: " + this.getName());
        System.out.println("Current position: " + this.getPosition());
        System.out.println("Year hired: " + this.getYearHired());
        System.out.println("Current salary: $" + this.getSalary());
    }

}    