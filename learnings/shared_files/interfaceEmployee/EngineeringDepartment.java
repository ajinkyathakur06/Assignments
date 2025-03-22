package assQuestion6;

public class EngineeringDepartment implements Employee {

	private String employeeName;
    private int employeeId;
    private static final double PAY_SCALE = 75000.0; // Example pay scale for engineering

    @Override
    public void enroll(String name, int id) {
        this.employeeName = name;
        this.employeeId = id;
        System.out.println("Employee " + name + " with ID " + id + " has been enrolled in the Engineering Department.");
    }

    @Override
    public void terminate(int id) {
        if (this.employeeId == id) {
            System.out.println("Employee with ID " + id + " has been terminated from the Engineering Department.");
            this.employeeName = null;
            this.employeeId = 0;
        } else {
            System.out.println("No employee found with ID " + id + " in the Engineering Department.");
        }
    }

    @Override
    public void calculatePay(int id) {
        if (this.employeeId == id) {
            System.out.println("Total salary for employee " + employeeName + " (ID: " + id + ") is: " + PAY_SCALE);
        } else {
            System.out.println("No employee found with ID " + id + " in the Engineering Department.");
        }
    }

}
