public class employee {
    private String name;
    private double salary;
    private double employeeNumber;

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setEmployeeNumber(double employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public double getEmployeeNumber() {
        return employeeNumber;
    }

    public void showName()
    {
        System.out.println("Name: "+name);
    }
    public void showSalary()
    {
        System.out.println("Salary: "+salary);
    }
    public void showEmployeeNumber()
    {
        System.out.println("Employee Number: "+employeeNumber);
    }

    public void showAll(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Employee EmployeeNumber: "+employeeNumber);
    }

}
