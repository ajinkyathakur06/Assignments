package pkgOrgStructre;

public class Tester extends Employee {
    private String nameOfTheTeam;
    private String nameOfManager;
    private String testingType;

    public Tester(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, String nameOfTheTeam, String nameOfManager, String testingType) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        this.nameOfTheTeam = nameOfTheTeam;
        this.nameOfManager = nameOfManager;
        this.testingType = testingType;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Tester Details:");
        System.out.println("Team Name: " + nameOfTheTeam);
        System.out.println("Manager Name: " + nameOfManager);
        System.out.println("Testing Type: " + testingType);
    }

    @Override
    public void computeSalary() {
        setEmpSal(getEmpSal() * 5);
    }
}
