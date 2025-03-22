package pkgOrgStructre;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", 30, "ABCDE1234F", "123456789012", "IT", 50000, "9876543210", 5);
        Manager mgr = new Manager(2, "Alice Smith", 35, "FGHIJ5678K", "987654321098", "Admin", 80000, "8765432109", 10, 3, 10);
        Developer dev = new Developer(3, "Bob Brown", 28, "LMNOP1234Q", "112233445566", "Development", 60000, "7654321098", 3, "Backend Team", "Alice Smith", "Java, Spring Boot");
        Tester tst = new Tester(4, "Charlie Black", 26, "QRSTU5678V", "998877665544", "Testing", 40000, "6543210987", 2, "QA Team", "Alice Smith", "Automation Testing");

        // Compute salary for each type of employee
        emp.details();
        emp.computeSalary();
        System.out.println("\nAfter Computing Salary:");
        emp.details();

        mgr.details();
        mgr.computeSalary();
        System.out.println("\nAfter Computing Salary:");
    }
}    