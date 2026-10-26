import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new PermanentEmployee("Alicia", 4500.00));
        employee.add(new HourlyEmployee("Carlos", 25.50, 160));
        employee.add(new HourlyEmployee("Don Ramon", 18.00, 120));
        
        System.out.println("--- Company Report ---\n");

        for (Employee emp : employee) {
            emp.displayInfo();
        }
    }
}