public class EmployeeInfo {
    private int employeeNum;
    private String firstName;
    private String lastName;
    private int sex;
    private int workLocation;
    private double deductionRate;

    public EmployeeInfo(int eN, String fN, String lN, int sX, int wL, double dR){
        employeeNum = eN;
        firstName = fN;
        lastName = lN;
        sex = sX;
        workLocation = wL;
        deductionRate = dR;
    }

    
    public int getEmployeeNum(){
        return employeeNum;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getSex(){
        return sex;
    }
    
    public int getWorkLocation(){
        return workLocation;
    }
    
    public double getDeductionRate(){
        return deductionRate;
    }
    
    public void setEmployeeNum(int eN){
        employeeNum = eN;
    }
    
    public void setFirstName(String fN){
        firstName = fN;
    }
    
    public void setLastName(String lN){
        lastName = lN;
    }
    
    public void setSex(int sX){
        sex = sX;
    }
    
    public void setWorkLocation(int wL){
        workLocation = wL;
    }
    
    public void setDeductionRate(double dR){
        deductionRate = dR;
    }
}
