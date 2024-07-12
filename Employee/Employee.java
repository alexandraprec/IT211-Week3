import java.time.LocalDate;
import java.time.Period;

public class Employee {

    // Step 1: Define attributes for name, salary and hire dat
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Step 2: Add a constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Step 3: Add getter method
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Step 4: Add a method to calculate
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }

}










