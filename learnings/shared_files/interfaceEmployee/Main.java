package assQuestion6;

public class Main {
	public static void main(String[] args) {
        // Create objects for both departments
        Employee productionEmployee = new ProductionDepartment();
        Employee engineeringEmployee = new EngineeringDepartment();

        // Enroll employees
        productionEmployee.enroll("John", 101);
        engineeringEmployee.enroll("Alice", 201);

        // Calculate pay for employees
        productionEmployee.calculatePay(101);
        engineeringEmployee.calculatePay(201);

        // Terminate employees
        productionEmployee.terminate(101);
        engineeringEmployee.terminate(201);
    }
}
