import java.util.Scanner;
class Split{
    private int n;
    private int[] a;
    private int[] b;
    private int[] c;
    private int countC=-1;
    private int countB=-1;
    public void inputTotal(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total number of elements in array");
        n=s.nextInt();
        a=new int[n];
        b=new int[n];
        c=new int[n];
    }
    public void inputArray(){
        System.out.println("Enter the elements of array");
        Scanner s=new Scanner(System.in);
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
    }
    public void spiltArray(){
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                countC++; 
                c[countC]=a[i];
            }else{
                countB++;
                b[countB]=a[i];
            }
        }
    }
    public void printOdd(){
        System.out.println("The Odd numbers in array are :");
        for(int i=0;i<=countB;i++)
            System.out.print(b[i]+"\t");
        System.out.println();
    }
    public void printEven(){
        System.out.println("The even numbers in array are :");
        for(int i=0;i<=countC;i++)
            System.out.print(c[i]+"\t");
        System.out.println();
    }
    public void printEvenExtra(){
        int sum=0;
        int max=c[0],min=c[0];
        float avg =0;
        for(int i=0;i<=countC;i++){
            sum+=c[i];
            if(max<=c[i])
                max=c[i];
            if(min>=c[i])
                min=c[i];
        }
        avg=sum/countC;
        System.out.println("The sum of even numbers is :"+sum);
        System.out.println("The average of even numbers is:"+avg);
        System.out.println("The max of even numbers is:"+max);
        System.out.println("The min of even numbers is:"+min);
    }

}
class SplitMain{
    public static void main(String args[]){
        Split s=new Split();
        s.inputTotal();
        s.inputArray();
        s.spiltArray();
        s.printEven();
        s.printOdd();
        s.printEvenExtra();
    }
}