import java.util.Scanner;
class TotalNumber{
    public static void main(String args[]){
        System.out.println("ENter the total number of numbers");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int tp=0,tn=0,tz=0;
        System.out.println("ENter the numbers of array");
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]>0)
                tp++;
            else if(a[i]==0)
                tz++;
            else    
                tn++;
        }
        System.out.println("The number of positive numbers in the array are "+tp);
        System.out.println("The number of negative numbers in the array are "+tn);
        System.out.println("The number of zeros in the array are "+tz);
    }
}