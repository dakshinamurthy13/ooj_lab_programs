import java.util.Scanner;
class GenericExample<T,U>{
    private T obj1;
    private U obj2;
    public GenericExample(T obj1,U obj2){
        System.out.println("Passing "+obj1.getClass().getName()+" and "+obj2.getClass().getName()+" to the generic class");
        this.obj1=obj1;
        this.obj2=obj2;
    }
    public void printGeneric(){
        System.out.println("Printing the two objects of the class\nObject-1:"+obj1.getClass().getName()+"\nObject-2:"+obj2.getClass().getName());
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class GenericMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=s.next();
        System.out.println("Enter the age");
        int age=s.nextInt();
        GenericExample<String,Integer> gen1=new GenericExample<String,Integer>(name,age);
        System.out.println("Enter the Cgpa");
        double cpga=s.nextDouble();
        System.out.println("Enter the grade");
        char grade=s.next().charAt(0);
        GenericExample<Double,Character> gen2=new GenericExample<Double,Character>(cpga,grade);
        gen1.printGeneric();
        gen2.printGeneric();
    }
}