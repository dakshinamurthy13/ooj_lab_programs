import java.util.Scanner;

class StudentDetails{
    private String name;
    private String USN;
    private float[] marks;
    private float[] credits;
    private int numberOfSubjects;

    StudentDetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        numberOfSubjects=s.nextInt();
        marks=new float[numberOfSubjects];
        credits=new float[numberOfSubjects];
    }
    public void inputStudentDetails(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of student");
        name=s.nextLine();
        System.out.println("Enter the student USN");
        USN=s.nextLine();
        System.out.println("Enter the credits followed by marks in each subject");
        for(int i=0;i<numberOfSubjects;i++){
            System.out.print((i+1)+".");
            credits[i]=s.nextFloat();
            marks[i]=s.nextFloat();
        }
    }
    public void displayStudentDetails(){
        System.out.println("Name of student is :"+name);
        System.out.println("USN of student is :"+USN);
        System.out.println("The marks and credits of each subject are:");
        for(int i=0;i<numberOfSubjects;i++)
            System.out.println((i+1)+". Marks: "+marks[i]+" Credits: "+credits[i]);
    }
    public void calculateSPGA(){
        float totalCredits=0;
        float totalObtainedCredits=0;
        for(int i=0;i<numberOfSubjects;i++){
            totalCredits+=credits[i];
            if(marks[i]>=90)
                totalObtainedCredits+=10*credits[i];
            else if(marks[i]>=80)
                totalObtainedCredits+=9*credits[i];
            else if(marks[i]>=70)
                totalObtainedCredits+=8*credits[i];
            else if(marks[i]>=60)
                totalObtainedCredits+=7*credits[i];
            else if(marks[i]>=50)
                totalObtainedCredits+=5*credits[i];
            else if(marks[i]>=40)
                totalObtainedCredits+=4*credits[i];
        }
        float SGPA=totalObtainedCredits/totalCredits;
        System.out.println("The SGPA is "+SGPA);
    }
}
class StudentMain{
    public static void main(String args[]){
        StudentDetails s=new StudentDetails();
        s.inputStudentDetails();
        s.displayStudentDetails();
        s.calculateSPGA();
    }
}