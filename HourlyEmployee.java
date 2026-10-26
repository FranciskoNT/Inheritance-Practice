public class HourlyEmployee extends Employee {
    
    private double salary;
    private int hours;

    public HourlyEmployee(String name, double salary, int hours) {
        super(name);
        this.salary = salary;
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String getEmployeeType() {
        return "Hourly Employee";
    }
}