public class PermanentEmployee extends Employee {
    private double salary;

    public PermanentEmployee(String name, double balance) {
        super(name);
        this.salary = balance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double balance) {
        this.salary = balance;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String getEmployeeType() {
        return "Permanent Employee";
    }
}