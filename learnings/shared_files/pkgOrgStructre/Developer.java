package pkgOrgStructre;

public class Developer extends Employee {
    private String nameOfTheTeam;
    private String nameOfManager;
    private String technologies;

    public Developer(int empId, String empNm, int empAge, String empPanCrd, String empAadharCrd, String empDept, double empSal, String empContactNbr, int empExp, String nameOfTheTeam, String nameOfManager, String technologies) {
        super(empId, empNm, empAge, empPanCrd, empAadharCrd, empDept, empSal, empContactNbr, empExp);
        this.nameOfTheTeam = nameOfTheTeam;
        this.nameOfManager = nameOfManager;
        this.technologies = technologies;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("Developer Details:");
        System.out.println("Team Name: " + nameOfTheTeam);
        System.out.println("Manager Name: " + nameOfManager);
        System.out.println("Technologies: " + technologies);
    }

    @Override
    public void computeSalary() {
        setEmpSal(getEmpSal() * 6);
    }
}
