import java.util.Scanner;
class Age{
    private int years;
    private int months;

    public int getYears(){
        return this.years;
    }
    public int getMonths(){
        return this.months;
    }
    public Age(int years,int months){
        this.years=years;
        this.months=months;
    }
    public String toString(){
        return ("Age \nYears:"+this.years+"\tMonths : "+this.months);
    }
}
class AgeMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Age[] a=new Age[2];
        System.out.println("Enter the details of Person");
        String[] p=new String[2];
        for(int i=0;i<2;i++){
            System.out.println("Name :");
            p[i]=s.next();
            System.out.println("Years :");
            int years=s.nextInt();
            System.out.println("Months :");
            int months=s.nextInt();
            a[i]=new Age(years,months);
        }
        if(a[0].getYears()>a[1].getYears()){
            System.out.println("The older person is");
            System.out.println(p[0]);
            System.out.println(a[0]);
        }else if(a[0].getYears()==a[1].getYears()){
            if(a[0].getMonths()>a[1].getMonths()){
                System.out.println("The older person is");
                System.out.println(p[0]);
                System.out.println(a[0]);
            }else{
                System.out.println("The older person is");
                System.out.println(p[1]);
                System.out.println(a[1]);
            }
        }else{
            System.out.println("The older person is");
            System.out.println(p[1]);
            System.out.println(a[1]);
        }
    }
}