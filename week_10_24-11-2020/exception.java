import java.util.Scanner;
class AgeExcepetion extends Exception{
    private String exceptionMessage;
    public AgeExcepetion(String exceptionMessage){
        this.exceptionMessage=exceptionMessage;
    }
    public String toString(){
        return (this.exceptionMessage);
    }
}
class Father{
    private String father_name;
    private int father_age;
    public Father(String father_name,int father_age){
        this.father_name=father_name;
        this.father_age=father_age;
    }
    public String getFatherName(){
        return this.father_name;
    }
    public int getFatherAge(){
        return this.father_age;
    }
}
class Son extends Father{
    private String son_name;
    private int son_age;
    public Son(String father_name,int father_age,String son_name,int son_age)throws AgeExcepetion{
        super(father_name,father_age);
        this.son_age=son_age;
        this.son_name=son_name;
        if(father_age<1||son_age<0)
            throw new AgeExcepetion("Invalid age input.\nAge cannot be negative.");
        if(father_age<=son_age)
            throw new AgeExcepetion("Invalid son age.\nFathers age cannot be less than son.");
    }
    public String toString(){
        return ("Father name: "+super.getFatherName()+"\nFather Age : "+super.getFatherAge()+"\nSon Name : "+this.son_name+"\nSon Age : "+this.son_age);
    }
}
class AgeMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of father");
        String father_name=s.next();
        System.out.println("Enter the age of father");
        int father_age=s.nextInt();
        System.out.println("Enter the name of son");
        String son_name=s.next();
        System.out.println("Enter the age of son");
        int son_age=s.nextInt();
        try{
            Son son=new Son(father_name,father_age,son_name,son_age);
            System.out.println(son);
        }
        catch(AgeExcepetion e){
            System.out.println(e);
        }
    }
}