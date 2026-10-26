public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract double calculateSalary();
    public abstract String getEmployeeType();

    public void displayInfo() {
        System.out.println("Employee information: \n");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + getEmployeeType());
        System.out.println("Monthly Salary: $" + String.format("%.2f", calculateSalary()));
        System.out.println("-----------------------------------");
    }
}