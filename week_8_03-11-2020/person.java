import java.util.Scanner;
class Person{
    private String name;
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
class Employee extends Person{
    private String empId;
    public Employee(String empId,String name){
        super(name);
        this.empId=empId;
    }
    public String getEmpId(){
        return this.empId;
    }
}
class Student extends Person{
    private String studentId;
    public Student(String studentId,String name){
        super(name);
        this.studentId=studentId;
    }
    public String getStudentId(){
        return this.studentId;
    }
}
class Teaching extends Employee{
    private String department;
    public Teaching(String department,String empId,String name){
        super(empId,name);
        this.department=department;
    }
    public String toString(){
        return ("Teacher Name: "+super.getName()+"\tTeacher Id: "+super.getEmpId()+"\tTeacher Department :"+this.department);
    }
}
class NonTeaching extends Employee{
    private String work;
    public NonTeaching(String work,String empId,String name){
        super(empId,name);
        this.work=work;
    }
    public String toString(){
        return ("Employee Name: "+super.getName()+"\tEmployee Id: "+super.getEmpId()+"\tEmployee Work :"+this.work);
    }
}
class UG extends Student{
    private String school;
    public UG(String school,String studentId,String name){
        super(studentId,name);
        this.school=school;
    }
    public String toString(){
        return ("UG Student\t Name: "+super.getName()+"\tStudent Id: "+super.getStudentId()+"\tSchool Studied : "+this.school);
    }
}
class PG extends Student{
    private String college;
    public PG(String college,String studentId,String name){
        super(studentId,name);
        this.college=college;
    }
    public String toString(){
        return ("UG Student\t Name: "+super.getName()+"\tStudent Id: "+super.getStudentId()+"\tCollege Studied : "+this.college);
    }
}
class PersonMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the deatils of Teacher");
        System.out.print("Name : ");
        String name=s.next();
        System.out.print("Employee Id : ");
        String id=s.next();
        System.out.print("Department : ");
        String dept=s.next();
        Teaching t=new Teaching(dept,id,name);
        System.out.println("Enter the deatils of Non-Teaching Staff");
        System.out.print("Name : ");
        name=s.next();
        System.out.print("Employee Id : ");
        id=s.next();
        System.out.print("Work : ");
        String work=s.next();
        NonTeaching nt=new NonTeaching(work,id,name);
        System.out.println("Enter the deatils of UG Student");
        System.out.print("Name : ");
        name=s.next();
        System.out.print("Student Id : ");
        id=s.next();
        System.out.print("School previously studied : ");
        String school=s.next();
        UG u=new UG(school,id,name);
        System.out.println("Enter the deatils of PG Student");
        System.out.print("Name : ");
        name=s.next();
        System.out.print("Student Id : ");
        id=s.next();
        System.out.print("College previously studied : ");
        String college=s.next();
        PG p=new PG(college,id,name);
        System.out.println(t);
        System.out.println(nt);
        System.out.println(u);
        System.out.println(p);
    }
}