public class EmployeeTest {

    public static void main(String[ ] args) {
        Employee employee = new Employee();
        employee.setName("Joe Doe");
        employee.setPosition("Junior Software Engineer");
        employee.setYearHired(2020);
        employee.setSalary(30000);

        employee.printEmployeeDetails();
    }
}