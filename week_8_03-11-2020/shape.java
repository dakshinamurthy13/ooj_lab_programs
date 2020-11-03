import java.util.Scanner;
abstract class Shapes{
    private float a;
    private float b;
    public float getA(){
        return this.a;
    }
    public float getB(){
        return this.b;
    }
    public Shapes(float a,float b){
        this.a=a;
        this.b=b;
    }
    public Shapes(float a){
        this.a=a;
    }
    public abstract void printArea();
}
class Rectangle extends Shapes{
    public Rectangle (float a,float b){
        super(a,b);
    }
    public void printArea(){
        float l=super.getA();
        float b=super.getB();
        System.out.println("The area Rectangle of is "+(l*b));
    }
}
class Triangle extends Shapes{
    public Triangle(float a,float b){
        super(a,b);
    }
    public void printArea(){
        float h=super.getA();
        float b=super.getB();
        System.out.println("The area Triangle of is "+((h*b)/2));
    }
}
class Circle extends Shapes{
    public Circle(float a){
        super(a);
    }
    public void printArea(){
        float r=super.getA();
        System.out.println("The area Circle of is "+(Math.PI*r*r));
    }
}
class ShapesMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the length and breadth of the rectangle");
        float a=s.nextFloat();
        float b=s.nextFloat();
        Rectangle r=new Rectangle(a,b);
        System.out.println("Enter the base and height of the triangle");
        a=s.nextFloat();
        b=s.nextFloat();
        Triangle t=new Triangle(a,b);
        System.out.println("Enter the radius of circle");
        a=s.nextFloat();
        Circle c=new Circle(a);
        r.printArea();
        t.printArea();
        c.printArea();
    }
}