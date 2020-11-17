import cie.*;
import see.*;
import java.util.Scanner;
class StudentMain{
    public static void main(String args[]){
        System.out.println("Enter the number of students");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        cie.Internals internals[]=new cie.Internals[n];
        see.Externals externals[]=new see.Externals[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the student");
            String name=scanner.next();
            System.out.println("Enter the Usn of the student");
            String usn=scanner.next();
            System.out.println("Enter the Sem of the student");
            int sem=scanner.nextInt();
            float[] cieMarks=new float[5];
            System.out.println("Enter the internal marks of the student");
            for(int j=0;j<5;j++){
                System.out.print((j+1)+".");
                cieMarks[j]=scanner.nextFloat();
            }
            float[] seeMarks=new float[5];
            System.out.println("Enter the external marks of the student");
            for(int j=0;j<5;j++){
                System.out.print((j+1)+".");
                seeMarks[j]=scanner.nextFloat();
            }
            internals[i]=new cie.Internals(cieMarks,name,usn,sem);
            externals[i]=new see.Externals(seeMarks,name,usn,sem);
        }
        for(int i=0;i<n;i++){
            float see[]=externals[i].getMarks();
            float cie[]=internals[i].getCieMarks();
            System.out.println(internals[i].getStudentDetails());
            for(int j=0;j<5;j++){
                System.out.println("Cie : "+cie[j]);
                System.out.println("SEE : "+see[j]);
                System.out.println("Total "+(j+1)+". "+(cie[j]+(see[j]/2)));
            }
        }
    }
}