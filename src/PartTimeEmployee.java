public class PartTimeEmployee extends EmployeeInfo {
    private double hourlyWage;
    private int hoursPerWeek;
    private int weeksPerYear;

    public PartTimeEmployee(int eN, String fN, String lN, int sX, int wL, double dR, double hW, int hPW, int wPY){
        super(eN, fN, lN, sX, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
    }

    public double calcAnnualGrossIncome(){
        return (hourlyWage*hoursPerWeek*weeksPerYear);
    }

    public double calcAnnualNetIncome(){
        return (hourlyWage*hoursPerWeek*weeksPerYear)*(1-super.getDeductionRate());
    }
    
    public double getHourlyWage(){
        return hourlyWage;
    }
    
    public int getHoursPerWeek(){
        return hoursPerWeek;
    }
    
    public int getWeeksPerYear(){
        return weeksPerYear;
    }
    
    public void setHourlyWage(double hW){
        hourlyWage = hW;
    }
    
    public void setHoursPerWeek(int hPW){
        hoursPerWeek = hPW;
    }
    
    public void setWeeksPerYear(int wPY){
        weeksPerYear = wPY;
    }
}
