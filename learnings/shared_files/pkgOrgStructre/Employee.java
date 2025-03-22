package pkgOrgStructre;

public class Employee {
    private int empId;
    private String empNm;
    private int empAge;
    private String empPanCrd;
    private String empAadharCrd;
    private String empDept;
    private double empSal;
    private String empContactNbr;
    private int empExp;

    public Employee(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp) {
        this.empId = empId;
        this.empNm = empNm;
        this.empAge = empAge;
        this.empPanCrd = empPanCrd;
        this.empAadharCrd = empAadharCrd;
        this.empDept = empDept;
        this.empSal = empSal;
        this.empContactNbr = empContactNbr;
        this.empExp = empExp;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    public void details() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empNm);
        System.out.println("Age: " + empAge);
        System.out.println("PAN: " + empPanCrd);
        System.out.println("Aadhar: " + empAadharCrd);
        System.out.println("Department: " + empDept);
        System.out.println("Salary: " + empSal);
        System.out.println("Contact Number: " + empContactNbr);
        System.out.println("Experience: " + empExp);
    }

    public void computeSalary() {
        // Default computation if necessary
    }
}
