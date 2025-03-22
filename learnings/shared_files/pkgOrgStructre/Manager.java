package pkgOrgStructre;

public class Manager extends Employee {
    private int noOfTeams;
    private int noOfReportees;

    public Manager(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, int noOfTeams, int noOfReportees) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        this.noOfTeams = noOfTeams;
        this.noOfReportees = noOfReportees;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Manager Details:");
        System.out.println("Number of Teams: " + noOfTeams);
        System.out.println("Number of Reportees: " + noOfReportees);
    }

    @Override
    public void computeSalary() {
        setEmpSal(getEmpSal() * 8);
    }
}
