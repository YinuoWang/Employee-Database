public class FullTimeEmployee extends EmployeeInfo {
    private double yearlySalary;

    public FullTimeEmployee(int eN, String fN, String lN, int sX, int wL, double dR, double yS){
        super(eN, fN, lN, sX, wL, dR);
        yearlySalary = yS;
    }

    public double calcAnnualGrossIncome(){
        return yearlySalary;
    }

    public double calcAnnualNetIncome(){
        return yearlySalary*(1-super.getDeductionRate());
    }
    
    public void setYearlySalary(double yS){
        yearlySalary = yS;
    }
    
    public double getYearlySalary(){
        return yearlySalary;
    }
}
