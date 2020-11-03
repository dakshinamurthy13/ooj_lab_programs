import java.util.Scanner;
class Account{
    private String name;
    private int accountNumber;
    private String type;
    public Account(String name,int accountNumber,String type){
        this.name=name;
        this.accountNumber=accountNumber;
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getName(){
        return this.name;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getType(){
        return this.type;
    }
}
class Curr_acct extends Account{
    private double balance;
    private boolean checkBook;
    private static double minBalance;
    private static double serviceCharge;
    public static double getServiceCharge(){
        return serviceCharge;
    }
    public Curr_acct(String name,int accountNumber,String type,boolean checkBook){
        super(name,accountNumber,type);
        this.checkBook=checkBook;
        this.balance=0;
    }
    static{
        minBalance=1000.00;
        serviceCharge=5.00;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amt){
        this.balance+=amt;
    }
    public int withdraw(double amt){
        if(this.balance-amt<minBalance && this.balance-amt>0){
            this.balance-=serviceCharge*0.01*amt;
            this.balance-=amt;
            return 1;
        }if(this.balance-amt<0){
            return -1;
        }
        this.balance-=amt;
        return 2;
    }
}
class Sav_acct extends Account{
    private double balance;
    private static double interestRate;
    public Sav_acct(String name,int accountNumber,String type){
        super(name,accountNumber,type);
        this.balance=0;
    }
    static{
        interestRate=8.0;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double amt){
        this.balance+=amt;
    }
    public int withdraw(double amt){
        if(this.balance-amt<0){
            return -1;
        }
        this.balance-=amt;
        return 2;
    }
    public double calculateInterest(){
        double amt=(this.balance*(1.0+(interestRate*0.01)));
        double interest=amt-this.balance;
        this.balance=amt;
        return interest;
    }
}
class BankMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=s.next();
        System.out.println("ENter the account number");
        int accountNumber=s.nextInt();
        System.out.println("Enter the type");
        System.out.println("1.Savings");
        System.out.println("2.Current");
        int type=s.nextInt();
        if(type==2){
            System.out.println("Do u want a check book ?? y or n");
            String checkBookString=s.next();
            boolean checkBook;
            if(checkBookString=="y")
                checkBook=true;
            else
                checkBook=false;
            Curr_acct curr_acct=new Curr_acct(name,accountNumber,"Current",checkBook);
            int c;
            do{
                displayMenu(false);
                c=s.nextInt();
                double amt;
                switch(c){
                    case 1:
                        System.out.println("The balance in account is "+curr_acct.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter the amount to deposit");
                        amt=s.nextDouble();
                        curr_acct.deposit(amt);
                        System.out.println("The balance in account is "+curr_acct.getBalance());
                        break;
                    case 3:
                        System.out.println("Enter the amount to withdraw");
                        amt=s.nextDouble();
                        int exp=curr_acct.withdraw(amt);
                        if(exp==1)
                            System.out.println("An service charge of "+(Curr_acct.getServiceCharge()*0.01*amt)+" was deducted");
                        else if(exp==-1)
                            System.out.println("Insufficent Balance");
                        System.out.println("The balance in account is "+curr_acct.getBalance());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Please enter valid choice");
                }
            }while(c!=5);
        }else if(type==1){
            Sav_acct sav_acct=new Sav_acct(name,accountNumber,"Savings");
            int c;
            do{
                displayMenu(true);
                c=s.nextInt();
                double amt;
                switch(c){
                    case 1:
                        System.out.println("The balance in account is "+sav_acct.getBalance());
                        break;
                    case 2:
                        System.out.println("Enter the amount to deposit");
                        amt=s.nextDouble();
                        sav_acct.deposit(amt);
                        System.out.println("The balance in account is "+sav_acct.getBalance());
                        break;
                    case 3:
                        System.out.println("Enter the amount to withdraw");
                        amt=s.nextDouble();
                        int exp=sav_acct.withdraw(amt);
                        if(exp==-1)
                            System.out.println("Insufficent Balance");
                        System.out.println("The balance in account is "+sav_acct.getBalance());
                        break;
                    case 4:
                        System.out.println("The interest amount is "+sav_acct.calculateInterest());
                        System.out.println("The balance in account is "+sav_acct.getBalance());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Please enter valid choice");
                }
            }while(c!=5);
        }
    }
    public static void displayMenu(boolean isSavingsAccount){
        System.out.println("1.Check balance");
        System.out.println("2.Deposit Cash");
        System.out.println("3.Withdraw Cash");
        if(isSavingsAccount)
            System.out.println("4.Calculate Interest");
        System.out.println("5.Exit");
        System.out.println("Enter your choice");
    }
}