import java.util.Scanner;

class NatureOfRoots{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three quadratic numbers");
        double a=s.nextInt();
        double b=s.nextInt();
        double c=s.nextInt();
        double d=(b*b)-(4*a*c),r1,r2;
        if(d>0){
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots of quad "+a+","+b+","+c+" is:");
            System.out.println("The roots are real and they are "+r1+" "+r2);
        }else if(d==0){
            r1=(-b)/(2*a);
            System.out.println("The roots of quad "+a+","+b+","+c+" is:");
            System.out.println("The roots are real and equal and it is "+r1);
        }else
        System.out.println("The roots are not real");
    }
}