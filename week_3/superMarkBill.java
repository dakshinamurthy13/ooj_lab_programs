import java.util.Scanner;
class Bill{
    private int n;
    private double[] rate;
    private int[] quantity;
    private double total;
    private double totalAfterDis;
    void createArray(){
        rate=new double[n];
        quantity=new int[n];
    }
    void inputTotal(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total number of items");
        n=s.nextInt();
    }
    void inputQuantityAndRate(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the rate and quantity");
        for(int i=0;i<n;i++){
            rate[i]=s.nextDouble();
            quantity[i]=s.nextInt();
        }
    }
    void total(){
        double t=0;
        for(int i=0;i<n;i++){
            t+=rate[i]*quantity[i];
        }
        total=t;
    }
    void totalAfterDiscount(){
        if(total>=10000){
            totalAfterDis=total-total*0.05;
        }else if(total>=7500){
            totalAfterDis=total-total*0.03;
        }else if(total>=5000){
            totalAfterDis=total-total*0.02;
        }
    }
    void printBillAmount(){
        System.out.println("The bill amount is :"+total);
        System.out.println("After discount is :"+totalAfterDis);
    }
}
class BillMain{
    public static void main(String args[]){
        Bill b=new Bill();
        b.inputTotal();
        b.createArray();
        b.inputQuantityAndRate();
        b.total();
        b.totalAfterDiscount();
        b.printBillAmount();
    }
}