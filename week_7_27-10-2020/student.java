import java.util.Scanner;
class Student{
    private String Usn;
    private String name;
    private int sem;
    public void setStudent(String Usn,String name,int sem){
        this.name=name;
        this.Usn=Usn;
        this.sem=sem;
    }
    public void printStudent(){
        System.out.println("Name :"+this.name+" USN: "+this.Usn+" Semester: "+this.sem);
    }
}
class Test extends Student{
    private int noOfSubjects;
    private float[] marks;
    private int[] credits;
    public void setTest(int noOfSubjects){
        Scanner s=new Scanner(System.in);
        this.noOfSubjects=noOfSubjects;
        marks=new float[noOfSubjects];
        credits=new int[noOfSubjects];
        System.out.println("Enter the marks along with credits");
        for(int i=0;i<noOfSubjects;i++){
            System.out.print((i+1)+".");
            marks[i]=s.nextFloat();
            credits[i]=s.nextInt();
        }
    }
    public void printTest(){
        System.out.println("Marks and credits of each subject is:");
        for(int i=0;i<noOfSubjects;i++){
            System.out.println((i+1)+". Marks : "+marks[i]+"  Credits: "+credits[i]);
        }
    }
    public float[] getCieMarks(){
        return this.marks;
    }
    public int[] getCredits(){
        return this.credits;
    }
    public int getNoOfSubjects(){
        return this.noOfSubjects;
    }
}
class Exam extends Test{
    private float[] seeMarks;
    public void setExam(){
        Scanner s=new Scanner(System.in);
        seeMarks=new float[super.getNoOfSubjects()];
        System.out.println("Enter the SEE marks of corresponding subjects");
        for(int i=0;i<seeMarks.length;i++){
            System.out.print((i+1)+".");
            seeMarks[i]=s.nextFloat();
        }
    }
    public void printExam(){
        System.out.println("The marks of Student in SEE is:");
        for(int i=0;i<seeMarks.length;i++){
            System.out.println((i+1)+". "+seeMarks[i]);
        }
    }
    public float[] getSeeMarks(){
        return seeMarks;
    }
}
class Result extends Exam{
    private String[] grade;
    private float sgpa;
    public void setResult(){
        grade=new String[super.getNoOfSubjects()];
        float[] cie=super.getCieMarks();
        float[] see=super.getSeeMarks();
        int[] credits=super.getCredits();
        float totalGradePoints=0;
        int totalCredits=0;
        for(int i=0;i<cie.length;i++){
            float sum=cie[i]+see[i]/2;
            if(sum>90)
                grade[i]="S";
            else if(sum>80)
                grade[i]="A";
            else if(sum>=70)
                grade[i]="B";
            else if(sum>=60)
                grade[i]="C";
            else if(sum>=50)
                grade[i]="D";
            else if(sum>=40)
                grade[i]="E";
            else
                grade[i]="F";
            switch(grade[i]){
                case "S":
                    totalGradePoints+=10*credits[i];
                    break;
                case "A":
                    totalGradePoints+=9*credits[i];
                    break;
                case "B":
                    totalGradePoints+=8*credits[i];
                    break;
                case "C":
                    totalGradePoints+=7*credits[i];
                    break;
                case "D":
                    totalGradePoints+=6*credits[i];
                    break;
                case "E":
                    totalGradePoints+=5*credits[i];
                    break;
                case "F":
                    totalGradePoints+=0;
                    break;
            }
            totalCredits+=credits[i];
        }
        sgpa=totalGradePoints/totalCredits;
    }
    public void printResult(){
        System.out.println("The student scored a grade on the following courses");
        for(int i=0;i<grade.length;i++)
            System.out.println((i+1)+"."+grade[i]);
        System.out.println("The student scored as SPGA of "+sgpa);
    }
}
class StudentMain{
    public static void main(String args[]){
        System.out.println("Enter the number of students :");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Result[] r=new Result[n];
        for(int i=0;i<n;i++){
            r[i]=new Result();
            System.out.println("Enter the name of the student");
            String name=s.next();
            System.out.println("Enter the USN of the student");
            String usn=s.next();
            System.out.println("Enter the Semester of the student");
            int sem=s.nextInt();
            r[i].setStudent(name,usn,sem);
            System.out.println("Enter the number of courses");
            int noOfSubjects=s.nextInt();
            r[i].setTest(noOfSubjects);
            r[i].setExam();
            r[i].setResult();
        }
        System.out.println("Printing details of students");
        for(int i=0;i<n;i++){
            r[i].printStudent();
            r[i].printTest();
            r[i].printExam();
            r[i].printResult();
        }
    }
}