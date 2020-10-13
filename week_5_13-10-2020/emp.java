import java.util.Scanner;
class Employee{
    private String empName;
    private int empId;
    private double empGross;
    private double empBasic;
    private double empHra;
    private double empDa;
    private double empIt;
    private int empNoHrs;
    public Employee(String empName,int empId,double empBasic,double empHra,double empDa,double empIt,int empNoHrs){
        this.empName=empName;
        this.empId=empId;
        this.empBasic=empBasic;
        this.empHra=empHra;
        this.empIt=empIt;
        this.empDa=empDa;
        this.empNoHrs=empNoHrs;
        this.empGross= empBasic + empBasic*empHra + empBasic*empDa - empBasic*empIt;
        if(empNoHrs>200){
            int noOfExtraHours=empNoHrs-200;
            this.empGross+=noOfExtraHours*100;
        }else{
            int noOfHours=empNoHrs-200;
            this.empGross-=noOfHours*100;
        }
    }
    public String toString(){
        return ("\nEmployee name: "+empName+"\nID : "+empId+"\nEmpolyee Salary : "+empGross);
    }
}
class EmployeeMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the details of employee");
        System.out.println("Name :");
        String empName=s.next();
        System.out.println("ID :");
        int empId=s.nextInt();
        System.out.println("Base Salary :");
        double empBasic=s.nextDouble();
        System.out.println("Hra :");
        double empHra=s.nextDouble();
        System.out.println("Da :");
        double empDa=s.nextDouble();
        System.out.println("It :");
        double empIt=s.nextDouble();
        System.out.println("No of hours worked :");
        int empNoHrs=s.nextInt();
        Employee e=new Employee(empName,empId,empBasic,empHra,empDa,empIt,empNoHrs);
        System.out.println(e);
    }
}