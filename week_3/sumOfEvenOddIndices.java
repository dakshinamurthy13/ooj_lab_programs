import java.util.Scanner;

class SumOfIndices{
    public static void main(String args[]){
        System.out.println("ENter the total number of numbers");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int so=0,se=0;
        System.out.println("ENter the numbers of array");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0)
                se+=a[i];
            else
                so+=a[i];
        }
        System.out.println("The sum of even numbers is "+se);
        System.out.println("The sum of odd numbers is "+so);
    }
}