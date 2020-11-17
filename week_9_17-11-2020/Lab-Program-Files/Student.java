package cie;
public class Student{
    private String name;
    private String usn;
    private int sem;
    public Student(String name,String usn,int sem){
        this.name=name;
        this.usn=usn;
        this.sem=sem;
    }
    public String getStudentDetails(){
        return "Name : "+this.name+"\nUSN : "+this.usn+"\nSemester : "+this.sem;
    }
}